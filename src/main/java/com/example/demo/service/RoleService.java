package com.example.demo.service;

import com.example.demo.entity.Role;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface RoleService {
    Optional<Role> findRoleByName(String name);
    List<Role> findAllRoles();
    Role saveRole(Role role);
}
