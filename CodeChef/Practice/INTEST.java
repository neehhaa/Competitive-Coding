/*

Enormous Input Test :
The purpose of this problem is to verify whether the method you are using to read input data is
sufficiently fast to handle problems branded with the enormous Input/Output warning.
You are expected to be able to process at least 2.5MB of input data per second at runtime.
Input :
The input begins with two positive integers n k (n, k<=107).
The next n lines of input contain one positive integer ti, not greater than 109, each.
Output :
Write a single integer to output, denoting how many integer ti are divisible by k.
*/

package CodeChef.Practice;

import java.util.Scanner;

public class INTEST {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int count = 0;
        while (n-- > 0) {
            int ti = input.nextInt();

            if (ti % k == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
