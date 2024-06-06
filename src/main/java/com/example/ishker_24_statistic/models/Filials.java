package com.example.ishker_24_statistic.models;


import jakarta.persistence.*;

@Entity
@Table(name = "filials")
public class Filials {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 255)
    private String nameoffilials;

    @Column
    private String address;

    @ManyToOne
    @JoinColumn(name = "status", referencedColumnName = "id")
    private Status status;

    // Getters and Setters
}
