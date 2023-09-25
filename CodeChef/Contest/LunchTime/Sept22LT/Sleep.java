//Sleep deprivation

package Contest.lunchtime.SeptLT;

import java.util.Scanner;

public class Sleep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {

            double sleepHours = input.nextDouble();

            if (sleepHours < 7) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
