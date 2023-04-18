package org.example.services;

import org.example.entity.Expense;
import org.example.entity.GroupMember;
import org.example.entity.TripGroup;

import java.util.ArrayList;
import java.util.List;

public class TripGroupService {

    // 1. Create a function to create a Trip Group.
    public static TripGroup createGroup(String groupName) {
        List<GroupMember> members = new ArrayList<>();
        List<Expense> expenseList = new ArrayList<>();
        return new TripGroup(groupName, members, expenseList);
    }

    //    get TripGroup Member List
    public static List<GroupMember> getMembersList(TripGroup group) {
        return group.getMembers();
    }

    //    Check if member with that member name exists already
    public static boolean memberNameInUse(String name, TripGroup group) {
        if (GroupMemberService.getMemberByName(name, group) != null) {
            System.out.println("Member with that name already exists in Trip Group: " + group.getGroupName());
            return true;
        } else {
            return false;
        }
    }

    // 2. Create a function to Add a member to the Trip group
    public static void addMember(TripGroup group, String name) {
        if (!memberNameInUse(name, group)) {
            GroupMember newMember = GroupMemberService.createMember(name);
            getMembersList(group).add(newMember);
        }
    }

    // Add multiple members to a group at once using variable arguments
    public static void addMembers(TripGroup group, String... nameToAdd) {
        for (String name : nameToAdd) addMember(group, name);
    }

} // TripGroupService
