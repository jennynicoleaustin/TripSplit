package org.example.entity;
import java.util.ArrayList;
import java.util.List;

public class TripGroup {

    private String groupName;
    private List<GroupMember> members;
    private List<Expense> expenseList;

    public TripGroup(String groupName) {
        this.groupName = groupName;
//        TODO Do not need to initialize in the constructor, but rather the first time you use the list.
        this.members = new ArrayList<>();
        this.expenseList = new ArrayList<>();
    }

    public List<GroupMember> getMembers() {
        return members;
    }

    public void setMember (GroupMember member) {
        members.add(member);
    }

    public void setExpenseList (Expense expense) {
        expenseList.add(expense);
    }

    public List<String> memberNamesToString (List<GroupMember> members) {
        List<String> names = new ArrayList<>();
        for (GroupMember member : members) {
            names.add(member.getName());
        }
        return names;
    }


    @Override
    public String toString() {
        return "\n TripGroup { \n" +
                " groupName: " + groupName +
                ", \n members: " + memberNamesToString(members) +
                ", \n expenses: " + expenseList +
                " }";
    }
} // TripGroup Class
