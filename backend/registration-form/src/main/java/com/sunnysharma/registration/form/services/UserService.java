package com.sunnysharma.registration.form.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunnysharma.registration.form.Entity.User;
import com.sunnysharma.registration.form.Repo.UserRepo;

@Service
public class UserService {

    @Autowired
 private UserRepo userRepo;

 public User registerUser(User user){
    return userRepo.save(user);
 }
    
}
