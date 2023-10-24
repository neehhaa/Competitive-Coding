//Double Rent

package CodeChef.Contest.Starters.starters104;

import java.util.Scanner;

public class DoubleRent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int rent = input.nextInt();
            int finalRent = rent * 2;
            System.out.println(finalRent);

        }
    }
}
