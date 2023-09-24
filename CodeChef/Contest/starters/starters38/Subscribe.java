//Get Subscription
package CodeChef.Contest.starters.starters38;

import java.util.Scanner;

public class Subscribe {
    public static void main(String[] args) {
        {
            Scanner input = new Scanner(System.in);

            int testcase = input.nextInt();

            while (testcase-- > 0) {
                int minutes = input.nextInt();
                if (minutes > 30) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}