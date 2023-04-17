package org.example.Mangers;

import org.example.entity.GroupMember;
import org.example.entity.TripGroup;
import org.example.services.GroupMemberService;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public class SplitManager {


    public static void printBalanceSheet(GroupMember member, TripGroup group) {
        Map<UUID, Integer> balanceSheet = member.getBalanceSheet();
        String balanceSheetMember = member.getName();
        System.out.println(balanceSheetMember + "'s Balance Sheet" + "\n--------");
        balanceSheet.forEach((k,v) -> {
            String balanceMemberName = GroupMemberService.getMemberById(k, group).getName();
            printBalance(balanceSheetMember, balanceMemberName, v);
        });
        System.out.println("--------\n");
    }

    public static void printAllBalances (TripGroup group) {
        List<GroupMember> members = group.getMembers();
        for(GroupMember member : members) {
            printBalanceSheet(member, group);
        }
    }

    public static void printBalance (String member1, String member2, Integer amount) {
        if (amount < 0) {
            System.out.println(member1 + " owes " + member2 + ": $" + Math.abs(amount));
        } else if (amount > 0 ) {
            System.out.println(member2 + " owes " + member1 + ": $" + Math.abs(amount));
        }
    }

} // SplitManager Class
