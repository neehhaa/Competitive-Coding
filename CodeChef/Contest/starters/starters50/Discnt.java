//Discount

package Contest.starters.starters50;

import java.util.Scanner;

public class Discnt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int discount = input.nextInt();
            int toyPrice = 100 - discount;
            System.out.println(toyPrice);


        }
    }
}
