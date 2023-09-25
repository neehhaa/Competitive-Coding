//Test Score

package Contest.starters.starters62;

import java.util.Scanner;

public class ChefScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int a = input.nextInt();
            int x = input.nextInt();
            int y = input.nextInt();
            if (y % x == 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
