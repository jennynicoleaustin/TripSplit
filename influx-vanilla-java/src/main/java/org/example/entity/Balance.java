package org.example.entity;

import java.util.List;
import java.util.UUID;

public class Balance {

    private UUID payerId;
    private UUID nonPayerId;
    private Integer amount;
    private List<UUID> expenseIds;

    public Balance(UUID payerId, UUID nonPayerId, Integer amount, List<UUID> expenseIds) {
        this.payerId = payerId;
        this.nonPayerId = nonPayerId;
        this.amount = amount;
        this.expenseIds = expenseIds;
    }

    public UUID getPayerId() {
        return payerId;
    }

    public void setPayerId(UUID payerId) {
        this.payerId = payerId;
    }

    public UUID getNonPayerId() {
        return nonPayerId;
    }

    public void setNonPayerId(UUID nonPayerId) {
        this.nonPayerId = nonPayerId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public List<UUID> getExpenseIds() {
        return expenseIds;
    }

    public void setExpenseIds(List<UUID> expenseIds) {
        this.expenseIds = expenseIds;
    }
} // Balance Class
