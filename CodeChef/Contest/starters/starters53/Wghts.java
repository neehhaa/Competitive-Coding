//Weights

package Contest.starters.starters53;

import java.util.Scanner;

public class Wghts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int weight = input.nextInt();
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            if (weight == (a + b) || weight == (a + c) || weight == (c + b)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
