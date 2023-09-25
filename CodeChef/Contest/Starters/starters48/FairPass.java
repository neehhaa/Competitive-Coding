//Passes for Fair

package Contest.starters.starters48;

import java.util.Scanner;

public class FairPass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int friends = input.nextInt();
            int passes = input.nextInt();
            int totalPeople = friends + 1;
            if (passes >= totalPeople) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
