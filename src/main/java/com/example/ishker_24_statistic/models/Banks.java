package com.example.ishker_24_statistic.models;


import jakarta.persistence.*;

@Entity
@Table(name = "banks")
public class Banks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 255)
    private String nameofbanks;

    @Column(length = 20)
    private String bic;

    @ManyToOne
    @JoinColumn(name = "status", referencedColumnName = "id")
    private Status status;

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameofbanks() {
        return nameofbanks;
    }

    public void setNameofbanks(String nameofbanks) {
        this.nameofbanks = nameofbanks;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
