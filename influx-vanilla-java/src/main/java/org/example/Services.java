package org.example;

import java.util.ArrayList;
import java.util.List;

public class Services {

    // 1. Create a function to create a Trip Group.
    public static TripGroup createGroup(String groupName) {
        TripGroup newGroup = new TripGroup(groupName);
// TODO: - write the data to json (Every time or only at the end?)
        System.out.println(newGroup);
        return newGroup;
    }

    //    TODO: Create a function that accepts any type to return any list of members
    // create helper function for slightly less cluttered code
    public static List<GroupMember> getMembersList(TripGroup group) {
        return group.getMembers();
    }

    // 2. Create a function to Add a member to the Trip group
    public static void addMember(TripGroup group, String name) {
        GroupMember newMember = new GroupMember(name);
        getMembersList(group).add(newMember);
    }

    // Add multiple members to a group at once using variable arguments
    public static void addMembers(TripGroup group, String... nameToAdd) {
        for (String name : nameToAdd) addMember(group, name);
    }



    // Get a member based on the trip group and the members name
// TODO: add in to lowercase so format of name does not matter
// TODO: create error handling for if member does not exist
    public static GroupMember getMember(String memberName, TripGroup group) {
        GroupMember member = null;
        for (GroupMember a : getMembersList(group)) {
            if (memberName.equals(a.getName())) {
                member = a;
                break;
            }
        }
        return member;
    }

    // Based on TripGroup and a variable number of member names, create a list of members to be added to the expense
    public static List<GroupMember> expenseMemberList(TripGroup group, String... memberName) {
        List<GroupMember> expenseMembers = new ArrayList<>();
        for (String name : memberName) {
            GroupMember member = getMember(name, group);
            expenseMembers.add(member);
        }
        return expenseMembers;
    }

    // Add the expense against each member in a list
    public static void addExpenseToAllMembers(List<GroupMember> members, Expense expense) {
        for (GroupMember member : members) member.getExpenses().add(expense);
    }

    public static void updateMemberOwedTotal(GroupMember member) {
        List<Expense> expenses = member.getExpenses();
        int total = 0;
        for (Expense expense : expenses) {
            total += expense.getSplitAmount();
        }
        member.setTotalOwed(total);
    }

    public static void updateAllMemberTotals(List<GroupMember> members) {
        for (GroupMember member : members) updateMemberOwedTotal(member);
    }

    // 3. Create a function to add expenses.
    // -> Creates a list of all members to be added to new expense, creates new expense, adds the expense against all members, update all members total owed amount, attaches expense to the TripGroup
    public static Expense addExpense(String name, int total, TripGroup group, String... memberName) {
        List<GroupMember> members = expenseMemberList(group, memberName);
        Expense expense = new Expense(name, members, total);
        addExpenseToAllMembers(members, expense);
        updateAllMemberTotals(members);
        group.setExpenseList(expense);
        return expense;
    }



    // 4. Create a function to show the expenses split across the members
    public static void memberTotals(TripGroup group) {
        List<GroupMember> members = group.getMembers();
    }

} // Services Class
