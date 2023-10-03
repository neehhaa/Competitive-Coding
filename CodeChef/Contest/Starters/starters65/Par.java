//Parity

package Contest.starters.starters65;

import java.util.Scanner;

public class Par {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int chocolates = input.nextInt();
            if (chocolates % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}