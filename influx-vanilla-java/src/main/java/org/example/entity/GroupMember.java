package org.example.entity;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class GroupMember {

    private UUID id;
    private String name;
    private List<Expense> expenses;
    private int totalOwed;

    public GroupMember(String name) {
        this.name = name;
        this.id = UUID.randomUUID();
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


    @Override
    public String toString() {
        return "\n GroupMember { \n name: " + name +
                ",\n expenses: " + expenses +
                ",\n totalOwed: " + totalOwed + " }";
    }

    public UUID getId() {
        return id;
    }
} // GroupMember class
