package com.example.ishker_24_statistic.service;


import com.example.ishker_24_statistic.models.Transactions;
import com.example.ishker_24_statistic.repository.TransactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class TransactionsService {

    @Autowired
    private TransactionsRepository transactionsRepository;

    public List<Transactions> getAllTransactions() {
        return transactionsRepository.findAll();
    }

    public Transactions getTransactionById(Integer id) {
        return transactionsRepository.findById(id).orElse(null);
    }

    public Transactions saveTransaction(Transactions transaction) {
        return transactionsRepository.save(transaction);
    }

    public List<Transactions> filterTransactionsByStatus(Integer statusId) {
        return transactionsRepository.findByStatus(statusId);
    }

    public List<Transactions> filterTransactionsByType(Integer typeId) {
        return transactionsRepository.findByTransactionType(typeId);
    }


     public int countTransactionsByTypeAndStatus(Long typeId) {
        return transactionsRepository.countTransactionsByTypeAndStatus(typeId);
    }

    public int countTransactionsByStatus(Long statusId) {
        return transactionsRepository.countTransactionsByStatus(statusId);
    }

    public List<Transactions> filterByDateTimeRange(LocalDate startDate, LocalDate nextDayEndDate) {
        // Фильтруем транзакции по диапазону дат от startDate (включительно) до nextDayEndDate (исключительно)
        return transactionsRepository.filterByDateTimeRange(startDate.atStartOfDay(), nextDayEndDate.atStartOfDay());
    }



}