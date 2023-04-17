package org.example.entity;

import java.util.*;

public class GroupMember {

    private UUID id;
    private String name;
    private List<Expense> expenses;
    private Map<UUID, Integer> balanceSheet;

    public Map<UUID, Integer> getBalanceSheet() {
        return balanceSheet;
    }


    public GroupMember(String name, List<Expense> expenses, Map<UUID, Integer> balanceSheet) {
        this.name = name;
        this.id = UUID.randomUUID();
        this.expenses = expenses;
        this.balanceSheet = balanceSheet;
    }

    public void setBalanceSheet(Map<UUID, Integer> balanceSheet) {
        this.balanceSheet = balanceSheet;
    }

    public String getName() {
        return name;
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "\n GroupMember { name: " + name +
                " }";

    }

} // GroupMember class
