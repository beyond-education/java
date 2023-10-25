package com.beyond.piggy_bank.controller;

import com.beyond.piggy_bank.data.Money;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/money")
public class MoneyController {
    private final List<Money> balance = new ArrayList<>();

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Money addMoney(@RequestBody Money money) {
        money.setId(UUID.randomUUID().toString());
        balance.add(money);
        return money;
    }

    @GetMapping
    public List<Money> getBalance() {
        return balance;
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public double crashPiggyBank() {
        double total = balance.stream()
                .mapToDouble(Money::getAmount)
                .sum();
        balance.clear();
        return total;
    }
}
