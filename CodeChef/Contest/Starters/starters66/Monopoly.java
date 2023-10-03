//Monopoly in Chefland

package Contest.starters.starters66;

import java.util.Scanner;

public class Monopoly {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int company1 = input.nextInt();
            int company2 = input.nextInt();
            int company3 = input.nextInt();

            int mono1 = company2 + company3;
            int mono2 = company1 + company3;
            int mono3 = company2 + company1;

            if (company1 > mono1 || company2 > mono2 || company3 > mono3) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
