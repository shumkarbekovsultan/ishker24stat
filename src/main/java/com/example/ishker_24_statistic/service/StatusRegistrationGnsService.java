package com.example.ishker_24_statistic.service;

import com.example.ishker_24_statistic.models.StatusRegistrationGns;
import com.example.ishker_24_statistic.repository.StatusRegistrationGnsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusRegistrationGnsService {

    @Autowired
    private StatusRegistrationGnsRepository statusRegistrationGnsRepository;

    public List<StatusRegistrationGns> getAllStatusRegistrationGns() {
        return statusRegistrationGnsRepository.findAll();
    }

    public StatusRegistrationGns getStatusRegistrationGnsById(Integer id) {
        return statusRegistrationGnsRepository.findById(id).orElse(null);
    }

    public StatusRegistrationGns saveStatusRegistrationGns(StatusRegistrationGns statusRegistrationGns) {
        return statusRegistrationGnsRepository.save(statusRegistrationGns);
    }
}