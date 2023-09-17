//Cred Coins
package CodeChef.Contest.lunchtime.Mar22LT;

import java.util.Scanner;

public class CredCoins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int coins = input.nextInt();
            int bills = input.nextInt();
            int totalcoins = coins * bills;
            int bag = 0;
            if (totalcoins >= 100) {
                bag = totalcoins / 100;
                System.out.println(bag);
            } else {
                System.out.println(bag);
            }
        }
    }
}
