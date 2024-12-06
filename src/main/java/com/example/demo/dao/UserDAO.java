package com.example.demo.dao;

import com.example.demo.entity.User;

import java.util.List;

public interface UserDAO {
    List<User> allUsers();
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(Integer id);
}
