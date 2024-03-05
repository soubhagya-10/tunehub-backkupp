package com.kodnest.tunehub.repository;

import com.kodnest.tunehub.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, String> {

  public User findByEmail(String email);
	
    
}
