//Squats

package Contest.starters.starters66;

import java.util.Scanner;

public class Squats {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int set = input.nextInt();
            int squat = set * 15;
            System.out.println(squat);
        }
    }
}
