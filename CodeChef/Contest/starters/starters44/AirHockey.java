//Air Hockey
package CodeChef.Contest.starters.starters44;

import java.util.Scanner;

public class AirHockey {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int alice = input.nextInt();
            int bob = input.nextInt();
            int scorerem = 0;
            if (alice >= bob) {
                scorerem = 7 - alice;
                System.out.println(scorerem);
            } else {
                scorerem = 7 - bob;
                System.out.println(scorerem);
            }
        }
    }
}
