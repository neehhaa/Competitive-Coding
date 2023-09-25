//Greater Average

package Contest.starters.starters53;

import java.util.Scanner;

public class AvgProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            double d = (double) (a + b) / 2;
            if (d > c) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}

