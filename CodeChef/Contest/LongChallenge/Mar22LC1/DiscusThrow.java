//Discus Throw
package CodeChef.Contest.LongChallenge.Mar22LC1;

import java.util.Scanner;

public class DiscusThrow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();
        while (testCase-- > 0) {
            int A = input.nextInt();
            int B = input.nextInt();
            int C = input.nextInt();

            if (A >= B) {
                if (A >= C) {
                    System.out.println(A);
                } else {
                    System.out.println(C);
                }
            } else if (B > C) {
                System.out.println(B);
            } else {
                System.out.println(C);
            }

        }
    }
}
