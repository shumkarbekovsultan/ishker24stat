package com.example.ishker_24_statistic.models;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "permission")
public class Permission {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 255)
    private String name;

    public void setId(Long id) {
        this.id = Math.toIntExact(id);
    }

    public Integer getId() {
        return id;
    }
}
