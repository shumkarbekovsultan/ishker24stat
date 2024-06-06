package com.example.ishker_24_statistic.models;


import jakarta.persistence.*;

@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 255)
    private String nameofrole;

    @Column
    private String description;

    // Getters and Setters
}

