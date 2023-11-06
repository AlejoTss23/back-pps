package com.pps.pps.modelos;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Loguin implements Serializable  {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(nullable = false, updatable = false)
private Long id;

@Column(name = "user", nullable = false, length = 60)
    private String user;

    @Column(name = "password", nullable = false, length = 60)
    private Long password;
   

    public Loguin() {
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getUser() {
        return user;
    }


    public void setUser(String user) {
        this.user = user;
    }


    public Long getPassword() {
        return password;
    }


    public void setPassword(Long password) {
        this.password = password;
    }
}

