package org.example.services;
import org.example.entity.Expense;
import org.example.entity.GroupMember;
import org.example.entity.TripGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class ExpenseService {

    // Based on TripGroup and a variable number of member names, create a list of members to be added to the expense
    public static List<GroupMember> expenseMemberList(TripGroup group, String... memberName) {
        List<GroupMember> expenseMembers = new ArrayList<>();
        for (String name : memberName) {
            GroupMember member = GroupMemberService.getMemberByName(name, group);
            expenseMembers.add(member);
        }
        return expenseMembers;
    }

    // Add the expense against each member in a list
    public static void addExpenseToAllMembers(List<GroupMember> members, Expense expense) {
        for (GroupMember member : members) member.getExpenses().add(expense);
    }


    // 3. Create a function to add expenses.
    // -> Creates a list of all members to be added to new expense, creates new expense, adds the expense against all members, update all members total owed amount, attaches expense to the TripGroup
    public static Expense addExpense(String name, int total, TripGroup group, String paidByName, String... memberName) {
//        get expense membersList
        List<GroupMember> members = expenseMemberList(group, memberName);
//        get paidBy member
        GroupMember paidBy = GroupMemberService.getMemberByName(paidByName, group);
//        create new expense
        Expense expense = new Expense(name, members, total, paidBy);
//        add the expense to everyone
        addExpenseToAllMembers(members, expense);
//        add expense to TripGroup expenses
        group.getExpenseList().add(expense);
//        Update balance sheet for everyone
        BalanceService.updateBalanceAll(paidBy, expense);
        return expense;
    }

} // ExpenseService Class

