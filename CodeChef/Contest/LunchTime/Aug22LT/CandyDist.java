//Candy Distribution

package Contest.lunchtime.AugustLT;

import java.util.Scanner;

public class CandyDist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int candies = input.nextInt();
            int friends = input.nextInt();

            if ((candies % friends) == 0) {
                if ((candies / friends) % 2 == 0) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            } else {
                System.out.println("no");
            }
        }
    }
}
