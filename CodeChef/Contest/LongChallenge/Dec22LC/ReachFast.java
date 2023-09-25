//Reach fast

package Contest.longchallenge.DecLC;

import java.util.Scanner;

public class ReachFast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int chef = input.nextInt();
            int chefina = input.nextInt();
            int canSteps = input.nextInt();
            if (chef >= chefina) {
                int stepsRequired = chef - chefina;
                int stepsTaken = stepsRequired / canSteps;
                if (stepsRequired % canSteps > 0) {
                    stepsTaken = stepsTaken + 1;
                }
                System.out.println(stepsTaken);
            } else {
                int stepsRequired = chefina - chef;
                int stepsTaken = stepsRequired / canSteps;
                if (stepsRequired % canSteps > 0) {
                    stepsTaken = stepsTaken + 1;
                }
                System.out.println(stepsTaken);
            }
        }
    }
}
