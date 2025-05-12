package com.sunnysharma.registration.form.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunnysharma.registration.form.Entity.User;
import com.sunnysharma.registration.form.services.UserService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user){
          User savedUser = userService.registerUser(user);
          return ResponseEntity.ok(savedUser);


    }

}