package com.example.demo.dao;

import com.example.demo.entity.Role;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDAOImpl implements RoleDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Role findByRoleName(String name) {
        return entityManager.createQuery("SELECT r FROM Role r WHERE r.roleName = :name", Role.class)
                .setParameter("name", name)
                .getSingleResult();
    }
    @Override
    public void saveRole(Role role) {
        entityManager.persist(role);
    }
}
