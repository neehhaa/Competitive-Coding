//Best Coupon
package CodeChef.Contest.LongChallenge.April22LC2;

import java.util.Scanner;

public class CheapFood {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int bill = input.nextInt();
            int discount = (bill / 10);
            if (discount >= 100) {
                System.out.println(discount);
            } else {
                System.out.println(100);
            }
        }
    }
}
