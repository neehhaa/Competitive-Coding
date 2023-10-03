/*
Volume Control :
Chef is watching TV. The current volume of the TV is X.
Pressing the volume up button of the TV remote increases the volume by 1
while pressing the volume down button decreases the volume by 1.
Chef wants to change the volume from XX to YY. Find the minimum number of button presses required to do so.
 */
package CodeChef.Contest.Starters.starters32;

import java.util.Scanner;

public class VolControl {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        while (T-- > 0) {
            int X = scan.nextInt();
            int Y = scan.nextInt();
            if (X > Y) {
                System.out.println(X - Y);
            } else {
                System.out.println(Y - X);
            }
        }

    }
}
