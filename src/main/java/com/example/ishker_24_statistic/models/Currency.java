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
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNameofcurrency() {
        return nameofcurrency;
    }

    public void setNameofcurrency(String nameofcurrency) {
        this.nameofcurrency = nameofcurrency;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Double getExchangerate() {
        return exchangerate;
    }

    public void setExchangerate(Double exchangerate) {
        this.exchangerate = exchangerate;
    }
}
