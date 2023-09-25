package CodeChef.Contest.Starters.starters49;

import java.util.Scanner;

public class MaxTaste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int tasteA = input.nextInt();
            int tasteB = input.nextInt();
            int tasteC = input.nextInt();
            int tasteD = input.nextInt();
            int firstIng = 0;
            int secondIng = 0;

            if (tasteA > tasteB) {
                firstIng = tasteA;
            } else {
                firstIng = tasteB;
            }
            if (tasteC > tasteD) {
                secondIng = tasteC;
            } else {
                secondIng = tasteD;
            }

            int tastiness = firstIng + secondIng;
            System.out.println(tastiness);

        }
    }
}
