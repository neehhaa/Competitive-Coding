//Mario and the Broken String

package Contest.starters.starters64;

import java.util.Scanner;

public class BrokenString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int len = input.nextInt();
            String gift = input.next();

            int half = len / 2;
            if (gift.substring(0, half).contentEquals(gift.substring(half))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
