//Audible Range

package Contest.starters.starters59;

import java.util.Scanner;

public class Audible {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int freq = input.nextInt();

            if (freq >= 67 && freq <= 45000) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
