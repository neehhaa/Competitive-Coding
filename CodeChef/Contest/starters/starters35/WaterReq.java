//Water Requirement
package CodeChef.Contest.starters.starters35;

import java.util.Scanner;

public class WaterReq {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int hours = input.nextInt();
            int liters = 2 * hours;
            System.out.println(liters);
        }
    }
}
