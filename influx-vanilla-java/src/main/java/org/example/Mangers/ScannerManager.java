package org.example.Mangers;

import org.apache.commons.lang3.StringUtils;
import org.example.entity.TripGroup;
import org.example.services.TripGroupService;

import java.util.Scanner;
import java.util.function.Consumer;

import static java.lang.System.out;

public class ScannerManager {
    public static String breakPt = StringUtils.repeat("-", 50);

    public static void printWelcomeMenu (Scanner sc ) {
        System.out.println(
                "\n" + breakPt + "\n" +
                        StringUtils.center("Welcome to TripSplit", 50) + "\n" +
                        breakPt + "\n" +
                        "1. Create a Trip Group\n" +
                        "5. Exit\n" +
                        StringUtils.center("Enter an option (1, 2)", 50) + "\n" + breakPt +
                        "\n");
        welcomeMenu(sc);
    }

    public static void welcomeMenu(Scanner sc) {
        int choice = getChoice(sc);
        switch (choice) {
            case 1:
                newTripGroup(sc);
                break;
            case 2:
                exit();
                break;
        }
    }

    public static void printMainMenu (Scanner sc, TripGroup group) {
        String groupName = group.getGroupName();
        System.out.println(
            "\n" + breakPt + "\n" +
                    StringUtils.center("Welcome the Trip Group " +groupName , 50) + "\n" +
                    breakPt + "\n" +
                    "1. Add members to " + groupName + "\n" +
                    "2. Add an Expense\n" +
                    "3. Show Balances for all members\n" +
                    "4. Exit\n" +
                    StringUtils.center("Enter an option (1, 2, 3, 4, 5)", 50) + "\n" + breakPt +
                    "\n");
        mainMenu(sc, group);
    }

    // Main menu switch statement for navigation through the application
    public static void mainMenu(Scanner sc, TripGroup group) {
        int choice = getChoice(sc);
        switch (choice) {
            case 1:
                addMembers(sc, group);
                break;
            case 2:
                addExpense(sc, group);
                break;
            case 3:
//                showBalance();
                break;
            case 4:
                exit();
                break;
            default:
                printMainMenu(sc, group);
        }
    }

    public static int getChoice(Scanner sc) {
        int choice = 0;
        try {
            choice = Integer.parseInt(sc.nextLine());
            return choice;

        } catch (NumberFormatException e) {
            System.out.println("Invalid input, please try again!");
            return getChoice(sc);
        }
    }

    public static void newTripGroup(Scanner sc) {
        String tripGroupName;
        out.println("Enter the name of your new Trip Group");
        tripGroupName = sc.nextLine();
        TripGroup group = TripGroupService.createGroup(tripGroupName);
        out.println("\nTRIP GROUP CREATED\n" + tripGroupName);
        printMainMenu(sc, group);
    }


    public static void addMembers(Scanner sc, TripGroup group) {
        String memberName;
        out.println("\n" + ScannerManager.breakPt + "\n" + StringUtils.center("ADD A MEMBER TO " + group.getGroupName(), 50) + "\n" + ScannerManager.breakPt +
                "\nEnter the members name:");
        memberName = sc.nextLine();
        TripGroupService.addMember(group, memberName);
        out.println("Member: " + memberName + " has been added to the TripGroup: " + group.getGroupName());
        printMainMenu(sc, group);
    }

    public static void addExpense(Scanner sc, TripGroup group) {
        String expenseName;
        String paidByName;
        int total;
        out.println("\n" + ScannerManager.breakPt + "\n" + StringUtils.center("ADD AN EXPENSE TO " + group.getGroupName(), 50) + "\n" + ScannerManager.breakPt +
                "\nEnter the name of the expense:");
        expenseName = sc.nextLine();
        out.println("Enter the name of the Group Member that paid for this expense");
        paidByName = sc.nextLine();
        out.println("Enter the total amount paid for this expense as a whole number");
            total = sc.nextInt();
        sc.nextLine();
        printMainMenu(sc, group);
    }
    public static void exit () {
        System.out.println(breakPt + "\n" + "Thanks for using Trip Split" + "\n" + breakPt);
        System.exit(0);
    }

    public static void createMembersList () {

    }

} // InputManager Class
