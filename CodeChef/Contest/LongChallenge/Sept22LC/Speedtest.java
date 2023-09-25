//Speed Limit Test

package Contest.longchallenge.SeptLC;

import java.util.Scanner;

public class Speedtest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int aliceDist = input.nextInt();
            int aliceTime = input.nextInt();
            int bobDist = input.nextInt();
            int bobTime = input.nextInt();

            double aliceSpeed = aliceDist / aliceTime;
            double bobSpeed = bobDist / bobTime;

            if (aliceSpeed > bobSpeed) {
                System.out.println("ALICE");
            } else if (aliceSpeed < bobSpeed) {
                System.out.println("BOB");
            } else {
                System.out.println("EQUAL");
            }
        }
    }
}
