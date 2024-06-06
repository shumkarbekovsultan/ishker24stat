package com.example.ishker_24_statistic.repository;

import com.example.ishker_24_statistic.models.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Integer> {
    @Query("SELECT a FROM Accounts a JOIN FETCH a.currency JOIN FETCH a.bank JOIN FETCH a.filial")
    List<Accounts> findAllWithCurrencyAndBankAndFilial();
}
