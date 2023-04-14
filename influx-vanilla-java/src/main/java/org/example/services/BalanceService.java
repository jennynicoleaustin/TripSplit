package org.example.services;

import org.example.entity.Balance;
import org.example.entity.Expense;
import org.example.entity.GroupMember;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public class BalanceService {

    public Balance createBalance (GroupMember nonPayer, Expense expense) {
        GroupMember payer = expense.getPaidBy();
    }
    public static void updateBalanceAll(Expense expense) {
        List<GroupMember> members = expense.getMembers();
        GroupMember payerMember = expense.getPaidBy();
        Map<UUID, Balance> payerBalances = payerMember.getBalanceSheet();
        UUID payerId = payerMember.getId();
        Integer splitAmount = expense.getSplitAmount();
        for (GroupMember nonPayer : members) {
            UUID nonPayerId = nonPayer.getId();
            if (!nonPayerId.equals(payerId)) { // Better to create a filtered list? or the if check?
                updateBalancePayer(payerBalances, nonPayerId, splitAmount);
                updateBalanceNonPayer(nonPayer.getBalanceSheet(), payerId, splitAmount);
            }
        }
    }

    public static void updateBalancePayer(Map<UUID, Balance> payerBalanceSheet, UUID nonPayerId, Integer splitAmount) {
        payerBalanceSheet.putIfAbsent(nonPayerId, 0); // if member is not already on the balance sheet, add & initialize
        Integer currentAmountOwed = payerBalanceSheet.get(nonPayerId); // get the current balance owed
        Integer updatedAmountOwed = currentAmountOwed + splitAmount; // add the new expense split amount
        payerBalanceSheet.put(nonPayerId, updatedAmountOwed); // update the balance sheet with the new amounts

    }

    public static void updateBalanceNonPayer(Map<UUID, Integer> balanceSheet, UUID paidByMemberId, Integer splitAmount) {
        balanceSheet.putIfAbsent(paidByMemberId, 0); // if member is not already on the balance sheet, add & initialize
        Integer currentAmountOwed = balanceSheet.get(paidByMemberId); // get the current balance owed
//        This is the variable argument area....
        Integer updatedAmountOwed = currentAmountOwed - splitAmount; // add the new expense split amount
        balanceSheet.put(paidByMemberId, updatedAmountOwed); // update the balance sheet with the new amount
    }

} // BalanceService Class
