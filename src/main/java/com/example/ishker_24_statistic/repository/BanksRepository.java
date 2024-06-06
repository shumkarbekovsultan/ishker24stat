package com.example.ishker_24_statistic.repository;

import com.example.ishker_24_statistic.models.Banks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BanksRepository extends JpaRepository<Banks, Integer> {
}
