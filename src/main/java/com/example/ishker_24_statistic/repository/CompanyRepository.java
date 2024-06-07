package com.example.ishker_24_statistic.repository;

import com.example.ishker_24_statistic.models.Company;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {

    @Query("SELECT c FROM Company c WHERE c.status.nameofstatus= :statusName")
    List<Company>  filterByStatusName(String statusName);

    @Query("SELECT c FROM Company c WHERE c.statusRegistration.nameofstatus= :statusRegistrationName")
    List<Company>  filterByStatusRegistrationName(String statusRegistrationName);

    @Query("SELECT c FROM Company c WHERE c.isipbeforeregistration = :isIPBeforeRegistration")
    List<Company> filterByIsIPBeforeRegistration(@Param("isIPBeforeRegistration") Boolean isIPBeforeRegistration);

    @Query("SELECT SUM(c.account.balance) FROM Company c")
    Double sumAllAccountBalances();


//    @Query("SELECT c FROM Company c WHERE c.bank.nameofbanks = :bankName")
//    List<Company> filterByBank(@Param("bankName") String bankName);
//
//    @Query("SELECT c FROM Company c WHERE c.filial.nameoffilials = :branchName")
//    List<Company> filterByBranch(@Param("branchName") String branchName);
}