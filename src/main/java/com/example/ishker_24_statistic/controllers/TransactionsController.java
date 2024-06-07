package com.example.ishker_24_statistic.controllers;

import  com.example.ishker_24_statistic.models.Transactions;

import com.example.ishker_24_statistic.service.TransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionsController {

    @Autowired
    private TransactionsService transactionsService;

    @GetMapping
    public List<Transactions> getAllTransactions() {
        return transactionsService.getAllTransactions();
    }

    @GetMapping("/{id}")
    public Transactions getTransactionById(@PathVariable Integer id) {
        return transactionsService.getTransactionById(id);
    }

    @PostMapping
    public Transactions saveTransaction(@RequestBody Transactions transaction) {
        return transactionsService.saveTransaction(transaction);
    }

//    @GetMapping("/filterByStatus")
//    public List<Transactions> filterTransactionsByStatus(@RequestParam("statusId") Integer statusId) {
//        return transactionsService.filterTransactionsByStatus(statusId);
//    }
//
//    @GetMapping("/filterByTransactionType")
//    public List<Transactions> filterTransactionsByType(@RequestParam("typeId") Integer typeId) {
//        return transactionsService.filterTransactionsByType(typeId);
//    }
}