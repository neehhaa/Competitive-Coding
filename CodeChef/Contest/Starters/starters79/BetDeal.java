//Better Deal

package CodeChef.Contest.Starters.starters79;

import java.util.Scanner;

public class BetDeal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int discountA = input.nextInt();
            int discountB = input.nextInt();
            int priceA = 100 - discountA;
            int priceB = 200 - (2 * discountB);

            if (priceA < priceB){
                System.out.println("First");
            } else if (priceB < priceA) {
                System.out.println("Second");
            } else {
                System.out.println("Both");
            }
        }
    }
}
