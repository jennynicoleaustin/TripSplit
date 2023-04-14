package org.example.services;

import org.example.entity.GroupMember;
import org.example.entity.TripGroup;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public class SplitManager {

    public static void printBalanceSheet(GroupMember member, TripGroup group) {
        Map<UUID, Integer> balanceSheet = member.getBalanceSheet();
        balanceSheet.forEach((k,v) -> {
            String balanceMemberName = GroupMemberService.getMemberById(k, group).getName();
            System.out.println(balanceMemberName + " " + v);
        });
    }

    public static void printAllBalances (TripGroup group) {
        List<GroupMember> members = group.getMembers();
        for(GroupMember member : members) {
            printBalanceSheet(member, group);
        }
    }

} // SplitManager Class
