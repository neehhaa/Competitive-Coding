//Height of Rationals

package Contest.lunchtime.AugustLT;

import java.util.Scanner;

public class HeightRation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        if (a >= b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}

