package com.example.ishker_24_statistic.service;

import com.example.ishker_24_statistic.models.Filials;
import com.example.ishker_24_statistic.repository.FilialsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilialsService {

    @Autowired
    private FilialsRepository filialsRepository;

    public List<Filials> getAllFilials() {
        return filialsRepository.findAll();
    }

    public Filials getFilialById(Integer id) {
        return filialsRepository.findById(id).orElse(null);
    }

    public Filials saveFilial(Filials filial) {
        return filialsRepository.save(filial);
    }
}
