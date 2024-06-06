package com.example.ishker_24_statistic.DTO;


public class CompanyDTO {
    private Integer id;
    private Long inn;
    private Integer statusId;
    private Integer statusRegistrationId;
    private Integer accountId;
    private Integer kkm;
    private Boolean isIpBeforeRegistration;

    public CompanyDTO() {
    }

    public CompanyDTO(Integer id, Long inn, Integer statusId, Integer statusRegistrationId, Integer accountId, Integer kkm, Boolean isIpBeforeRegistration) {
        this.id = id;
        this.inn = inn;
        this.statusId = statusId;
        this.statusRegistrationId = statusRegistrationId;
        this.accountId = accountId;
        this.kkm = kkm;
        this.isIpBeforeRegistration = isIpBeforeRegistration;
    }

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

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public Integer getStatusRegistrationId() {
        return statusRegistrationId;
    }

    public void setStatusRegistrationId(Integer statusRegistrationId) {
        this.statusRegistrationId = statusRegistrationId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getKkm() {
        return kkm;
    }

    public void setKkm(Integer kkm)
    {
        this.kkm = kkm;
    }

    public Boolean getIsIpBeforeRegistration() {
        return isIpBeforeRegistration;
    }

    public void setIsIpBeforeRegistration(Boolean isIpBeforeRegistration) {
        this.isIpBeforeRegistration = isIpBeforeRegistration;
    }
}