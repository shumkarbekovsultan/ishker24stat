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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getInn() {
        return inn;
    }

    public void setInn(Long inn) {
        this.inn = inn;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public StatusRegistrationGns getStatusRegistration() {
        return statusRegistration;
    }

    public void setStatusRegistration(StatusRegistrationGns statusRegistration) {
        this.statusRegistration = statusRegistration;
    }

    public Accounts getAccount() {
        return account;
    }

    public void setAccount(Accounts account) {
        this.account = account;
    }

    public Integer getKkm() {
        return kkm;
    }

    public void setKkm(Integer kkm) {
        this.kkm = kkm;
    }

    public Boolean getIsipbeforeregistration() {
        return isipbeforeregistration;
    }

    public void setIsipbeforeregistration(Boolean isipbeforeregistration) {
        this.isipbeforeregistration = isipbeforeregistration;
    }
}
