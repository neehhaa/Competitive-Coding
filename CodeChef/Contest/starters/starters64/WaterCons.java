//Water Consumption

package Contest.starters.starters64;

import java.util.Scanner;

public class WaterCons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int waterIntake = input.nextInt();
            if (waterIntake >= 2000) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}