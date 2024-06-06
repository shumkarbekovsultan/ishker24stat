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
}
