package com.example.ishker_24_statistic.models;


import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
@Entity
@Table(name = "statusoftransactions")
public class StatusOfTransactions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 255)
    private String nameofstatus;

    @Column
    private String description;

    @Column
    private java.sql.Date createdat;

    @Column
    private java.sql.Date updatedat;

    // Getters and Setters
}

