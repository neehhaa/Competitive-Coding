//Chef and Chocolates
package CodeChef.Contest.Starters.starters41;

import java.util.Scanner;

public class CChocolates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int rup5 = input.nextInt();
            int rup10 = input.nextInt();
            int cost = input.nextInt();

            int availrup5 = rup5 * 5;
            int availrup10 = rup10 * 10;
            int totalmoney = availrup5 + availrup10;
            int bought = totalmoney / cost;
            System.out.println(bought);

        }
    }
}
