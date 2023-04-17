package org.example;

import org.example.Mangers.ScannerManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ScannerManager.printWelcomeMenu(sc);

//        // 5. Create a main function to do the following
//        // Calls the createTripGroup once
//        TripGroup jenny = TripGroupService.createGroup("Jenny Austin");
//
//        //  Calls the function to add 3 members
//        TripGroupService.addMembers(jenny, "Tina", "Jim", "Misty", "jenny");
//        // Print trip group to show added members
//        System.out.println(jenny);
//
//        //  calls the function to add $30 as an expense for each of the members
//        Expense expense30 = ExpenseService.addExpense("Coffee", 90, jenny, "Tina", "Jim", "Misty", "Tina");
//
//        Expense expense100 = ExpenseService.addExpense("dinosaur", 100, jenny, "Jim", "Jim", "Misty", "Tina", "jenny");
//
//        System.out.println(expense30 + "\n" + expense100 + "\n");
//
//        // calls the split function to show the final output
//        SplitManager.printAllBalances(jenny);
//
//        TripGroupService.addMember(jenny, "jenny");
    } // Main Method
} // Main Class

