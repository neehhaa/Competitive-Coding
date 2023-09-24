//Equal Distribution
package CodeChef.Contest.starters.starters42;

import java.util.Scanner;

public class EqualDist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int alice = input.nextInt();
            int bob = input.nextInt();

            int totalChocolate = alice + bob;

            if (totalChocolate % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
