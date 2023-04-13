package org.example.entity;
import java.util.*;

public class GroupMember {

    private String phone;
    private String name;
    private List<Expense> expenses;
    private Integer totalOwed;
    private Map<UUID, Map<UUID, Integer>> balanceSheet;

    public Map<UUID, Map<UUID, Integer>> getBalanceSheet() {
        return balanceSheet;
    }



    public GroupMember(String name, String phone) {
        this.name = name;
        this.phone = phone;
        this.expenses = new ArrayList<>();
        this.balanceSheet = new HashMap<>();
    }

    public void setBalanceSheet(Map<UUID, Map<UUID, Integer>> balanceSheet) {
        this.balanceSheet = balanceSheet;
    }

    public String getName() {
        return name;
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    public int getTotalOwed() {
        return totalOwed;
    }

    public void setTotalOwed(int totalOwed) {
        this.totalOwed = totalOwed;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "\n GroupMember { \n name: " + name +
                ",\n expenses: " + expenses +
                ",\n totalOwed: " + totalOwed + " }";
    }

} // GroupMember class
