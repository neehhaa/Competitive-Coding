//Time Complexity

package Contest.longchallenge.NovLC;

import java.util.Scanner;

public class Complexity {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int x = input.nextInt();
            int y = input.nextInt();
            if (x > y) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}