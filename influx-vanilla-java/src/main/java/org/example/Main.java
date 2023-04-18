package org.example;
import org.example.Mangers.WelcomeMenu;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        WelcomeMenu.printWelcomeMenu(sc);


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

