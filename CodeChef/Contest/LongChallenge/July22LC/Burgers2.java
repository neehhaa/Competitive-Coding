//Hungry Chef
//unsolved

package CodeChef.Contest.LongChallenge.July22LC;

import java.util.Scanner;

public class Burgers2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int smallBurger = input.nextInt();
            int bigBurger = input.nextInt();
            int burgerQuantity = input.nextInt();
            int funds = input.nextInt();

            int bigprice = bigBurger * burgerQuantity;

            if (bigprice <= funds) {
                System.out.println(burgerQuantity);

            }
        }
    }
}
