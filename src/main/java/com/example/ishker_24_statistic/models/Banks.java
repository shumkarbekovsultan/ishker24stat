package com.example.ishker_24_statistic.models;


import jakarta.persistence.*;

@Entity
@Table(name = "banks")
public class Banks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 255)
    private String nameofbanks;

    @Column(length = 20)
    private String bic;

    @ManyToOne
    @JoinColumn(name = "status", referencedColumnName = "id")
    private Status status;

    // Getters and Setters

}
