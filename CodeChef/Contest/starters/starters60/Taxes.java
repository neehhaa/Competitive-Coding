//Tax in Chefland

package Contest.starters.starters60;

import java.util.Scanner;

public class Taxes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int income = input.nextInt();
            if (income > 100) {
                System.out.println(income - 10);
            } else {
                System.out.println(income);
            }
        }
    }
}
