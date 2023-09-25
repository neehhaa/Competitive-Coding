package Contest.starters.starters73;

import java.util.Scanner;

public class LuckyN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            String Number = input.next();
            if (Number.contains("7")) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
