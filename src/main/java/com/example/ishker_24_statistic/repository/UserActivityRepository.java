//package com.example.ishker_24_statistic.repository;
//
//import com.example.ishker_24_statistic.models.UserActivity;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//import java.security.Timestamp;
//import java.time.LocalDateTime;
//import java.util.List;
//
//@Repository
//public interface UserActivityRepository extends JpaRepository<UserActivity, Integer> {
//    @Query("SELECT ua FROM UserActivity ua WHERE ua.logintimestamp >= :startDate AND ua.logintimestamp <= :endDate")
//    List<UserActivity> findAllByDateTimeRange(@Param("startDate") LocalDateTime startDate, @Param("endDate") LocalDateTime endDate);
//
//    @Query(value = "SELECT SUM(EXTRACT(EPOCH FROM logouttimestamp) - EXTRACT(EPOCH FROM logintimestamp)) / 3600 FROM useractivity", nativeQuery = true)
//    Double getTotalTimeSpent();
//
//    @Query(value = "SELECT AVG(daily_time_spent) FROM (SELECT EXTRACT(DAY FROM logintimestamp) AS day, AVG(EXTRACT(EPOCH FROM logouttimestamp - logintimestamp)) / 3600 AS daily_time_spent, userid FROM useractivity GROUP BY EXTRACT(DAY FROM logintimestamp), userid) AS avg_per_day;", nativeQuery = true)
//    Double getAverageTimeSpentPerDay();
//
//    @Query(value = "SELECT SUM(EXTRACT(EPOCH FROM logouttimestamp) - EXTRACT(EPOCH FROM logintimestamp)) / 3600 FROM useractivity WHERE userid = :userId", nativeQuery = true)
//    Double getTotalTimeSpentByUser(@Param("userId") Integer userId);
//
//    @Query(value = "SELECT AVG(EXTRACT(EPOCH FROM logouttimestamp) - EXTRACT(EPOCH FROM logintimestamp)) / 3600 FROM useractivity WHERE userid = :userId", nativeQuery = true)
//    Double getAverageTimeSpentByUser(@Param("userId") Integer userId);
//
//    @Query(value = "SELECT EXTRACT(MONTH FROM logintimestamp) AS month, COUNT(id) AS visits FROM useractivity GROUP BY EXTRACT(MONTH FROM logintimestamp) ORDER BY month", nativeQuery = true)
//    List<Object[]> getVisitsPerMonth();
//
//    @Query(value = "SELECT EXTRACT(DAY FROM logintimestamp) AS day, COUNT(id) AS visits FROM useractivity GROUP BY EXTRACT(DAY FROM logintimestamp) ORDER BY day", nativeQuery = true)
//    List<Object[]> getVisitsPerDay();
//
//    @Query(value = "SELECT EXTRACT(HOUR FROM logintimestamp) AS hour, COUNT(id) AS visits FROM useractivity GROUP BY EXTRACT(HOUR FROM logintimestamp) ORDER BY hour", nativeQuery = true)
//    List<Object[]> getVisitsPerHour();
//}