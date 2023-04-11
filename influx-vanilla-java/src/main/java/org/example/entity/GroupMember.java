package org.example.entity;

import org.example.entity.Expense;

import java.util.ArrayList;
import java.util.List;

public class GroupMember {

    private String name;
    private List<Expense> expenses;
    private int totalOwed;

    //    TODO: calculated total amount due, based off their expenses.
    public GroupMember(String name) {
        this.name = name;
        this.expenses = new ArrayList<>(); //  TODO don't initialize in the constructor
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


    @Override
    public String toString() {
        return "\n GroupMember { \n name: " + name +
                ",\n expenses: " + expenses +
                ",\n totalOwed: " + totalOwed + " }";
    }
} // GroupMember class
