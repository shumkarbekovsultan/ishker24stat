package com.example.ishker_24_statistic.repository;

import com.example.ishker_24_statistic.models.StatusRegistrationGns;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRegistrationGnsRepository extends JpaRepository<StatusRegistrationGns, Integer> {
}