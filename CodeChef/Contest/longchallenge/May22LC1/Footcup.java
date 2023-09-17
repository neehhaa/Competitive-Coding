//Football Cup
package CodeChef.Contest.longchallenge.May22LC1;

import java.util.Scanner;

public class Footcup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int team1 = input.nextInt();
            int team2 = input.nextInt();
            if (team1 >= 1 && team2 >= 1) {
                if (team1 == team2) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}
