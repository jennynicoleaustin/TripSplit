package org.example.services;

import org.example.entity.GroupMember;
import org.example.entity.TripGroup;

import java.util.ArrayList;
import java.util.List;

public class TripGroupService {
    // 1. Create a function to create a Trip Group.
    public static TripGroup createGroup(String groupName) {
        TripGroup newGroup = new TripGroup(groupName);
        System.out.println(newGroup);
        return newGroup;
    }

    // TODO: Create a function that accepts any type to return any list of members
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



} // TripGroupService
