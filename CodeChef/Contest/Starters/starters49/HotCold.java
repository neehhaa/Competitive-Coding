//Is it hot or cold
package CodeChef.Contest.Starters.starters49;

import java.util.Scanner;

public class HotCold {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int temperature = input.nextInt();
            if (temperature > 20) {
                System.out.println("HOT");
            } else {
                System.out.println("COLD");
            }


        }
    }
}