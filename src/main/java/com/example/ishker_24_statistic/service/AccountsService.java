package com.example.ishker_24_statistic.service;

import  com.example.ishker_24_statistic.models.Accounts;
import com.example.ishker_24_statistic.repository.AccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountsService {

    @Autowired
    private AccountsRepository accountsRepository;

    public List<Accounts> getAllAccounts() {
        return accountsRepository.findAll();
    }

    public Accounts getAccountById(Integer id) {
        return accountsRepository.findById(id).orElse(null);
    }

    public Accounts saveAccount(Accounts account) {
        return accountsRepository.save(account);
    }


    public List<Accounts> getAllAccountsWithCurrencyAndBankAndFilial() {
        return accountsRepository.findAllWithCurrencyAndBankAndFilial();
    }
}