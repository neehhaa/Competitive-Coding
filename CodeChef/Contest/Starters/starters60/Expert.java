//Expert setter

package CodeChef.Contest.Starters.starters60;

import java.util.Scanner;

public class Expert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int problems = input.nextInt();
            int approved = input.nextInt();
            double limit = (double) problems / 2;

            if (approved >= limit){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
