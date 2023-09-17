//Flip the cards

package Contest.lunchtime.SeptLT;

import java.util.Scanner;

public class FlipCards {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {

            int cards = input.nextInt();
            int faceUp = input.nextInt();

            int faceDown = cards - faceUp;

            if (faceUp <= faceDown) {
                System.out.println(faceUp);
            } else {
                System.out.println(faceDown);
            }
        }
    }
}
