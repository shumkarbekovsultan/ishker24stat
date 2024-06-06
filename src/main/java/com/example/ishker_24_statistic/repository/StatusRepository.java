package com.example.ishker_24_statistic.repository;


import com.example.ishker_24_statistic.models.Status; // Используем ваш собственный класс Status
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepository extends JpaRepository<Status, Integer> {
}
