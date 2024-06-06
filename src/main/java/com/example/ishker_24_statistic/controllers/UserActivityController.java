package com.example.ishker_24_statistic.controllers;


import com.example.ishker_24_statistic.models.UserActivity;
import com.example.ishker_24_statistic.service.UserActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/useractivities")
public class UserActivityController {

    @Autowired
    private UserActivityService userActivityService;

    @GetMapping
    public List<UserActivity> getAllUserActivities() {
        return userActivityService.getAllUserActivities();
    }

    @GetMapping("/{id}")
    public UserActivity getUserActivityById(@PathVariable Integer id) {
        return userActivityService.getUserActivityById(id);
    }

    @PostMapping
    public UserActivity saveUserActivity(@RequestBody UserActivity userActivity) {
        return userActivityService.saveUserActivity(userActivity);
    }
}
