//Test Averages

package Contest.lunchtime.AugustLT;

import java.util.Scanner;

public class TestAvg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int sub1 = input.nextInt();
            int sub2 = input.nextInt();
            int sub3 = input.nextInt();

            if ((sub1 + sub2) >= 70 && (sub2 + sub3) >= 70 && (sub1 + sub3) >= 70) {
                System.out.println("pass");
            } else {
                System.out.println("fail");
            }
        }
    }
}
