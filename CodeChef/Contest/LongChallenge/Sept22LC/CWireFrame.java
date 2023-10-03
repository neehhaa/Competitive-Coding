//Chef and Wire Frames

package Contest.longchallenge.SeptLC;

import java.util.Scanner;

public class CWireFrame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int length = input.nextInt();
            int width = input.nextInt();
            int price = input.nextInt();

            int totalcm = 2 * (width + length);
            int cost = totalcm * price;
            System.out.println(cost);
        }
    }
}
