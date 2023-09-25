//Sale Season

package Contest.longchallenge.AugustLC;

import java.util.Scanner;

public class SaleSeason {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int amount = input.nextInt();
            if (amount <= 100) {
                System.out.println(amount);
            } else if (amount <= 1000) {
                System.out.println(amount - 25);

            } else if (amount <= 5000) {
                System.out.println(amount - 100);
            } else {
                System.out.println(amount - 500);
            }
        }
    }
}
