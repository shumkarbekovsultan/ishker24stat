package com.example.ishker_24_statistic.repository;

import com.example.ishker_24_statistic.models.Company;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {

    @Query("SELECT c FROM Company c WHERE c.status.nameofstatus = :statusName")
    List<Company> filterByStatusName(@Param("statusName") String statusName);

    @Query("SELECT c FROM Company c WHERE c.statusRegistration.nameofstatus = :statusRegistrationName")
    List<Company> filterByStatusRegistrationName(@Param("statusRegistrationName") String statusRegistrationName);

    @Query("SELECT c FROM Company c WHERE c.status.nameofstatus = :statusName AND c.statusRegistration.nameofstatus = :statusRegistrationName")
    List<Company> filterByStatusAndStatusRegistration(
            @Param("statusName") String statusName,
            @Param("statusRegistrationName") String statusRegistrationName);

    @Query("SELECT COUNT(c) FROM Company c WHERE c.statusRegistration.nameofstatus = :statusRegistrationName")
    long countByStatusRegistrationName(@Param("statusRegistrationName") String statusRegistrationName);

    @Query("SELECT COUNT(c) FROM Company c WHERE c.status.nameofstatus = :statusName")
    long countByStatusName(@Param("statusName") String statusName);
//
//    @Query("SELECT c FROM Company c WHERE c.id = :id")
//    List<Company> filterById(@Param("id") Integer id);
}

//    @Query("SELECT c FROM Company c WHERE c.bank.nameofbanks = :bankName")
//    List<Company> filterByBank(@Param("bankName") String bankName);
//
//    @Query("SELECT c FROM Company c WHERE c.filial.nameoffilials = :branchName")
//    List<Company> filterByBranch(@Param("branchName") String branchName);
