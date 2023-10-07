//Odd Sum Pair

package CodeChef.Contest.Starters.starters61;

import java.util.Scanner;

public class OddSumPair {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            if (a % 2 != 0) {
                if (b % 2 == 0 || c % 2 == 0) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            } else if (b % 2 != 0) {
                System.out.println("yes");
            } else if (c % 2 != 0) {
                System.out.println("yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
