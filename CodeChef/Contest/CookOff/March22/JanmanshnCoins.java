//Janmansh and Coins
package CodeChef.Contest.CookOff.March22;

import java.util.Scanner;

public class JanmanshnCoins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int ten = input.nextInt();
            int five = input.nextInt();
            int total = (ten * 10) + (five * 5);
            System.out.println(total);
        }
    }
}
