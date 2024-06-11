package com.example.ishker_24_statistic.controllers;


import com.example.ishker_24_statistic.models.Company;
import com.example.ishker_24_statistic.repository.CompanyRepository;
import com.example.ishker_24_statistic.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/companies")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping
    public List<Company> getAllCompanies() {
        return companyService.getAllCompanies();
    }

    @GetMapping("/{id}")
    public Company getCompanyById(@PathVariable Integer id) {
        return companyService.getCompanyById(id);
    }

    @PostMapping
    public Company saveCompany(@RequestBody Company company) {
        return companyService.saveCompany(company);
    }

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/filterByStatus")
    public List<Company> filterCompaniesByStatus(@RequestParam("statusName") String statusName) {
        return companyService.filterByStatusName(statusName);
    }

    @GetMapping("/filterByStatus/count")
    public long countCompaniesByStatus(@RequestParam("statusName") String statusName) {
        return companyService.countByStatusName(statusName);
    }

    @GetMapping("/filterByStatusRegistration")
    public List<Company> getCompaniesByStatusRegistration(@RequestParam("statusRegistrationName") String statusRegistrationName) {
        return companyService.filterByStatusRegistrationName(statusRegistrationName);
    }

    @GetMapping("/filterByStatusRegistration/count")
    public long countCompaniesByStatusRegistration(@RequestParam("statusRegistrationName") String statusRegistrationName) {
        return companyService.countByStatusRegistrationName(statusRegistrationName);
    }

    @GetMapping("/filter")
    public List<Company> filterCompanies(
            @RequestParam("statusName") String statusName,
            @RequestParam("statusRegistrationName") String statusRegistrationName) {
        return companyService.filterByStatusAndStatusRegistration(statusName, statusRegistrationName);
    }



//
//    @GetMapping("/filterByAccountBalance/sum")
//    public Double sumAllAccountBalances() {
//        return companyService.sumAllAccountBalances();
//    }


//    @GetMapping("/filterByBank")
//    public List<Company> getCompaniesByBank(@RequestParam("bankName") String bankName) {
//        return companyService.filterByBank(bankName);
//    }
//
//    @GetMapping("/filterByBranch")
//    public List<Company> getCompaniesByBranch(@RequestParam("branchName") String branchName) {
//        return companyService.filterByBranch(branchName);
//    }

}