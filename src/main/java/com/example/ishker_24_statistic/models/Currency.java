package com.example.ishker_24_statistic.models;


import jakarta.persistence.*;

@Entity
@Table(name = "currency")
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 100)
    private String code;

    @Column(length = 255)
    private String nameofcurrency;

    @Column(length = 30)
    private String symbol;

    @ManyToOne
    @JoinColumn(name = "status", referencedColumnName = "id")
    private Status status;

    @Column
    private Double exchangerate;

    // Getters and Setters
}
