package com.example.ishker_24_statistic.models;


import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
@Entity
@Table(name = "statusoftransactions")
public class StatusOfTransactions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 255)
    private String nameofstatus;

    @Column
    private String description;

    @Column
    private java.sql.Date createdat;

    @Column
    private java.sql.Date updatedat;

    // Getters and Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameofstatus() {
        return nameofstatus;
    }

    public void setNameofstatus(String nameofstatus) {
        this.nameofstatus = nameofstatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public java.sql.Date getCreatedat() {
        return createdat;
    }

    public void setCreatedat(java.sql.Date createdat) {
        this.createdat = createdat;
    }

    public java.sql.Date getUpdatedat() {
        return updatedat;
    }

    public void setUpdatedat(java.sql.Date updatedat) {
        this.updatedat = updatedat;
    }
}

