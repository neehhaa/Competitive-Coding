//Interior Design

package Contest.lunchtime.JulyLT;

import java.util.Scanner;

public class IntrDsgn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int floor1 = input.nextInt();
            int wall1 = input.nextInt();
            int floor2 = input.nextInt();
            int wall2 = input.nextInt();

            int style1 = floor1 + wall1;
            int style2 = floor2 + wall2;
            if (style1 <= style2) {
                System.out.println(style1);
            } else {
                System.out.println(style2);
            }
        }
    }
}
