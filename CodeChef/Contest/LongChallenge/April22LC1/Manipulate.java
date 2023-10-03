/*
MANIPULATE :
Ezio and Guards
Ezio can manipulate at most X number of guards with the apple of eden.
Given that there are Y number of guards, predict if he can safely manipulate all of them.
For each test case, print YES if it is possible for Ezio to manipulate all the guards. Otherwise, print NO.
*/
package CodeChef.Contest.LongChallenge.April22LC1;

import java.util.Scanner;

public class Manipulate {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        while (T-- > 0) {
            int X = scan.nextInt();
            int Y = scan.nextInt();

            if (X >= Y) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

    }
}
