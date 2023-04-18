package org.example.Mangers;
import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class ManagerUtils {
    public static String breakPt = StringUtils.repeat("-", 50);
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

    public static void exit () {
        System.out.println(breakPt + "\n" + "Thanks for using Trip Split" + "\n" + breakPt);
        System.exit(0);
    }

} // ManagerUtils Class
