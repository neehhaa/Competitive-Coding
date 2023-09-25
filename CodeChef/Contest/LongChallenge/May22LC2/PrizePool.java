//Total Prize Money
package CodeChef.Contest.LongChallenge.May22LC2;

import java.util.Scanner;

public class PrizePool {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int top10 = input.nextInt();
            int top100 = input.nextInt();

            int prizetop10 = top10 * 10;
            int prizetop100 = top100 * 90;

            int totalPrize = prizetop10 + prizetop100;

            System.out.println(totalPrize);

        }
    }
}