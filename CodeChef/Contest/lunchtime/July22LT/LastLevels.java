//The Last Levels

package Contest.lunchtime.JulyLT;

import java.util.Scanner;

public class LastLevels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int levelRemain = input.nextInt();
            int levelTime = input.nextInt();
            int breakTime = input.nextInt();
            int totalTime = levelRemain * levelTime;
            if (levelRemain > 3) {
                int breaks = levelRemain / 3;
                int totalBreaktime = breaks * breakTime;
                int total = totalTime + totalBreaktime;
                if (levelRemain % 3 == 0) {
                    total = total - breakTime;
                    System.out.println(total);
                } else {
                    System.out.println(total);
                }
            } else {
                System.out.println(totalTime);
            }
        }
    }
}