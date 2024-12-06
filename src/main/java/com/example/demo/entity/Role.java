package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import java.util.Set;

@Setter
@Getter
@Entity
@Data
@Table(name = "roles")
public class Role implements GrantedAuthority{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name", unique = true, nullable = false)
    private String name;

    public Role() {}

    public Role(Integer id, String name) {}

    public Role(Integer id) {}

    @ManyToMany(mappedBy = "roles")
    private Set <User> users;

    @Override
    public String getAuthority() {
        return getRoleName();
    }

    public String getRoleName() {
        return name;
    }

}
