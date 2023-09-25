/*
Who is taller! :
Alice and Bob were having an argument about which of them is taller than the other.
Charlie got irritated by the argument, and decided to settle the matter once and for all.
Charlie measured the heights of Alice and Bob,
and got to know that Alice's height is X centimeters and Bob's height is Y centimeters.
Help Charlie decide who is taller.

It is guaranteed that X != Y.
 */

package CodeChef.Contest.Starters.starters36;

import java.util.Scanner;

public class Taller {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int aliceheight = input.nextInt();
            int bobheight = input.nextInt();

            if (aliceheight > bobheight) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }

        }
    }
}
