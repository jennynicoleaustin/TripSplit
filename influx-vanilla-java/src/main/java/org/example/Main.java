package org.example;

public class Main {
    public static void main(String[] args) {

        // 5. Create a main function to do the following
        // Calls the createTripGroup once
        TripGroup jenny = Services.createGroup("Jenny Austin");

        //  Calls the function to add 3 members
        Services.addMembers(jenny, "Tina", "Jim", "Misty");

        //  calls the function to add $30 as an expense for each of the members
        Expense expense30 = Services.addExpense("Coffee", 90, jenny, "Tina", "Jim", "Misty");

        // calls the split function to show the final output
        System.out.println(expense30);

    } // Main Method
} // Main Class