
package CodeChef.Contest.Starters.starters108;

import java.util.Scanner;

public class ChessPair {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int n = input.nextInt();
            int ratedPeople = input.nextInt();

            int totalPlayes = 2 * n;
            int unratedPlayes = totalPlayes - ratedPeople;
            if (ratedPeople > unratedPlayes){
                int players = (ratedPeople - unratedPlayes);
                System.out.println(players);
            }else {
                System.out.println(0);
            }


        }
    }
}

