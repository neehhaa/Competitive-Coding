//Good Investment or Not

package Contest.longchallenge.DecLC;

import java.util.Scanner;

public class Investment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int interest = input.nextInt();
            int inflation = input.nextInt();

            if (interest >= 2 * inflation) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
