package com.example.model;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="username")
    private String username;
    @Column(name="password")
    private String password;


    public String getName() {
        return username;
    }

    public void setName() {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void getPassword(String password) {
        this.password = password;
    }
}
