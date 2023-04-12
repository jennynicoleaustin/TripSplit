package org.example;

import org.example.entity.Expense;
import org.example.entity.TripGroup;

public class Main {
    public static void main(String[] args) {

        // 5. Create a main function to do the following
        // Calls the createTripGroup once
        TripGroup jenny = Services.createGroup("Jenny Austin");

        //  Calls the function to add 3 members
        Services.addMembers(jenny, "Tina", "Jim", "Misty", "jenny");
        // Print trip group to show added members
        System.out.println(jenny);

        //  calls the function to add $30 as an expense for each of the members
        Expense expense30 = Services.addExpense("Coffee", 90, jenny, "Tina", "Jim", "Misty");

// ToDO: add more expenses for different amounts, same amounts, same members, diff members, different group.

//        TODO: --- what happens when you do something you shouldn't is null in the expense name or members, catch exceptions/ handle exceptions

        // calls the split function to show the final output
        System.out.println(expense30);

    } // Main Method
} // Main Class

// TODO Add in who paid for each expense and function to indicate who owes what.

// TODO Potentially adding unit tests.

// TODO Splitwise app for design ideas.