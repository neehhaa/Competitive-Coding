//Nearest Court
package CodeChef.Contest.starters.starters50;

import java.util.Scanner;

public class NearestCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int X = input.nextInt();
            int Y = input.nextInt();

            if (X > Y) {
                int Z = X - Y;
                if (Z % 2 == 0) {
                    System.out.println(Z / 2);
                } else {
                    System.out.println((Z / 2) + 1);
                }
            } else {
                int Z = Y - X;
                if (Z % 2 == 0) {
                    System.out.println(Z / 2);
                } else {
                    System.out.println((Z / 2) + 1);
                }
            }
        }
    }
}

