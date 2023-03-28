package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class GroupMember {

    private String name;
    private List<Expense> expenses;
    private int totalOwed;

    //    TODO: calculated total amount due, based off their expenses.
    public GroupMember(String name) {
        this.name = name;
        this.expenses = new ArrayList<>();
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

//    @Override
//    public String toString() {
//        return "GroupMember{" +
//                "name='" + name + '\'' +
//                ", expenses=" + expenses +
//                ", totalOwed=" + totalOwed +
//                '}';
//    }


    @Override
    public String toString() {
        return "GroupMember { \n name: " + name +
                ",\n expenses: " + expenses +
                ",\n totalOwed: " + totalOwed + " } \n";
    }
} // GroupMember class
