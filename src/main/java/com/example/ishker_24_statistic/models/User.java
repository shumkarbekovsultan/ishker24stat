package com.example.ishker_24_statistic.models;

import jakarta.persistence.*;

@Entity
@Table(name = "User")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private Long inn;

    @Column(nullable = false, length = 255)
    private String username;

    @Column(length = 255)
    private String firstname;

    @Column(length = 255)
    private String lastname;

    @ManyToOne
    @JoinColumn(name = "role", referencedColumnName = "id")
    private  Role role;

    @ManyToOne
    @JoinColumn(name = "status", referencedColumnName = "id")
    private  Status status;
    @Column(nullable = false, length = 255)
    private String pass;

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getInn() {
        return inn;
    }

    public void setInn(Long inn) {
        this.inn = inn;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
