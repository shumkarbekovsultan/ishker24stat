package com.example.ishker_24_statistic.controllers;

import com.example.ishker_24_statistic.models.Banks;
import com.example.ishker_24_statistic.service.BanksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/banks")
public class BanksController {

    @Autowired
    private BanksService banksService;

    @GetMapping
    public List<Banks> getAllBanks() {
        return banksService.getAllBanks();
    }

    @GetMapping("/{id}")
    public Banks getBankById(@PathVariable Integer id) {
        return banksService.getBankById(id);
    }

    @PostMapping
    public Banks saveBank(@RequestBody Banks bank) {
        return banksService.saveBank(bank);
    }
}