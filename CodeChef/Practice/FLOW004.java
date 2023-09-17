//First and Last Digit
package CodeChef.Practice;

import java.util.Scanner;

public class FLOW004 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int number = input.nextInt();
            int last = number % 10;
            int first = 0;

            while (number > 0) {
                first = number % 10;
                number = number / 10;
            }
            System.out.println(first + last);
        }
    }
}