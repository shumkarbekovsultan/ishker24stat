package com.example.ishker_24_statistic.DTO;

import java.math.BigDecimal;
import java.util.Date;

public class TransactionsDTO {
    private Long id;
    private Long accountIdFrom;
    private Long accountIdTo;
    private Integer transactionType;
    private Integer statusId;
    private BigDecimal amount;
    private Date transactionDate;

    public TransactionsDTO() {
    }

    public TransactionsDTO(Long id, Long accountIdFrom, Long accountIdTo, Integer transactionType, Integer statusId, BigDecimal amount, Date transactionDate) {
        this.id = id;
        this.accountIdFrom = accountIdFrom;
        this.accountIdTo = accountIdTo;
        this.transactionType = transactionType;
        this.statusId = statusId;
        this.amount = amount;
        this.transactionDate = transactionDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAccountIdFrom() {
        return accountIdFrom;
    }

    public void setAccountIdFrom(Long accountIdFrom) {
        this.accountIdFrom = accountIdFrom;
    }

    public Long getAccountIdTo() {
        return accountIdTo;
    }

    public void setAccountIdTo(Long accountIdTo) {
        this.accountIdTo = accountIdTo;
    }

    public Integer getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(Integer transactionType) {
        this.transactionType = transactionType;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
}
