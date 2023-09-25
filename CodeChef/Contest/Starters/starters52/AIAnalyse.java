//AI Analysing Code

package Contest.starters.starters52;

import java.util.Scanner;

public class AIAnalyse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int code = input.nextInt();
            if (code <= 1000) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
