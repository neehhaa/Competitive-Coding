/*
Fitness :
Chef wants to become fit for which he decided to walk to the office and return home by walking.
It is known that Chef's office is XX km away from his home.
If his office is open on 55 days in a week,
find the number of kilometers Chef travels through office trips in a week.
 */
package CodeChef.Contest.LongChallenge.June22LC2;

import java.util.Scanner;

public class Fitness {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int officedist = input.nextInt();
            int walk = officedist * 2; //chef walks this dist in total
            int Days = 5;
            System.out.println(walk * Days);
        }
    }
}
