package org.example.entity;

import java.util.*;

public class GroupMember {

    private UUID id;
    private String name;
    private List<Expense> expenses;
    //    private Integer totalOwed;
    private Map<UUID, Integer> balanceSheet;

    public Map<UUID, Integer> getBalanceSheet() {
        return balanceSheet;
    }


    public GroupMember(String name) {
        this.name = name;
        this.id = UUID.randomUUID();
        this.expenses = new ArrayList<>();
        this.balanceSheet = new HashMap<>();
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

//    public int getTotalOwed() {
//        return totalOwed;
//    }
//
//    public void setTotalOwed(int totalOwed) {
//        this.totalOwed = totalOwed;
//    }

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
//                ",\n totalOwed: " + totalOwed +
    }

} // GroupMember class
