package com.example.demo.dao;

import com.example.demo.entity.Role;

public interface RoleDAO {
    Role findByRoleName(String name);
    void saveRole(Role role);
}
