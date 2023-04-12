package org.example.entity;

import java.util.ArrayList;
import java.util.List;

public class Expense {

    private String name;
    private List<GroupMember> members;
    private int total;
    private int splitAmount;
    private GroupMember paidBy;

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

    public List<String> memberNamesToString (List<GroupMember> members) {
        List<String> names = new ArrayList<>();
        for (GroupMember member : members) {
            names.add(member.getName());
        }
        return names;
    }

    @Override
    public String toString() {
        return
                " \n Expense { \n " +
                        "name: " + name +
                        ", \n total: " + total +
                        ", \n splitAmount: " + splitAmount +
                        ", \n members: " + memberNamesToString(members) +
                        " } ";
    }
} // Expense Class
