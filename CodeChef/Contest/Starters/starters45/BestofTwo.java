/*
Best of Two :
Chef took an examination two times.
In the first attempt, he scored X marks while in the second attempt he scored Y marks.
According to the rules of the examination,
the best score out of the two attempts will be considered as the final score.
Determine the final score of the Chef.
For each test case, output the final score of Chef in the examination.
*/

package CodeChef.Contest.Starters.starters45;

import java.util.Scanner;

public class BestofTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int firstAttempt = input.nextInt();
            int secondAttempt = input.nextInt();
            if (firstAttempt >= secondAttempt) {
                System.out.println(firstAttempt);
            } else {
                System.out.println(secondAttempt);
            }
        }
    }
}
