/*
The Cheaper Cab:
Chef has to travel to another place. For this, he can avail any one of two cab services.
The first cab service charges XX rupees.
The second cab service charges YY rupees.
Chef wants to spend the minimum amount of money. Which cab service should Chef take?
For each test case, output FIRST if the first cab service is cheaper,
output SECOND if the second cab service is cheaper,
output ANY if both cab services have the same price.
*/

package CodeChef.Contest.starters.starters33;

import java.util.Scanner;

public class CheaperCab {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        while (T-- > 0) {
            int X = scan.nextInt();
            int Y = scan.nextInt();

            if (X > Y) {
                System.out.println("SECOND");
            } else if (Y > X) {
                System.out.println("FIRST");
            } else {
                System.out.println("ANY");
            }
        }
    }
}
