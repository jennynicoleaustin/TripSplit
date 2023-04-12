package org.example.services;
import org.example.entity.Expense;
import org.example.entity.GroupMember;
import org.example.entity.TripGroup;
import java.util.ArrayList;
import java.util.List;

public class ExpenseService {

    // Based on TripGroup and a variable number of member names, create a list of members to be added to the expense
    public static List<GroupMember> expenseMemberList(TripGroup group, String... memberName) {
        List<GroupMember> expenseMembers = new ArrayList<>();
        for (String name : memberName) {
            GroupMember member = GroupMemberService.getMember(name, group);
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
    public static Expense addExpense(String name, int total, TripGroup group, GroupMember paidBy, String... memberName) {
        List<GroupMember> members = expenseMemberList(group, memberName);
        Expense expense = new Expense(name, members, total, paidBy);
        addExpenseToAllMembers(members, expense);
        updateAllMemberTotals(members);
        group.setExpenseList(expense);
        return expense;
    }

} // ExpenseService Class
