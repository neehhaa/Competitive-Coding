//Roller Coaster
package CodeChef.Contest.Starters.starters37;

import java.util.Scanner;

public class MinHeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int sonHeight = input.nextInt();
            int reqHeight = input.nextInt();

            if (sonHeight >= reqHeight) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
