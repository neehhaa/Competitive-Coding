//Equalizing Numbers
//unsolved

package Contest.lunchtime.AugustLT;

import java.util.Scanner;

public class EqualizingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int a = input.nextInt();
            int b = input.nextInt();

            if (a > b) {
                int c = a - b;
                for (int i = 1; i <= c; i++) {
                    if ((a + i == b + i) || (b + i == a - i)) {
                        System.out.println("yes");
                    } else {
                        System.out.println("no");
                    }
                }
            } else if (b > a) {
                int c = b - a;
                for (int i = 1; i <= c; i++) {
                    if ((a + i == b + i) || (b + i == a - i)) {
                        System.out.println("yes");
                    } else {
                        System.out.println("no");
                    }
                }
            } else {
                System.out.println("yes");
            }
        }
    }
}
