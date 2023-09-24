//Fill Candies

package Contest.starters.starters48;

import java.util.Scanner;

public class FillCandies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int candies = input.nextInt();
            int pockets = input.nextInt();
            int capacity = input.nextInt();
            int bagCap = pockets * capacity;

            int bag = candies / bagCap;
            if (candies % bagCap != 0) {
                bag = bag + 1;
                System.out.println(bag);
            } else {
                System.out.println(bag);
            }
        }
    }
}
