package com.sharibekoff.financeplanner.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class MoneyTransaction {
    private final Long id;
    private BigDecimal amount;
    private String description;

    public enum TransactionType {
        SPENT, EARNED
    }

    public enum Category {
        BANK, HOUSEHOLD, EDUCATION, SALARY, TAXES
    }
}
