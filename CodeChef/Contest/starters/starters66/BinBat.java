//Binary Battles

package Contest.starters.starters66;

import java.util.Scanner;

public class BinBat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int teams = input.nextInt();
            int durationTime = input.nextInt();
            int breakTime = input.nextInt();
            int count = 0;
            while (teams / 2 > 0) {
                teams = teams / 2;
                count++;
            }
            int contestDuration = durationTime * count;
            int breakDuration = breakTime * (count - 1);
            int totalTime = contestDuration + breakDuration;
            System.out.println(totalTime);
        }
    }
}