//Avoid Squares Please

package Contest.starters.starters63;

import java.util.Scanner;

public class AvdSquarPlz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int number = input.nextInt();
            for (int i = 1; i <= number; i++) {
                System.out.println(i + " ");
            }
        }
    }
}

