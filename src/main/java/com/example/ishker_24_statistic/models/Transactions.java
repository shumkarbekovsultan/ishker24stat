package com.example.ishker_24_statistic.models;

import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;


@Entity
@Table(name = "transactions")
public class Transactions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "accountidFrom", referencedColumnName = "id")
    private Accounts accountFrom;

    @ManyToOne
    @JoinColumn(name = "accountidTo", referencedColumnName = "id")
    private Accounts accountTo;

    @ManyToOne
    @JoinColumn(name = "transactiontype", referencedColumnName = "id")
    private TransactionType transactionType;

    @ManyToOne
    @JoinColumn(name = "statusid", referencedColumnName = "id")
    private StatusOfTransactions status;

    private double amount;

    @Temporal(TemporalType.DATE)
    private Date transactionDate;
    // Getters and Setters
}
