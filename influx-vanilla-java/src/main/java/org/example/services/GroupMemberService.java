package org.example.services;

import org.example.entity.GroupMember;
import org.example.entity.TripGroup;

import java.util.UUID;


public class GroupMemberService {

    public static GroupMember createMember (String name, String phoneNumber) {
        return new GroupMember(name, phoneNumber);
    }
    public static GroupMember getMemberByName(String memberName, TripGroup group) {
        GroupMember member = null;
        for (GroupMember a : TripGroupService.getMembersList(group)) {
            if (memberName.equals(a.getName())) {
                member = a;
                break;
            }
        }
        return member;
    }

    public static GroupMember getMemberByPhone(UUID memberId, TripGroup group) {
        GroupMember member = null;
        for (GroupMember a : TripGroupService.getMembersList(group)) {
            if (memberId.equals(a.getPhone())) {
                member = a;
                break;
            }
        }
        return member;
    }

} // GroupMemberService
