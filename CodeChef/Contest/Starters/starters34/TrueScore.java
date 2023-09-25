/*
Is the Score Consistent :
Chef is watching a football match.
The current score is A:B, that is,
team 1 has scored A goals and team 2 has scored B goals.
Chef wonders if it is possible for the score to become C:D at a later point in the game
(i.e. team 1 has scored C goals and team 2 has scored D goals).
Can you help Chef by answering his question?
For each testcase, output POSSIBLE if it is possible for the score to become C:D
at a later point in the game, IMPOSSIBLE otherwise.
 */

package CodeChef.Contest.Starters.starters34;

import java.util.Scanner;

public class TrueScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int team1Initial = input.nextInt();
            int team2Initial = input.nextInt();
            int team1Final = input.nextInt();
            int team2Final = input.nextInt();
            if (team1Initial <= team1Final && team2Initial <= team2Final) {
                System.out.println("POSSIBLE");
            } else {
                System.out.println("IMPOSSIBLE");
            }
        }
    }
}
