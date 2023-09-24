//Email Reminders
package CodeChef.Contest.CookOff.April22CO;

import java.util.Scanner;

public class EmailRem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int participants = input.nextInt();
        int noReminder = input.nextInt();
        int reminder = participants - noReminder;
        System.out.println(reminder);
    }
}
