package com.example.ishker_24_statistic.DTO;


public class BanksDTO {
    private Integer id;
    private String nameOfBanks;
    private String bic;
    private Integer statusId;

    public BanksDTO() {
    }

    public BanksDTO(Integer id, String nameOfBanks, String bic, Integer statusId) {
        this.id = id;
        this.nameOfBanks = nameOfBanks;
        this.bic = bic;
        this.statusId = statusId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameOfBanks() {
        return nameOfBanks;
    }

    public void setNameOfBanks(String nameOfBanks) {
        this.nameOfBanks = nameOfBanks;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }
}

