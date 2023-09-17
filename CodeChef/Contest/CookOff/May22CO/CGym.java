//Chef and Gym
package CodeChef.Contest.CookOff.May22CO;

import java.util.Scanner;

public class CGym {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int gymPrice = input.nextInt();
            int trainer = input.nextInt();
            int budget = input.nextInt();

            if ((gymPrice + trainer) <= budget) {
                System.out.println("2");
            } else if (gymPrice <= budget) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}
