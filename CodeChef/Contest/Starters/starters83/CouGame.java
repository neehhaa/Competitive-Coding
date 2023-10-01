//Couple Game

package CodeChef.Contest.Starters.starters83;

import java.util.Scanner;

public class CouGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int girls = input.nextInt();
            int boys = input.nextInt();
            System.out.println(boys - girls);
        }
    }
}
