package org.example.services;

import org.example.entity.GroupMember;

import java.util.Map;
import java.util.UUID;

public class SplitManager {

    private void printBalanceSheet (GroupMember member) {
        Map<UUID, Integer> balanceSheet = member.getBalanceSheet();

    }

} // SplitManager Class
