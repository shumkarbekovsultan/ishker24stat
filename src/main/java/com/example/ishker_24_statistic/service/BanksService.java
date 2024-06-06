package com.example.ishker_24_statistic.service;

import com.example.ishker_24_statistic.models.Banks;
import com.example.ishker_24_statistic.repository.BanksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BanksService {

    @Autowired
    private BanksRepository banksRepository;

    public List<Banks> getAllBanks() {
        return banksRepository.findAll();
    }

    public Banks getBankById(Integer id) {
        return banksRepository.findById(id).orElse(null);
    }

    public Banks saveBank(Banks bank) {
        return banksRepository.save(bank);
    }
}