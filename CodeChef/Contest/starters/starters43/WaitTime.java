//Waiting Time
package CodeChef.Contest.starters.starters43;

import java.util.Scanner;

public class WaitTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int weeks = input.nextInt();
            int daysPast = input.nextInt();

            int weekInDays = weeks * 7;
            int daysRemaining = weekInDays - daysPast;
            System.out.println(daysRemaining);
        }
    }
}
