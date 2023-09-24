//Rating Improvement
package CodeChef.Contest.CookOff.June22CO;

import java.util.Scanner;

public class Advance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int currRating = input.nextInt();
            int difficulty = input.nextInt();

            int range = currRating + 200;

            if (currRating <= difficulty && difficulty <= range) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
