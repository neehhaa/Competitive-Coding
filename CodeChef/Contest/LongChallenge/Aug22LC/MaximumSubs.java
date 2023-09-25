//Maximum Submissions

package Contest.longchallenge.AugustLC;

import java.util.Scanner;

public class MaximumSubs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int minutes = input.nextInt();
            int questions = minutes * 2;
            System.out.println(questions);
        }
    }
}
