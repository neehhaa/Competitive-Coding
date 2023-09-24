//X Jumps

package Contest.starters.starters62;

import java.util.Scanner;

public class XJump {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            double x = input.nextInt();
            double y = input.nextInt();

            int steps = (int) (x / y);

            if (x % y > 0) {
                steps = (int) (steps + (x % y));
            }
            System.out.println(steps);
        }
    }
}
