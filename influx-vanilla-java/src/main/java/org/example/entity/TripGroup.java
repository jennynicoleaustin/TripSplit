package org.example.entity;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TripGroup {

    private UUID id;
    private String groupName;
    private List<GroupMember> members;
    private List<Expense> expenseList;

    public TripGroup(String groupName) {
        this.groupName = groupName;
        this.id = UUID.randomUUID();
        this.members = new ArrayList<>();
        this.expenseList = new ArrayList<>();
    }

    public List<GroupMember> getMembers() {
        return members;
    }

    public void setMember (GroupMember member) {
        members.add(member);
    }

    public List<Expense> getExpenseList() {
        return expenseList;
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

    public void setMembers(List<GroupMember> members) {
        this.members = members;
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
