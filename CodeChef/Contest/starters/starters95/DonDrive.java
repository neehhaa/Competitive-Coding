//Donation Drive

package CodeChef.Contest.starters.starters95;

import java.util.Scanner;

public class DonDrive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int target = input.nextInt();
            int collected = input.nextInt();

            if (collected < target) {
                System.out.println(target - collected);
            } else {
                System.out.println(0);
            }

        }
    }
}
