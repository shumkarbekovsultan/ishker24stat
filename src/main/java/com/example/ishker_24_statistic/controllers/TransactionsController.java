package com.example.ishker_24_statistic.controllers;

import  com.example.ishker_24_statistic.models.Transactions;
import com.example.ishker_24_statistic.service.TransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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

    @GetMapping("/filter")
    public List<Transactions> filterTransactions(@RequestParam(value = "status", required = false) Integer statusId,
                                                 @RequestParam(value = "type", required = false) Integer typeId) {
        if (statusId != null) {
            return transactionsService.filterTransactionsByStatus(statusId);
        } else if (typeId != null) {
            return transactionsService.filterTransactionsByType(typeId);
        } else {
            // Handle case when neither status nor type is provided
            return new ArrayList<>(); // Or throw an exception
        }
    }


    @GetMapping("/count")
    public ResponseEntity<?> countTransactions(@RequestParam(required = false) Long typeId,
                                               @RequestParam(required = false) Long statusId) {
        if (typeId == null && statusId == null) {
            return ResponseEntity.badRequest().body("Both typeId and statusId cannot be null. Please provide at least one.");
        }

        Map<String, Integer> counts = new HashMap<>();
        if (typeId != null && statusId != null) {
            counts.put("countByTransactionTypeAndStatus", transactionsService.countTransactionsByTypeAndStatus(typeId));
            counts.put("countByTransactionStatus", transactionsService.countTransactionsByStatus(statusId));
        } else if (typeId != null) {
            counts.put("countByTransactionTypeAndStatus", transactionsService.countTransactionsByTypeAndStatus(typeId));
        } else if (statusId != null) {
            counts.put("countByTransactionStatus", transactionsService.countTransactionsByStatus(statusId));
        }

        return ResponseEntity.ok(counts);
    }


    @GetMapping("/filterByDateTimeRange")
    public List<Transactions> filterByDateTimeRange(@RequestParam("startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
                                                    @RequestParam(value = "endDate", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate) {
        LocalDate nextDayEndDate;
        if (endDate != null) {
            nextDayEndDate = endDate.plusDays(10000); // Добавляем один день, чтобы включить весь последний день
        } else {
            nextDayEndDate = LocalDate.now().plusDays(10000); // Используем текущую дату, если endDate не указан
        }
        return transactionsService.filterByDateTimeRange(startDate, nextDayEndDate);
    }

}