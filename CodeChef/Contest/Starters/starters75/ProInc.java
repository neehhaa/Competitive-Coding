//Profit Increment

package CodeChef.Contest.Starters.starters75;

import java.util.Scanner;

public class ProInc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int sellingPrice = input.nextInt();
            int profit  = input.nextInt();
            int buyingPrice = sellingPrice - profit;
            double currentPrice = sellingPrice + (0.1 * sellingPrice);

            System.out.println((int)currentPrice - buyingPrice);
        }
    }
}
