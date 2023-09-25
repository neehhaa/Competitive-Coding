//Enough Space
package CodeChef.Contest.CookOff.July22;

import java.util.Scanner;

public class EnSpace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int space = input.nextInt();
            int smallfile = input.nextInt();
            int bigfile = input.nextInt();

            int totalsize = smallfile + (2 * bigfile);
            if (space >= totalsize) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
