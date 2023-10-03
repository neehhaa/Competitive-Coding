//Bull or Bear

package Contest.starters.starters68;

import java.util.Scanner;

public class BullBear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int brought = input.nextInt();
            int sold = input.nextInt();

            if (sold > brought) {
                System.out.println("Profit");
            } else if (sold < brought) {
                System.out.println("Loss");
            } else {
                System.out.println("Neutral");
            }
        }
    }
}
