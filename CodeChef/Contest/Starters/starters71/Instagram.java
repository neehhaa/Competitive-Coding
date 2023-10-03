//Instagram

package CodeChef.Contest.Starters.starters71;

import java.util.Scanner;

public class Instagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int following = input.nextInt();
            int follower = input.nextInt();

            if (following > (10 * follower)){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
