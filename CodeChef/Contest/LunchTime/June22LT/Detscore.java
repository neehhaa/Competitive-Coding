/*
Determine the Score :
Chef appeared for a placement test.
There is a problem worth X points.
Chef finds out that the problem has exactly 10 test cases.
It is known that each test case is worth the same number of points.
Chef passes N test cases among them. Determine the score Chef will get.
 */
package CodeChef.Contest.LunchTime.June22LT;

import java.util.Scanner;

public class Detscore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int totalpoints = input.nextInt();
            int passedtestcase = input.nextInt();

            int singletc = totalpoints / 10;
            int score = passedtestcase * singletc;
            System.out.println(score);


        }
    }
}