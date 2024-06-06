package com.example.ishker_24_statistic.controllers;


import com.example.ishker_24_statistic.models.Currency;
import com.example.ishker_24_statistic.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/currencies")
public class CurrencyController {

    @Autowired
    private CurrencyService currencyService;

    @GetMapping
    public List<Currency> getAllCurrencies() {
        return currencyService.getAllCurrencies();
    }

    @GetMapping("/{id}")
    public Currency getCurrencyById(@PathVariable Integer id) {
        return currencyService.getCurrencyById(id);
    }

    @PostMapping
    public Currency saveCurrency(@RequestBody Currency currency) {
        return currencyService.saveCurrency(currency);
    }
}
