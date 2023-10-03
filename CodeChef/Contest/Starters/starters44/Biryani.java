/*
Biryani classes :
According to a recent survey,
Biryani is the most ordered food.
Chef wants to learn how to make world-class Biryani from a MasterChef.
Chef will be required to attend the MasterChef's classes for X weeks,
and the cost of classes per week is Y coins.
What is the total amount of money that Chef will have to pay?
 */
package CodeChef.Contest.Starters.starters44;

import java.util.Scanner;

public class Biryani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int weeks = input.nextInt();
            int money = input.nextInt();

            System.out.println(weeks * money);

        }
    }
}
