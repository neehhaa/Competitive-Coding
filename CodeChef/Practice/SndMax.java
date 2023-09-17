//Second Max of Three Numbers
package CodeChef.Practice;

import java.util.Scanner;

public class SndMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int num3 = input.nextInt();

            if (num1 > num2) {
                if (num1 > num3) {
                    if (num2 > num3) {
                        System.out.println(num2);
                    } else {
                        System.out.println(num3);
                    }
                } else {
                    System.out.println(num1);
                }
            } else if (num2 > num3) {
                if (num1 > num3) {
                    System.out.println(num1);
                } else {
                    System.out.println(num3);
                }

            } else {
                System.out.println(num2);
            }
        }
    }
}
