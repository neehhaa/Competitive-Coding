//Bucket and Water Flow
package CodeChef.Contest.LunchTime.May22LT;

import java.util.Scanner;

public class Waterflow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int water = input.nextInt();
            int capacity = input.nextInt();
            int volume = input.nextInt();
            int time = input.nextInt();

            int space = capacity - water;
            int totalLitres = volume * time;

            if (space > totalLitres) {
                System.out.println("UNFILLED");
            } else if (space == totalLitres) {
                System.out.println("FILLED");
            } else {
                System.out.println("OVERFLOW");
            }
        }
    }
}
