package org.example.Mangers;

import org.apache.commons.lang3.StringUtils;
import org.example.entity.TripGroup;

import java.util.Scanner;

public class WelcomeMenu {


    public static void printWelcomeMenu (Scanner sc ) {
        System.out.println(
                "\n" + ManagerUtils.breakPt + "\n" +
                        StringUtils.center("Welcome to TripSplit", 50) + "\n" +
                        ManagerUtils.breakPt + "\n" +
                        "1. Create a Trip Group\n" +
                        "5. Exit\n" +
                        StringUtils.center("Enter an option (1, 2)", 50) + "\n" + ManagerUtils.breakPt +
                        "\n");
        welcomeMenu(sc);
    }

    public static void welcomeMenu(Scanner sc) {
        int choice = ManagerUtils.getChoice(sc);
        switch (choice) {
            case 1:
                TripGroupManager.newTripGroup(sc);
                break;
            case 2:
                ManagerUtils.exit();
                break;
        }
    }

} // InputManager Class
