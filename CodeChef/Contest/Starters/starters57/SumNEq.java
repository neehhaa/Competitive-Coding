//Integers that sum to the same value

package Contest.starters.starters57;

import java.util.Scanner;

public class SumNEq {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int a = input.nextInt();
            int count = 0;
            for (int i = 1; i < a; i++) {
                if (i != a) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
