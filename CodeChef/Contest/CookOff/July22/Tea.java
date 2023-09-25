//Chef Drinks Tea
package CodeChef.Contest.CookOff.July22;

import java.util.Scanner;

public class Tea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int dailyIntake = input.nextInt();
            int jarCapacity = input.nextInt();
            int teaPrice = input.nextInt();

            int totalJar = dailyIntake / jarCapacity;

            int totalJarPrice = totalJar * teaPrice;
            int totalExtraJarPrice = totalJarPrice + teaPrice;

            if (dailyIntake > jarCapacity) {

                if (dailyIntake % jarCapacity != 0) {
                    System.out.println(totalExtraJarPrice);
                } else {
                    System.out.println(totalJarPrice);

                }
            } else {
                System.out.println(teaPrice);
            }
        }
    }
}