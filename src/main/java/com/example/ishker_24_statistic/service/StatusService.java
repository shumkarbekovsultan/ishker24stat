package com.example.ishker_24_statistic.service;

import com.example.ishker_24_statistic.models.Status;
import com.example.ishker_24_statistic.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusService {

    @Autowired
    private StatusRepository statusRepository;

    public List<Status> getAllStatuses() {
        return statusRepository.findAll();
    }

    public Status getStatusById(Integer id) {
        return statusRepository.findById(id).orElse(null);
    }

    public Status saveStatus(Status status) {
        return statusRepository.save(status);
    }
}
