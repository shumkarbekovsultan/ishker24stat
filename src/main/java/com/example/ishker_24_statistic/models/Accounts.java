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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "status", referencedColumnName = "id")
    private Status status;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "currency", referencedColumnName = "id")
    private Currency currency;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "bankid", referencedColumnName = "id")
    private Banks bank;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "filialid", referencedColumnName = "id")
    private Filials filial;

    // Getters and Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getNumberofschet() {
        return numberofschet;
    }

    public void setNumberofschet(Double numberofschet) {
        this.numberofschet = numberofschet;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Banks getBank() {
        return bank;
    }

    public void setBank(Banks bank) {
        this.bank = bank;
    }

    public Filials getFilial() {
        return filial;
    }

    public void setFilial(Filials filial) {
        this.filial = filial;
    }
}
