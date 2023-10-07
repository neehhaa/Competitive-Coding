//Water Filling

package CodeChef.Contest.Starters.starters92;

import java.util.Scanner;

public class WaterFilling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int bottle1 = input.nextInt();
            int bottle2 = input.nextInt();
            int bottle3 = input.nextInt();

            if (bottle1 == 0 && (bottle2 == 0 || bottle3 == 0)){
                System.out.println("Water filling time");
            } else if (bottle2 == 0 && bottle3 == 0) {
                System.out.println("Water filling time");
            } else {
                System.out.println("Not now");
            }


        }
    }
}
