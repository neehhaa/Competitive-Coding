//Mana Points

package CodeChef.Contest.Starters.starters74;

import java.util.Scanner;

public class ManaPts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int attacks = input.nextInt();
            int points = input.nextInt();

            System.out.println(points/attacks);

        }
    }
}
