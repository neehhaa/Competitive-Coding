//Chef and Bird farm
package CodeChef.Contest.starters.starters36;

import java.util.Scanner;

public class Birdfarm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int chicken = input.nextInt();
            int duck = input.nextInt();
            int legs = input.nextInt();

            if (legs % chicken == 0 && legs % duck == 0) {
                System.out.println("ANY");
            } else if (legs % chicken == 0) {
                System.out.println("CHICKEN");
            } else if (legs % duck == 0) {
                System.out.println("DUCK");
            } else {
                System.out.println("NONE");
            }
        }
    }
}
