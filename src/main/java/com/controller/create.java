// package com.controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.jdbc.core.JdbcTemplate;
// import org.springframework.stereotype.Controller;
// import org.springframework.stereotype.Repository;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestParam;

// @Controller
// public class create {
    
//     @Autowired
//     private JdbcTemplate jdbcTemplate;

//     @PostMapping("/sample")
//     public String createPage(@RequestParam("id") int id, @RequestParam("name") String name,
//                              @RequestParam("birthdate") String birthdate, @RequestParam("location") String location) {

//         String query = "INSERT INTO my_table (id, name, birthdate, location) VALUES (?, ?, ?, ?)";
//         jdbcTemplate.update(query, id, name, birthdate, location);

//         return "success"; // return the name of the success page
//     }
// }
