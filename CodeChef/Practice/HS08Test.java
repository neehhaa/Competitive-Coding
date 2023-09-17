/*
ATM -
Pooja would like to withdraw X $US from an ATM.
The cash machine will only accept the transaction if X is a multiple of 5,
and Pooja's account balance has enough cash to perform the withdrawal transaction (including bank charges).
For each successful withdrawal the bank charges 0.50 $US.

Calculate Pooja's account balance after an attempted transaction.
 */

package CodeChef.Practice;

import java.util.Scanner;

public class HS08Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float n = scan.nextFloat();
        float f = scan.nextFloat();

        if (n % 5 == 0 && f >= n + 0.5f)
            System.out.println(f - n - 0.5f);

        else {
            System.out.println(f);
        }
    }
}