//Distinct Colors

package Contest.starters.starters64;

import java.util.Arrays;
import java.util.Scanner;

public class DistinctCol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int colors = input.nextInt();
            int[] balls = new int[colors];
            for (int i = 0; i < colors; i++) {
                balls[i] = input.nextInt();
            }
            int max = Arrays.stream(balls).max().getAsInt();
            System.out.println(max);
        }
    }
}