//Valentine is Coming
package CodeChef.Contest.Starters.starters26;

import java.util.Scanner;

public class ValentineisComing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int chefFund = input.nextInt();
            int chocoPrice = input.nextInt();
            int total = chefFund / chocoPrice;
            System.out.println(total);
        }
    }
}
