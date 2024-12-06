package com.example.demo.controller;

import com.example.demo.dao.RoleDAO;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AdminController {
    private final UserService userService;

    public AdminController(UserService userService) {
        this.userService = userService;
    }

//    @GetMapping("/user")
//    public ModelAndView showAll() {
//        List <User> users = userService.allUsers();
//        ModelAndView modelAndView = new ModelAndView("user");
//        modelAndView.addObject("users", users);
//        return modelAndView;
//    }
}