package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TripGroup {

    private String groupName;
    private List<GroupMember> members;

    public TripGroup(String groupName) {
        this.groupName = groupName;
        this.members = new ArrayList<>();
    }


    public List<GroupMember> getMembers() {
        return members;
    }

    public void setMember (GroupMember member) {
        members.add(member);
    }


    @Override
    public String toString() {
        return "TripGroup{" +
                ", groupName='" + groupName + '\'' +
                ", members=" + members +
                '}';
    }
} // TripGroup Class
