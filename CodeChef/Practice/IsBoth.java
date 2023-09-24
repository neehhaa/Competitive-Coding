//Is Both Or Not

package CodeChef.Practice;

import java.util.Scanner;

public class IsBoth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int number = input.nextInt();

            if ((number % 5 == 0) && (number % 11 == 0)) {
                System.out.println("BOTH");
            } else if ((number % 5 == 0) || (number % 11 == 0)) {
                System.out.println("ONE");
            } else {
                System.out.println("NONE");
            }
        }
    }
}
