//Car Trip

package Contest.starters.starters53;

import java.util.Scanner;

public class CarTrip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int a = input.nextInt();
            if (a <= 300) {
                System.out.println(300 * 10);
            } else {
                System.out.println(a * 10);
            }
        }
    }
}

