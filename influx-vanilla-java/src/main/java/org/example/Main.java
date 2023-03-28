package org.example;

public class Main {
    public static void main(String[] args) {

//        Testing
        TripGroup testGroup = Services.createGroup("Jenny Austin");
        Services.addMember("Tina", testGroup);
        Services.addMember("Jim", testGroup);
        Services.addMember("Misty", testGroup);
        Services.addMember("Andy", testGroup);
        Services.addMember("Hannah", testGroup);

        System.out.println(Services.getMember("Jim", testGroup));


// ToDo: Create a main function to do the following
//    - Calls the createTripGroup once
//    - Calls the function to add 3 members
//    - calls the function to add $30 as an expense for each of the members
//    - calls the split function to show the final output



    } // Main Method
} // Main Class