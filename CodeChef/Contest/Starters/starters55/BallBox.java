//Balls and Boxes
//unsolved

package Contest.starters.starters55;

import java.util.Scanner;

public class BallBox {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = 1;//input.nextInt();
        while (testcase-- > 0) {
            int balls = input.nextInt();
            int boxes = input.nextInt();
            if (balls > boxes) {
                System.out.println("yes");


            } else if (balls == boxes) {
                if (balls == 1 && boxes == 1) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }

            } else {
                System.out.println("no");
            }
        }
    }
}
