package com.cherrow.spring.controller;

import com.cherrow.spring.domain.User;
import com.cherrow.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/hello")
    public String sayHello(){
        return userService.sayHello();
    }

    @PostMapping("/new-user")
    public User addUser(@RequestParam String name, @RequestParam int age){
        return userService.createUser(name, age);
    }
}
