package com.example.ishker_24_statistic.service;

import com.example.ishker_24_statistic.models.Transactions;
import com.example.ishker_24_statistic.repository.TransactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

//    public List<Transactions> filterTransactionsByStatus(Integer statusId) {
//        return transactionsRepository.findByStatus_Id(statusId);
//    }
//
//    public List<Transactions> filterTransactionsByType(Integer typeId) {
//        return transactionsRepository.findByTransactionType_Id(typeId);
//    }

}