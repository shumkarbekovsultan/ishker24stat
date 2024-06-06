package com.example.ishker_24_statistic.repository;

import com.example.ishker_24_statistic.models.StatusOfTransactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusOfTransactionsRepository extends JpaRepository<StatusOfTransactions, Integer> {
}