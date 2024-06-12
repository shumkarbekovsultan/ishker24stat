package com.example.ishker_24_statistic.controllers;
import com.example.ishker_24_statistic.models.Accounts;
import com.example.ishker_24_statistic.repository.AccountsRepository;
import com.example.ishker_24_statistic.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountsController {
    @Autowired
    private AccountsService accountsService;
    @Autowired
    private AccountsRepository accountsRepository;

    @GetMapping
    public List<Accounts> getAllAccounts() {
        return accountsService.getAllAccounts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Accounts> getAccountById(@PathVariable Integer id) {
        Accounts account = accountsService.getAccountById(id);
        if (account == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(account, HttpStatus.OK);
    }

    @PostMapping
    public Accounts saveAccount(@RequestBody Accounts account) {
        return accountsService.saveAccount(account);
    }

    @GetMapping("/countByStatus")
    public List<Object[]> countAccountsByStatus() {
        return accountsService.countAccountsByStatus();
    }

    @GetMapping("/filterByStatus")
    public List<Object> filterAccountsByStatus(@RequestParam("statusName") String statusName) {
        return accountsRepository.filterAccountsByStatus(statusName);
    }

    @GetMapping("/sumBalances")
    public Double sumAllBalances() {
        return accountsService.sumAllBalances();
    }

}