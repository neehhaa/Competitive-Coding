package Contest.starters.starters73;

import java.util.Scanner;

public class Tablets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int daysRequired = input.nextInt();
            int tabletsRequired = daysRequired * 3;
            int tabletsAvailable = input.nextInt();
            if (tabletsAvailable >= tabletsRequired) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
