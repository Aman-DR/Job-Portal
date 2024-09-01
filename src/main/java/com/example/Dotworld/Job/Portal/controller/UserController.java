package com.example.Dotworld.Job.Portal.controller;

import com.example.Dotworld.Job.Portal.entity.User;
import com.example.Dotworld.Job.Portal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    UserService userservice;

    @PostMapping("/createuser")
    public String createUser(@RequestBody User user){

        return userservice.createUser(user) ;
    }

}
