package org.example;

import java.util.List;

public class Expense {

    private String name;
    private List<GroupMember> members;
    private int total;
    private int splitAmount;

// TODO: How to tell Java to except members as strings...
    public Expense(String name, List<GroupMember> members, int total) {
        this.name = name;
        this.members = members;
        this.total = total;
        this.splitAmount = total / members.size();
    }

    public String getName() {
        return name;
    }

    public List<GroupMember> getMembers() {
        return members;
    }

    public int getTotal() {
        return total;
    }

    public int getSplitAmount() {
        return splitAmount;
    }

    @Override
    public String toString() {
        return
                "Expense { " +
                "name='" + name + '\'' +
                ", total=" + total +
                ", splitAmount=" + splitAmount +
                '}';
    }
} // Expense Class
