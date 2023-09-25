//Hello Equation
//unsolved

package Contest.longchallenge.AugustLC;

import java.util.Scanner;

public class HLEQN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = 1;//input.nextInt();
        while (testcase-- > 0) {
            int number = input.nextInt();
            int a = 0, b = 1, c = 0, count = 0;
            while (a++ < number / 3) {
                for (b = 1; b <= number / 3; b++) {
                    c = (2 * a) + (2 * b) + (a * b);
                    if (c == number) {
                        count++;
                    }
                }
            }
            if (count > 0) {
                System.out.println("y");
            } else {
                System.out.println("n");
            }
        }
    }
}
