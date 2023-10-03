//Reach the Target

package CodeChef.Contest.Starters.starters58;

import java.util.Scanner;

public class ReachTarget {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while(testcase-- > 0) {
            int target = input.nextInt();
            int current = input.nextInt();
            int runs = target - current;
            System.out.println(runs);

        }
    }
}
