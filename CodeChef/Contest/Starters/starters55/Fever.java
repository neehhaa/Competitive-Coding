//Fever

package Contest.starters.starters55;

import java.util.Scanner;

public class Fever {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int temp = input.nextInt();
            if (temp > 98) {
                System.out.println("Yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
