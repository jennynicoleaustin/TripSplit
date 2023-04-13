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

//    TODO Create functions for adding balanceSheet information for every user.

    public static void updateBalanceAll(GroupMember paidByMember, Expense expense) {
        List<GroupMember> members = expense.getMembers();
        Map<UUID, Integer> paidByBalances = paidByMember.getBalanceSheet();
        UUID paidByMemberId = paidByMember.getId();
        Integer splitAmount = expense.getSplitAmount();
        for (GroupMember paidTo : members) {
            UUID paidToMemberId = paidTo.getId();
            if (!paidToMemberId.equals(paidByMemberId)) { // Better to create a filtered list? or the if check?
                updateBalancePayer(paidByBalances, paidToMemberId, splitAmount);
                updateBalanceNonPayer(paidTo.getBalanceSheet(), paidToMemberId, splitAmount);
            }
        }
    }

    public static void updateBalancePayer (Map<UUID, Integer> paidByBalanceSheet, UUID paidToMemberId, Integer splitAmount) {
        paidByBalanceSheet.putIfAbsent(paidToMemberId, 0); // if member is not already on the balance sheet, add & initialize
        Integer currentAmountOwed = paidByBalanceSheet.get(paidToMemberId); // get the current balance owed
        Integer updatedAmountOwed = currentAmountOwed + splitAmount; // add the new expense split amount
        paidByBalanceSheet.put(paidToMemberId, updatedAmountOwed); // update the balance sheet with the new amounts

    }

    public static void updateBalanceNonPayer (Map<UUID, Integer> balanceSheet, UUID paidByMemberId, Integer splitAmount) {
            balanceSheet.putIfAbsent(paidByMemberId, 0); // if member is not already on the balance sheet, add & initialize
            Integer currentAmountOwed = balanceSheet.get(paidByMemberId); // get the current balance owed
//        This is the variable argument area....
            Integer updatedAmountOwed = currentAmountOwed - splitAmount; // add the new expense split amount
            balanceSheet.put(paidByMemberId, updatedAmountOwed); // update the balance sheet with the new amount
    }

    // Add the expense against each member in a list
    public static void addExpenseToAllMembers(List<GroupMember> members, Expense expense) {
        for (GroupMember member : members) member.getExpenses().add(expense);
    }



    // 3. Create a function to add expenses.
    // -> Creates a list of all members to be added to new expense, creates new expense, adds the expense against all members, update all members total owed amount, attaches expense to the TripGroup
    public static Expense addExpense(String name, int total, TripGroup group, String paidByName, String... memberName) {
        List<GroupMember> members = expenseMemberList(group, memberName);
        GroupMember paidBy = GroupMemberService.getMemberByName(paidByName, group);
        Expense expense = new Expense(name, members, total, paidBy);
        addExpenseToAllMembers(members, expense);
        group.getExpenseList().add(expense);
        updateBalanceAll(paidBy, expense);
        return expense;
    }

} // ExpenseService Class

//    public static void updateMemberOwedTotal(GroupMember member) {
//        List<Expense> expenses = member.getExpenses();
//        int total = 0;
//        for (Expense expense : expenses) {
//            total += expense.getSplitAmount();
//        }
//        member.setTotalOwed(total);
//    }
//
//    public static void updateAllMemberTotals(List<GroupMember> members) {
//        for (GroupMember member : members) updateMemberOwedTotal(member);
//    }
