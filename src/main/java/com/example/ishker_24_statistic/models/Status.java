package com.example.ishker_24_statistic.models;


import jakarta.persistence.*;

@Entity
@Table(name = "status")
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 255)
    private String nameofstatus;

    // Getters and Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatusName() {
        return nameofstatus;
    }

    public void setStatusName(String statusName) {
        this.nameofstatus = statusName;
    }
}
