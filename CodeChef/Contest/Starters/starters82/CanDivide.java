//Candy Division

package CodeChef.Contest.Starters.starters82;

import java.util.Scanner;

public class CanDivide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int candies = input.nextInt();

            if (candies % 3 == 0){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }

        }
    }
}
