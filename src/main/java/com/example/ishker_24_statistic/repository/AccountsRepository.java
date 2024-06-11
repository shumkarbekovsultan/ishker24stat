package com.example.ishker_24_statistic.repository;

import com.example.ishker_24_statistic.models.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface AccountsRepository extends JpaRepository<Accounts, Integer> {

    @Query("SELECT DISTINCT a FROM Accounts a " +
            "JOIN FETCH a.status " +
            "JOIN FETCH a.currency " +
            "JOIN FETCH a.bank " +
            "JOIN FETCH a.filial")
    List<Accounts> findAllWithDetails();


    @Query("SELECT a.status.nameofstatus, COUNT(a) FROM Accounts a " +
            "JOIN a.status " +
            "GROUP BY a.status.nameofstatus")
    List<Object[]> countAccountsByStatus();

    @Query("SELECT a.status.nameofstatus FROM Accounts a " +
            "JOIN a.status " +
            "WHERE a.status.nameofstatus = :statusName ")
    List<Object> filterAccountsByStatus(@Param("statusName") String statusName);

    @Query("SELECT SUM(a.balance) FROM Accounts a")
    Double sumAllBalances();
}