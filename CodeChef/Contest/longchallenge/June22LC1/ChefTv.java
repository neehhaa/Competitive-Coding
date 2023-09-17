//Subscriptions
package CodeChef.Contest.longchallenge.June22LC1;

import java.util.Scanner;

public class ChefTv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int friends = input.nextInt();
            int cost = input.nextInt();
            int totalsubs = friends / 6;
            int totalCost = totalsubs * cost;
            if (friends % 6 != 0) {
                totalCost = totalCost + cost;
                System.out.println(totalCost);
            } else {
                System.out.println(totalCost);
            }
        }
    }
}
