package com.example.ishker_24_statistic.service;

import com.example.ishker_24_statistic.models.Currency;
import com.example.ishker_24_statistic.repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyService {

    @Autowired
    private CurrencyRepository currencyRepository;

    public List<Currency> getAllCurrencies() {
        return currencyRepository.findAll();
    }

    public Currency getCurrencyById(Integer id) {
        return currencyRepository.findById(id).orElse(null);
    }

    public Currency saveCurrency(Currency currency) {
        return currencyRepository.save(currency);
    }
}