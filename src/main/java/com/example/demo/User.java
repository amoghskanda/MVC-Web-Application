package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



// @Entity
// @Table
// public class Employee {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private int id;
//     @Column(name = "emp_name")
//     private String name;
//     @Column
//     private float salary;

//     public Employee(){
        
//     }

//     public Employee(String name, float salary) {
//         this.name = name;
//         this.salary = salary;
//     }

//     public int getId() {
//         return id;
//     }

//     public void setId(int id) {
//         this.id = id;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public float getSalary() {
//         return salary;
//     }

//     public void setSalary(float salary) {
//         this.salary = salary;
//     }

    
// }
@Entity
public class User {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String name;
private String birthdate;
private String location;

public User(){
    
}

public User(String name, String birthdate, String location) {
    this.name = name;
    this.birthdate = birthdate;
    this.location = location;
}

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getBirthdate() {
    return birthdate;
}

public void setBirthdate(String birthdate) {
    this.birthdate = birthdate;
}

public String getLocation() {
    return location;
}

public void setLocation(String location) {
    this.location = location;
}
}

