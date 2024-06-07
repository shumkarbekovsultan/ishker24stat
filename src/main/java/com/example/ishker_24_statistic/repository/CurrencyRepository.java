package com.example.ishker_24_statistic.repository;

import com.example.ishker_24_statistic.models.Company;
import com.example.ishker_24_statistic.models.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Integer> {

}