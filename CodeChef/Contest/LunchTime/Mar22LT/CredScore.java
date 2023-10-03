/*
Credit score :
To access CRED programs, one needs to have a credit score of 750 or more.
Given that the present credit score is X, determine if one can access CRED programs or not.

If it is possible to access CRED programs, output YES, otherwise output NO.
 */

package CodeChef.Contest.LunchTime.Mar22LT;

import java.util.Scanner;

public class CredScore {
    public static void main(String[] args) {

        // your code goes here
        Scanner scan = new Scanner(System.in);

        int X = scan.nextInt();
        if (X >= 750) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}