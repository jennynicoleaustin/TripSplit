package org.example.entity;

import java.util.*;

public class GroupMember {

    private UUID id;
    private String name;
    private List<Expense> expenses;
    private Map<UUID, Balance> balanceSheet;



    public Map<UUID, Balance> getBalanceSheet() {
        return balanceSheet;
    }

    public void setBalanceSheet(Map<UUID, Balance> balanceSheet) {
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
        return "\n GroupMember { \n name: " + name +
                ",\n id: " + id + " }";
//                ",\n totalOwed: " + totalOwed +
    }

} // GroupMember class
