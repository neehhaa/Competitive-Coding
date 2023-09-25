/*
Miami GP :
Chef has finally got the chance of his lifetime to drive in the F1F1 tournament.
But, there is one problem. Chef did not know about the 107% rule, and
now he is worried whether he will be allowed to race in the main event or not.
Given the fastest finish time as X seconds and Chef's finish time as Y seconds,
determine whether Chef will be allowed to race in the main event or not.
Note that, Chef will only be allowed to race if his finish time is within 107% of the fastest finish time.
For each test case, output YES if Chef will be allowed to race in the main event, else output NO.
*/

package CodeChef.Contest.LongChallenge.May22LC1;

import java.util.Scanner;

public class F1Rule {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int fastest = input.nextInt();
            int chef = input.nextInt();
            double cond = fastest * 1.07;
            if (chef <= cond) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}