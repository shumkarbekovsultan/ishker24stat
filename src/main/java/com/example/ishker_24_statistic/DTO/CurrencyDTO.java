package com.example.ishker_24_statistic.DTO;


public class CurrencyDTO {
    private Integer id;
    private String code;
    private String nameOfCurrency;
    private String symbol;
    private Integer statusId;
    private Double exchangeRate;

    public CurrencyDTO() {
    }

    public CurrencyDTO(Integer id, String code, String nameOfCurrency, String symbol, Integer statusId, Double exchangeRate) {
        this.id = id;
        this.code = code;
        this.nameOfCurrency = nameOfCurrency;
        this.symbol = symbol;
        this.statusId = statusId;
        this.exchangeRate = exchangeRate;
    }

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

    public String getNameOfCurrency() {
        return nameOfCurrency;
    }

    public void setNameOfCurrency(String nameOfCurrency) {
        this.nameOfCurrency = nameOfCurrency;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public Double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
}

