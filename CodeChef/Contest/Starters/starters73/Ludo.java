//Chef Plays Ludo

package Contest.starters.starters73;

import java.util.Scanner;

public class Ludo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int dice = input.nextInt();
            if (dice == 6) {
                System.out.println("YES");
            } else {
                System.out.println("No");
            }
        }
    }
}
