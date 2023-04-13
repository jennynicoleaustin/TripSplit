package org.example.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Expense {

    private String name;
    private UUID id;
    private List<GroupMember> members;
    private Integer total;
    private Integer splitAmount;
    private GroupMember paidBy;



    public Expense(String name, List<GroupMember> members, int total, GroupMember paidBy) {
        this.name = name;
        this.id = UUID.randomUUID();
        this.members = members;
        this.paidBy = paidBy;
        this.total = total;
        this.splitAmount = total / members.size();
    }
    public GroupMember getPaidBy() {
        return paidBy;
    }

    public void setPaidBy(GroupMember paidBy) {
        this.paidBy = paidBy;
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
                        ", \n paidBy: " + paidBy.getName() +
                        ", \n splitAmount: " + splitAmount +
                        ", \n members: " + memberNamesToString(members) +
                        " } ";
    }
} // Expense Class
