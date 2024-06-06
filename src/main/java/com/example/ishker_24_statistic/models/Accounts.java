package com.example.ishker_24_statistic.models;



import jakarta.persistence.*;


@Entity
@Table(name = "accounts")
public class Accounts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Double numberofschet;

    @Column
    private Double balance;

    @ManyToOne
    @JoinColumn(name = "status", referencedColumnName = "id")
    private Status status;

    @ManyToOne
    @JoinColumn(name = "currency", referencedColumnName = "id")
    private Currency currency;

    @ManyToOne
    @JoinColumn(name = "bankid", referencedColumnName = "id")
    private Banks bank;

    @ManyToOne
    @JoinColumn(name = "filialid", referencedColumnName = "id")
    private Filials filial; // Изменение типа поля на Filial

    // Getters and Setters
}

