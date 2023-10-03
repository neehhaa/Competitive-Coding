//Chef gives Party
package CodeChef.Contest.Starters.starters38;

import java.util.Scanner;

public class Party2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int friends = input.nextInt();
            int burgerCost = input.nextInt();
            int chefmoney = input.nextInt();
            int totalcost = burgerCost * friends;

            if (chefmoney >= totalcost) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
