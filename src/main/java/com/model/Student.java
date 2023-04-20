package com.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="person")
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String name;
private String birthdate;
private String location;

public Student(){
    
}

public Student(String name, String birthdate, String location) {
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

    

