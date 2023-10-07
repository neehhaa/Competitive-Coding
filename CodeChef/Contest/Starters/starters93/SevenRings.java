// 7 Rings

package CodeChef.Contest.Starters.starters93;

import java.util.Scanner;

public class SevenRings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int items = input.nextInt();
            int cost = input.nextInt();
            String totalCost = String.valueOf(items * cost);

            if (totalCost.length() == 5) {
                if (totalCost.charAt(0) != 0) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }

            } else {
                System.out.println("No");
            }


        }
    }
}
