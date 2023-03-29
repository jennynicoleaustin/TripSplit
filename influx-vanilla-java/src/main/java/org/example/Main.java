package org.example;

import java.lang.reflect.Member;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

// ToDo: Create a main function to do the following
//    - Calls the createTripGroup once
        TripGroup jenny = Services.createGroup("Jenny Austin");

        //  Calls the function to add 3 members
        Services.addMembers(jenny, "Tina", "Jim", "Misty");

        //  calls the function to add $30 as an expense for each of the members
        Expense expense30 = Services.addExpense("Coffee", 90, jenny, "Tina", "Jim", "Misty");

//    - calls the split function to show the final output

//        Test...
        System.out.println(jenny);
//        System.out.println(jenny.getMembers());
        System.out.println(expense30);


    } // Main Method
} // Main Class