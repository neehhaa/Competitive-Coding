//Monthly Budget
package CodeChef.Contest.starters.starters33;

import java.util.Scanner;

public class Budget {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int money = input.nextInt();
            int dailyExp = input.nextInt();
            if ((dailyExp * 30) <= money) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

