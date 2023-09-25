//Air Conditioner Temperature

package Contest.starters.starters52;

import java.util.Scanner;

public class ACTemp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int aliceTemp = input.nextInt();
            int bobTemp = input.nextInt();
            int charlieTemp = input.nextInt();

            if (aliceTemp <= bobTemp && charlieTemp <= bobTemp) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
