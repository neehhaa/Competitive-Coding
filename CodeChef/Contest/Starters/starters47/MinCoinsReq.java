/*
Minimum Coins :
There are only 2 type of denominations in Chefland:

Coins worth 1 rupee each
Notes worth 10 rupees each
Chef wants to pay his friend exactly X rupees.
What is the minimum number of coins Chef needs to pay exactly X rupees?

 */
package CodeChef.Contest.Starters.starters47;

import java.util.Scanner;

public class MinCoinsReq {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int chefmoney = input.nextInt();
            int coins = (chefmoney % 10);
            System.out.println(coins);
        }
    }
}