//package com.example.ishker_24_statistic.models;
//
//
//import jakarta.persistence.Table;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Column;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.JoinColumn;
//@Entity
//@Table(name = "useractivity")
//public class UserActivity {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//
//    @ManyToOne
//    @JoinColumn(name = "userid", referencedColumnName = "id")
//    private User user;
//
//    @Column
//    private java.sql.Timestamp logintimestamp;
//
//    @Column
//    private java.sql.Timestamp logouttimestamp;
//
//    // Getters and Setters
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public java.sql.Timestamp getLogintimestamp() {
//        return logintimestamp;
//    }
//
//    public void setLogintimestamp(java.sql.Timestamp logintimestamp) {
//        this.logintimestamp = logintimestamp;
//    }
//
//    public java.sql.Timestamp getLogouttimestamp() {
//        return logouttimestamp;
//    }
//
//    public void setLogouttimestamp(java.sql.Timestamp logouttimestamp) {
//        this.logouttimestamp = logouttimestamp;
//    }
//}
//
