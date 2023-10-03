//All New CodeChef

package Contest.longchallenge.AugLC23;

import java.util.Scanner;

public class NewCC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int oldTime = input.nextInt();
            int newTime = input.nextInt();

            if (oldTime > newTime) {
                System.out.println("NEW");
            } else if (newTime > oldTime) {
                System.out.println("OLD");
            } else {
                System.out.println("SAME");
            }
        }
    }
}
