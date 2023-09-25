//Max minus Min

package Contest.starters.starters62;

import java.util.Scanner;

public class MaxDiffMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            System.out.println(c - a);
        }
    }
}
