package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Testing
        TripGroup testGroup = Services.createGroup("Jenny Austin");
        Services.addMember("Tina", testGroup);
        Services.addMember("Jim", testGroup);
        Services.addMember("Misty", testGroup);
        Services.addMember("Andy", testGroup);
        Services.addMember("Hannah", testGroup);

        List<GroupMember> testExpenseMembers = Services.expenseMemberList(testGroup, "Tina", "Jim");

        Expense testExpense = new Expense("Coffee", testExpenseMembers, 20);
        System.out.println(testExpense);
        List<GroupMember> expenseMembers = testExpense.getMembers();
        System.out.println(expenseMembers);

        for (GroupMember member : expenseMembers) {
            List<Expense> memberExpenses = member.getExpenses();
            memberExpenses.add(testExpense);
            System.out.println(memberExpenses);
        }

//        Causing stackoverflow regarding toString
//        Services.addExpenseToAllMembers(testExpenseMembers, testExpense);
//        System.out.println(testExpense.getMembers());




//        Expense newExpense =  Services.addExpense("Parasailing", 400, testGroup, "Tina", "Andy", "Hannah", "Jim");
//        System.out.println(newExpense);

// ToDo: Create a main function to do the following
//    - Calls the createTripGroup once
//    - Calls the function to add 3 members
//    - calls the function to add $30 as an expense for each of the members
//    - calls the split function to show the final output



    } // Main Method
} // Main Class