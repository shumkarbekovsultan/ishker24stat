package com.example.ishker_24_statistic.controllers;
import com.example.ishker_24_statistic.models.Accounts;
import com.example.ishker_24_statistic.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountsController {

    @Autowired
    private AccountsService accountsService;

    @GetMapping
    public List<Accounts> getAllAccounts() {
        return accountsService.getAllAccounts();
    }

    @GetMapping("/{id}")
    public Accounts getAccountById(@PathVariable Integer id) {
        return accountsService.getAccountById(id);
    }

    @PostMapping
    public Accounts saveAccount(@RequestBody Accounts account) {
        return accountsService.saveAccount(account);
    }
}