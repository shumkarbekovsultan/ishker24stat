package com.example.ishker_24_statistic.controllers;


import com.example.ishker_24_statistic.models.Filials;
import com.example.ishker_24_statistic.service.FilialsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filials")
public class FilialsController {

    @Autowired
    private FilialsService filialsService;

    @GetMapping
    public List<Filials> getAllFilials() {
        return filialsService.getAllFilials();
    }

    @GetMapping("/{id}")
    public Filials getFilialById(@PathVariable Integer id) {
        return filialsService.getFilialById(id);
    }

    @PostMapping
    public Filials saveFilial(@RequestBody Filials filial) {
        return filialsService.saveFilial(filial);
    }
}
