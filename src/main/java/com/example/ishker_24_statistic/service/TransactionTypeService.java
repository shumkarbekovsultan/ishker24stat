package com.example.ishker_24_statistic.service;

import com.example.ishker_24_statistic.models.TransactionType;
import com.example.ishker_24_statistic.repository.TransactionTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionTypeService {

    @Autowired
    private TransactionTypeRepository transactionTypeRepository;

    public List<TransactionType> getAllTransactionTypes() {
        return transactionTypeRepository.findAll();
    }

    public TransactionType getTransactionTypeById(Integer id) {
        return transactionTypeRepository.findById(id).orElse(null);
    }

    public TransactionType saveTransactionType(TransactionType transactionType) {
        return transactionTypeRepository.save(transactionType);
    }
}