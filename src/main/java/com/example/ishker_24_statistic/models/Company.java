package com.example.ishker_24_statistic.models;


import jakarta.persistence.*;



@Entity
@Table(name = "company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Long inn;

    @ManyToOne
    @JoinColumn(name = "status", referencedColumnName = "id")
    private Status status;

    @ManyToOne
    @JoinColumn(name = "status_registration", referencedColumnName = "id")
    private StatusRegistrationGns statusRegistration;

    @ManyToOne
    @JoinColumn(name = "account", referencedColumnName = "id")
    private Accounts account;

    @Column
    private Integer kkm;

    @Column
    private Boolean isipbeforeregistration;

    // Getters and Setters
}
