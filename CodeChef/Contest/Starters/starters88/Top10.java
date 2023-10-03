//Masterchef finals

package Contest.starters.starters88;

import java.util.Scanner;

public class Top10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int chefRank = input.nextInt();

            if (chefRank <= 10) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
