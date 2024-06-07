package com.example.ishker_24_statistic.service;

import com.example.ishker_24_statistic.models.Company;
import com.example.ishker_24_statistic.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    public Company getCompanyById(Integer id) {
        return companyRepository.findById(id).orElse(null);
    }

    public Company saveCompany(Company company) {
        return companyRepository.save(company);
    }

    public List<Company> filterByStatusName(String statusName) {
        return companyRepository.filterByStatusName(statusName);
    }



        public List<Company> filterByIsIPBeforeRegistration(Boolean isIPBeforeRegistration) {
            return companyRepository.filterByIsIPBeforeRegistration(isIPBeforeRegistration);
        }


    public List<Company> filterByStatusRegistrationName(String statusRegistrationName) {
        return companyRepository.filterByStatusRegistrationName(statusRegistrationName);
    }

    public Double sumAllAccountBalances() {
        return companyRepository.sumAllAccountBalances();
    }



//    public List<Company> filterByBank(String bankName) {
//        return companyRepository.filterByBank(bankName);
//    }
//
//    public List<Company> filterByBranch(String branchName) {
//        return companyRepository.filterByBranch(branchName);
//    }
}