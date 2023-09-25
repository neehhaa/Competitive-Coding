//Good Turn

package Contest.starters.starters78;

import java.util.Scanner;

public class GDTurn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int chefDice = input.nextInt();
            int chefinaDice = input.nextInt();

            if (chefDice + chefinaDice > 6) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}
