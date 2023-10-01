//Kitchen Timings

package CodeChef.Contest.Starters.starters70;

import java.util.Scanner;

public class KitchenTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int startHour = input.nextInt();
            int endHour = input.nextInt();

            int totalHours = endHour - startHour;
            System.out.println(totalHours);
        }
    }
}
