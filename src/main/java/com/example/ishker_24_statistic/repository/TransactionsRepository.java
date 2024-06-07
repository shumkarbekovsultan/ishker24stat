package com.example.ishker_24_statistic.repository;

import com.example.ishker_24_statistic.models.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Repository
public interface TransactionsRepository extends JpaRepository<Transactions, Integer> {

    @Query("SELECT t FROM Transactions t WHERE t.status.id = :statusId")
    List<Transactions> findByStatus(@Param("statusId") Integer statusId);

    @Query("SELECT t FROM Transactions t WHERE t.transactionType.id = :typeId")
    List<Transactions> findByTransactionType(@Param("typeId") Integer typeId);

    @Query("SELECT t FROM Transactions t WHERE t.transactiondate >= :startDate AND t.transactiondate <= :endDate")
    List<Transactions> filterByDateTimeRange(@Param("startDate") LocalDateTime startDate, @Param("endDate") LocalDateTime endDate);


}