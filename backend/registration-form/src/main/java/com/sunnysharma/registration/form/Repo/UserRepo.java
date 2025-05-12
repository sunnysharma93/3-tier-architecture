package com.sunnysharma.registration.form.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunnysharma.registration.form.Entity.User;

public interface UserRepo extends JpaRepository<User , Long>{

    
} 