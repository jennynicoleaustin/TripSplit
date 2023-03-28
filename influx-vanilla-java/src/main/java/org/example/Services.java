package org.example;

import java.util.List;
public class Services {

// Create a function to create a Trip Group.
    public static TripGroup createGroup(String groupName) {
//        Use class constructor to create a new TripGroup, pass in String value for the TripGroup name, constructor creates new expenses list, and generates a UUID
        TripGroup newGroup = new TripGroup(groupName);
//        TODO: // - write the data to json (Every time or only at the end?)
        System.out.println(newGroup);
        return newGroup;
    }

    public static List<GroupMember> getMembersList (TripGroup group) {
        return group.getMembers();
    }

// Create a function to Add a member to the Trip group
    public static void addMember(String name, TripGroup group) {
//        Create member
        GroupMember newMember = new GroupMember(name);
//        Add new member to that particular Trip Group's member List
        getMembersList(group).add(newMember);
        System.out.println(group);
    }

//    ToDo: Create a function to add expenses.
//  - Expenses should always be added against a member
//  - Can be called multiple times with different or same expense amounts and for different or same members
//        - this suggests that each expense is added against members (plural!) meaning every time you add an expense you should indicate which members of the group are splitting this expense

//    Returns the first member that matches within the list
    public static GroupMember getMember (String memberName, TripGroup group) {
        GroupMember member = null;
        for (GroupMember a : getMembersList(group)) {
            if (memberName.equals(a.getName())) {
                member = a;
                break;
            }
        }
        return member;
    }



// ToDo: Create a function to show the expenses split across the members
//- use console.log to show the final output
//    - The output should clearly indicate who owes what amount to whom.


} // Services Class
