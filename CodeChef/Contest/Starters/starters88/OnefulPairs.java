package CodeChef.Contest.Starters.starters88;

import java.util.Scanner;

public class OnefulPairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int a = input.nextInt();
            int b = input.nextInt();
            int y = (a * b) + a + b;

            if (y == 111) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}