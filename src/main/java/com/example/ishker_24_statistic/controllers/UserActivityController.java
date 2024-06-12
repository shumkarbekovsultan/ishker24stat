//package com.example.ishker_24_statistic.controllers;
//
//
//import com.example.ishker_24_statistic.models.UserActivity;
//import com.example.ishker_24_statistic.service.UserActivityService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.security.Timestamp;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import java.util.Date;
//import java.util.List;
//
//@RestController
//@RequestMapping("/useractivities")
//public class UserActivityController {
//
//    @Autowired
//    private UserActivityService userActivityService;
//
//    @GetMapping
//    public List<UserActivity> getAllUserActivities() {
//        return userActivityService.getAllUserActivities();
//    }
//
//    @GetMapping("/{id}")
//    public UserActivity getUserActivityById(@PathVariable Integer id) {
//        return userActivityService.getUserActivityById(id);
//    }
//
//    @PostMapping
//    public UserActivity saveUserActivity(@RequestBody UserActivity userActivity) {
//        return userActivityService.saveUserActivity(userActivity);
//    }
//
//    @GetMapping("/date-range")
//    public List<UserActivity> getUserActivitiesByDateTimeRange(@RequestParam("startDate") String startDate,
//                                                               @RequestParam("endDate") String endDate) {
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        LocalDateTime parsedStartDate = LocalDateTime.parse(startDate, formatter);
//        LocalDateTime parsedEndDate = LocalDateTime.parse(endDate, formatter);
//        return userActivityService.getUserActivitiesByDateRange(parsedStartDate, parsedEndDate);
//    }
//
//    @GetMapping("/total-time-spent")
//    public Double getTotalTimeSpent() {
//        return userActivityService.getTotalTimeSpent();
//    }
//
//    @GetMapping("/average-time-spent")
//    public Double getAverageTimeSpent() {
//        return userActivityService.getAverageTimeSpent();
//    }
//
//    @GetMapping("/total-time-spent/user/{userId}")
//    public Double getTotalTimeSpentByUser(@PathVariable Integer userId) {
//        return userActivityService.getTotalTimeSpentByUser(userId);
//    }
//
//    @GetMapping("/average-time-spent/user/{userId}")
//    public Double getAverageTimeSpentByUser(@PathVariable Integer userId) {
//        return userActivityService.getAverageTimeSpentByUser(userId);
//    }
//
//    @GetMapping("/visits-per-month")
//    public List<Object[]> getVisitsPerMonth() {
//        return userActivityService.getVisitsPerMonth();
//    }
//
//    @GetMapping("/visits-per-day")
//    public List<Object[]> getVisitsPerDay() {
//        return userActivityService.getVisitsPerDay();
//    }
//
//    @GetMapping("/visits-per-hour")
//    public List<Object[]> getVisitsPerHour() {
//        return userActivityService.getVisitsPerHour();
//    }
//}
