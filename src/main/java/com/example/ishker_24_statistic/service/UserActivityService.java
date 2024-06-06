package com.example.ishker_24_statistic.service;

import com.example.ishker_24_statistic.models.UserActivity;
import com.example.ishker_24_statistic.repository.UserActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserActivityService {

    @Autowired
    private UserActivityRepository userActivityRepository;

    public List<UserActivity> getAllUserActivities() {
        return userActivityRepository.findAll();
    }

    public UserActivity getUserActivityById(Integer id) {
        return userActivityRepository.findById(id).orElse(null);
    }

    public UserActivity saveUserActivity(UserActivity userActivity) {
        return userActivityRepository.save(userActivity);
    }
}