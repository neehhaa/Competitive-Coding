/*
Burgers :
Chef is fond of burgers and decided to make as many burgers as possible.
Chef has A patties and B buns.
To make 1 burger, Chef needs 1 patty and 1 bun.
Find the maximum number of burgers that Chef can make.
*/
package CodeChef.Contest.starters.starters43;

import java.util.Scanner;

public class Burger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int patty = input.nextInt();
            int bun = input.nextInt();

            if (patty > bun) {
                System.out.println(bun);
            } else if (bun > patty) {
                System.out.println(patty);
            } else {
                System.out.println(bun);
            }
        }
    }
}
