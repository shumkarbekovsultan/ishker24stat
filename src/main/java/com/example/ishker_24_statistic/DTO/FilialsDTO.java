package com.example.ishker_24_statistic.DTO;


public class FilialsDTO {
    private Integer id;
    private String nameOfFilials;
    private String address;
    private Integer statusId;

    public FilialsDTO() {
    }

    public FilialsDTO(Integer id, String nameOfFilials, String address, Integer statusId) {
        this.id = id;
        this.nameOfFilials = nameOfFilials;
        this.address = address;
        this.statusId = statusId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameOfFilials() {
        return nameOfFilials;
    }

    public void setNameOfFilials(String nameOfFilials) {
        this.nameOfFilials = nameOfFilials;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }
}
