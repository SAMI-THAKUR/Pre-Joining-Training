package com.example.model;

public class User {
    private int id;
    private String name;
    private String email;
    private String password;
    private Gender gender;
    private Department department;

    // No-arg constructor
    public User() {
    }

    // Constructor for name and email
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Full constructor
    public User(String name, String email, String password, Gender gender, Department department) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.department = department;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Gender getGender() {
        return gender;
    }

    public Department getDepartment() {
        return department;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    // toString()
    @Override
    public String toString() {
        return "User " + "id=" + id + ", name='" + name + '\'' + ", email='" + email + '\'' + ", gender=" + gender + ", department=" + department;
    }
}

