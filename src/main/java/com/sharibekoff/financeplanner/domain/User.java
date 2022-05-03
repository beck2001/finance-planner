package com.sharibekoff.financeplanner.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class User {
    private final Long id;
    private String username;
    private String fullName;
    private BigDecimal balance;
    private LocalDateTime registeredAt;
    private List<Account> accounts;

    public void addAccount(Account account) {
        this.accounts.add(account);
    }
}
