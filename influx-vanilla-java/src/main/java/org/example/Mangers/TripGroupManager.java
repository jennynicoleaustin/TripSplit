package org.example.Mangers;

import org.apache.commons.lang3.StringUtils;
import org.example.entity.Expense;
import org.example.entity.TripGroup;
import org.example.services.ExpenseService;
import org.example.services.GroupMemberService;
import org.example.services.TripGroupService;

import java.util.Scanner;

import static java.lang.System.out;

public class TripGroupManager {
    private static TripGroup workingTripGroup;

    public static void printTripGroupMenu(Scanner sc) {
        String groupName = workingTripGroup.getGroupName();
        System.out.println(
                "\n" + ManagerUtils.breakPt + "\n" +
                        StringUtils.center("Welcome the Trip Group " + groupName, 50) + "\n" +
                        ManagerUtils.breakPt + "\n" +
                        "1. Add members to " + groupName + "\n" +
                        "2. Add an Expense\n" +
                        "3. Show Balances for all members\n" +
                        "4. Exit\n" +
                        StringUtils.center("Enter an option (1, 2, 3, 4, 5)", 50) + "\n" + ManagerUtils.breakPt +
                        "\n");
        tripGroupMenu(sc);
    }

    // Main menu switch statement for navigation through the application
    public static void tripGroupMenu(Scanner sc) {
        int choice = ManagerUtils.getChoice(sc);
        switch (choice) {
            case 1 -> addMembers(sc);
            case 2 -> addExpense(sc);
            case 3 -> showBalance();
            case 4 -> ManagerUtils.exit();
            default -> tripGroupMenu(sc);
        }
    }

    public static void newTripGroup(Scanner sc) {
        String tripGroupName;
        out.println("Enter the name of your new Trip Group");
        tripGroupName = sc.nextLine();
        workingTripGroup = TripGroupService.createGroup(tripGroupName);
        out.println("\nTRIP GROUP CREATED\n" + tripGroupName);
        printTripGroupMenu(sc);
    }

    public static void addMembers(Scanner sc) {
        String memberName;
        out.println("\n" + ManagerUtils.breakPt + "\n" + StringUtils.center("ADD A MEMBER TO " + workingTripGroup.getGroupName(), 50) + "\n" + ManagerUtils.breakPt +
                "\nEnter the members name:");
        memberName = sc.nextLine();
        TripGroupService.addMember(workingTripGroup, memberName);
        out.println("Member: " + memberName + " has been added to the TripGroup: " + workingTripGroup.getGroupName());
        printTripGroupMenu(sc);
    }

    public static void addExpense(Scanner sc) {
        String expenseName;
        String paidByName;
        int total;
        out.println("\n" + ManagerUtils.breakPt + "\n" + StringUtils.center("ADD AN EXPENSE TO " + workingTripGroup.getGroupName(), 50) + "\n" + ManagerUtils.breakPt +
                "\nEnter the name of the expense:");
        expenseName = sc.nextLine();
        out.println("Enter the name of the Group Member that paid for this expense");
        paidByName = sc.nextLine();
        out.println("Enter the total amount paid for this expense as a whole number");
        total = sc.nextInt();
        sc.nextLine();
        ExpenseService.createExpense(expenseName, GroupMemberService.getMemberByName(paidByName, workingTripGroup), total);


        printTripGroupMenu(sc);
    }

    public static void addMemberToExpense(Scanner sc, TripGroup group, Expense expense) {
        String memberToAdd;
        out.println("Enter the name of the member you would like to add to this expense");
        memberToAdd = sc.nextLine();
        ExpenseService.addMemberToExpense(memberToAdd, group, expense);
    }

    public static void showBalance() { }

} // TripGroupManager Class
