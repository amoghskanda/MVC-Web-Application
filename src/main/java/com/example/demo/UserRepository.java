package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
    // Custom query to retrieve a user by name
    User findByName(String name);
    
    // Custom query to retrieve a user by location
    User findByLocation(String location);
    
    // Custom query to retrieve a user by birthdate
    User findByBirthdate(String birthdate);
    
    // Custom query to retrieve a list of users by location
    List<User> findAllByLocation(String location);
}
