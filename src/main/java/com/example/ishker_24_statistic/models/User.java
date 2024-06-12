//package com.example.ishker_24_statistic.models;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//import java.util.Set;
//
//@Entity
//@Table(name = "User")
//@Data
//public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//
//    @Column(nullable = false)
//    private Long inn;
//
//    @Column(nullable = false, length = 255)
//    private String username;
//
//    @Column(length = 255)
//    private String firstname;
//
//    @Column(length = 255)
//    private String lastname;
//
//    @ManyToOne
//    @JoinColumn(name = "role_id", referencedColumnName = "id")
//    private Role role;
//
//    @ManyToOne
//    @JoinColumn(name = "status_id", referencedColumnName = "id")
//    private Status status;
//
//    @Column(nullable = false, length = 255)
//    private String pass;
//
//    @ManyToMany
//    @JoinTable(
//            name = "user_permission",
//            joinColumns = @JoinColumn(name = "user_id"),
//            inverseJoinColumns = @JoinColumn(name = "permission_id")
//    )
//    private Set<Permission> permissions;
//
//    // Getters and Setters
//
////    public Integer getId() {
////        return id;
////    }
////
////    public void setId(Integer id) {
////        this.id = id;
////    }
////
////    public Long getInn() {
////        return inn;
////    }
////
////    public void setInn(Long inn) {
////        this.inn = inn;
////    }
////
////    public String getUsername() {
////        return username;
////    }
////
////    public void setUsername(String username) {
////        this.username = username;
////    }
////
////    public String getFirstname() {
////        return firstname;
////    }
////
////    public void setFirstname(String firstname) {
////        this.firstname = firstname;
////    }
////
////    public String getLastname() {
////        return lastname;
////    }
////
////    public void setLastname(String lastname) {
////        this.lastname = lastname;
////    }
////
////    public Role getRole() {
////        return role;
////    }
////
////    public void setRole(Role role) {
////        this.role = role;
////    }
////
////    public Status getStatus() {
////        return status;
////    }
////
////    public void setStatus(Status status) {
////        this.status = status;
////    }
////
////    public String getPass() {
////        return pass;
////    }
////
////    public void setPass(String pass) {
////        this.pass = pass;
////    }
////
////    public Set<Permission> getPermissions() {
////        return permissions;
////    }
////
////    public void setPermissions(Set<Permission> permissions) {
////        this.permissions = permissions;
////    }
//}