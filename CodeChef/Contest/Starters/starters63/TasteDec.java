//Tasty Decisions

package Contest.starters.starters63;

import java.util.Scanner;

public class TasteDec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int chocolates = input.nextInt();
            int candies = input.nextInt();

            int chocolatesTastiness = chocolates * 2;
            int candiesTastiness = candies * 5;

            if (chocolatesTastiness > candiesTastiness) {
                System.out.println("Chocolate");
            } else if (candiesTastiness > chocolatesTastiness) {
                System.out.println("Candy");
            } else {
                System.out.println("Either");
            }
        }
    }
}