package org.example.services;

import org.example.entity.GroupMember;
import org.example.entity.TripGroup;


public class GroupMemberService {

    public static GroupMember getMember(String memberName, TripGroup group) {
        GroupMember member = null;
        for (GroupMember a : TripGroupService.getMembersList(group)) {
            if (memberName.equals(a.getName())) {
                member = a;
                break;
            }
        }
        return member;
    }


} // GroupMemberService
