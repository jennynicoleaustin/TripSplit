package org.example;

import org.example.entity.Expense;
import org.example.entity.TripGroup;
import org.example.services.ExpenseService;
import org.example.services.TripGroupService;

public class Main {
    public static void main(String[] args) {

        // 5. Create a main function to do the following
        // Calls the createTripGroup once
        TripGroup jenny = TripGroupService.createGroup("Jenny Austin");

        //  Calls the function to add 3 members
        TripGroupService.addMembers(jenny, "Tina", "Jim", "Misty", "jenny");
        // Print trip group to show added members
        System.out.println(jenny);

        //  calls the function to add $30 as an expense for each of the members
        Expense expense30 = ExpenseService.addExpense("Coffee", 90, jenny, "Tina", "Jim", "Misty", "Tina");

        Expense expense100 = ExpenseService.addExpense("dinosaur", 100, jenny, "Jim", "Jim", "Misty", "Tina", "jenny");

// ToDO: add more expenses for different amounts, same amounts, same members, diff members, different group.

//        TODO: --- what happens when you do something you shouldn't is null in the expense name or members, catch exceptions/ handle exceptions

        // calls the split function to show the final output
        System.out.println(expense30);
        System.out.println(expense100);

    } // Main Method
} // Main Class

// TODO Add in who paid for each expense and function to indicate who owes what.

// TODO Potentially adding unit tests.

// TODO SplitWise app for design ideas.