//The Cooler Dilemma 1
package CodeChef.Contest.longchallenge.April22LC1;

import java.util.Scanner;

public class WaterCooler1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int rentrate = input.nextInt();
            int purchase = input.nextInt();
            int months = input.nextInt();
            int rent = rentrate * months;
            if (rent < purchase) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
