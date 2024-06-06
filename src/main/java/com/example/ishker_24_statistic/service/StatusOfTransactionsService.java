package com.example.ishker_24_statistic.service;

import com.example.ishker_24_statistic.models.StatusOfTransactions;
import com.example.ishker_24_statistic.repository.StatusOfTransactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusOfTransactionsService {

    @Autowired
    private StatusOfTransactionsRepository statusOfTransactionsRepository;

    public List<StatusOfTransactions> getAllStatusOfTransactions() {
        return statusOfTransactionsRepository.findAll();
    }

    public StatusOfTransactions getStatusOfTransactionById(Integer id) {
        return statusOfTransactionsRepository.findById(id).orElse(null);
    }

    public StatusOfTransactions saveStatusOfTransaction(StatusOfTransactions statusOfTransactions) {
        return statusOfTransactionsRepository.save(statusOfTransactions);
    }
}
