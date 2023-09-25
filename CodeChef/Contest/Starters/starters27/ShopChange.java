//Shopping Change
package CodeChef.Contest.Starters.starters27;

import java.util.Scanner;

public class ShopChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int cost = input.nextInt();
            System.out.println(100 - cost);
        }
    }
}
