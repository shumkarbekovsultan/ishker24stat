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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameofrole() {
        return nameofrole;
    }

    public void setNameofrole(String nameofrole) {
        this.nameofrole = nameofrole;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

