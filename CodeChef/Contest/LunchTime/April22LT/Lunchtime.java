//Lunchtime
package CodeChef.Contest.LunchTime.April22LT;

import java.util.Scanner;

public class Lunchtime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int time = input.nextInt();
            if (time >= 1 && time <= 4) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
