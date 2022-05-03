package com.sharibekoff.financeplanner.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class Account {
    private final Long id;
    private BigDecimal balance;
    private String name;

    public enum AccountType {
        BANK_ACCOUNT, BROKERAGE_ACCOUNT, CRYPTO_ACCOUNT, CASH
    }

    private List<MoneyTransaction> transactions;

    public void addTransaction(MoneyTransaction transaction) {
        this.transactions.add(transaction);
    }
}
