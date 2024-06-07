package com.example.ishker_24_statistic.controllers;

import  com.example.ishker_24_statistic.models.Transactions;

import com.example.ishker_24_statistic.service.TransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Date;
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

    @GetMapping("/filterByStatusID")
    public List<Transactions> filterTransactionsByStatus(@RequestParam("status") Integer statusId) {
        return transactionsService.filterTransactionsByStatus(statusId);
    }

    @GetMapping("/filterByTransactionTypeID")
    public List<Transactions> filterTransactionsByType(@RequestParam("type") Integer typeId) {
        return transactionsService.filterTransactionsByType(typeId);
    }

    @GetMapping("/filterByDateTimeRange")
    public List<Transactions> filterByDateTimeRange(
            @RequestParam("startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime startDate,
            @RequestParam("endDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime endDate) {
        return transactionsService.filterByDateTimeRange(startDate, endDate);
    }

}