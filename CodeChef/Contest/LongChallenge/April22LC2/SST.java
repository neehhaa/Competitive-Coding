//Sasta Shark Tank

package CodeChef.Contest.LongChallenge.April22LC2;

import java.util.Scanner;

public class SST {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int investor1 =input.nextInt();
            int investor2 =input.nextInt();

            int valuationA = 10 * investor1;
            int valuationB = 5 * investor2;

            if (valuationA > valuationB){
                System.out.println("First");
            } else if (valuationB > valuationA) {
                System.out.println("Second");
            } else {
                System.out.println("Any");
            }
        }
    }
}
