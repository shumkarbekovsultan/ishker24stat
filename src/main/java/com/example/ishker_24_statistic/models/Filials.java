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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameoffilials() {
        return nameoffilials;
    }

    public void setNameoffilials(String nameoffilials) {
        this.nameoffilials = nameoffilials;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
