package com.example.ishker_24_statistic.controllers;

import com.example.ishker_24_statistic.models.Status;
import com.example.ishker_24_statistic.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/statuses")
public class StatusController {

    @Autowired
    private StatusService statusService;

    @GetMapping
    public List<Status> getAllStatuses() {
        return statusService.getAllStatuses();
    }

    @GetMapping("/{id}")
    public Status getStatusById(@PathVariable Integer id) {
        return statusService.getStatusById(id);
    }

    @PostMapping
    public Status saveStatus(@RequestBody Status status) {
        return statusService.saveStatus(status);
    }
}
