//Donation Rewards

package CodeChef.Contest.Starters.starters95;

import java.util.Scanner;

public class DoReward {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int donation = input.nextInt();
            if (donation <= 3){
                System.out.println("BRONZE");
            } else if (donation <= 6) {
                System.out.println("SILVER");
            }else {
                System.out.println("GOLD");
            }
        }
    }
}
