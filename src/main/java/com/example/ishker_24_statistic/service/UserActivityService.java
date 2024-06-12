//package com.example.ishker_24_statistic.service;
//
//import com.example.ishker_24_statistic.models.UserActivity;
//import com.example.ishker_24_statistic.repository.UserActivityRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.security.Timestamp;
//import java.time.LocalDateTime;
//import java.util.List;
//
//@Service
//public class UserActivityService {
//
//    @Autowired
//    private UserActivityRepository userActivityRepository;
//
//    public List<UserActivity> getAllUserActivities() {
//        return userActivityRepository.findAll();
//    }
//
//    public UserActivity getUserActivityById(Integer id) {
//        return userActivityRepository.findById(id).orElse(null);
//    }
//
//    public UserActivity saveUserActivity(UserActivity userActivity) {
//        return userActivityRepository.save(userActivity);
//    }
//
//    public List<UserActivity> getUserActivitiesByDateRange(LocalDateTime startDate, LocalDateTime endDate) {
//        return userActivityRepository.findAllByDateTimeRange(startDate, endDate);
//    }
//
//    public Double getTotalTimeSpent() {
//        return userActivityRepository.getTotalTimeSpent();
//    }
//
//    public Double getAverageTimeSpent() {
//        return userActivityRepository.getAverageTimeSpentPerDay();
//    }
//
//    public Double getTotalTimeSpentByUser(Integer userId) {
//        return userActivityRepository.getTotalTimeSpentByUser(userId);
//    }
//
//    public Double getAverageTimeSpentByUser(Integer userId) {
//        return userActivityRepository.getAverageTimeSpentByUser(userId);
//    }
//
//    public List<Object[]> getVisitsPerMonth() {
//        return userActivityRepository.getVisitsPerMonth();
//    }
//
//    public List<Object[]> getVisitsPerDay() {
//        return userActivityRepository.getVisitsPerDay();
//    }
//
//    public List<Object[]> getVisitsPerHour() {
//        return userActivityRepository.getVisitsPerHour();
//    }
//}