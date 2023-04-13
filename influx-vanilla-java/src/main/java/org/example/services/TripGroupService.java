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
//    get TripGroup Member List
    public static List<GroupMember> getMembersList(TripGroup group) {
        return group.getMembers();
    }

    // 2. Create a function to Add a member to the Trip group
    public static void addMember(TripGroup group, GroupMember memberToAdd) {
        getMembersList(group).add(memberToAdd);
    }

//    ToDO: Update to take in the phone number as well.
    // Add multiple members to a group at once using variable arguments
    public static void addMembers(TripGroup group, GroupMember... membersToAdd) {
        for (GroupMember member : membersToAdd) addMember(group, member);
    }



} // TripGroupService
