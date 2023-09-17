package CodeChef.Contest.starters.starters28;

import java.util.Scanner;

public class Qualify {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int marksneeded = input.nextInt();
            int a = input.nextInt();
            int b = input.nextInt();

            int marksgot = a + (b * 2);

            if (marksgot >= marksneeded) {
                System.out.println("Qualify");
            } else {
                System.out.println("Not Qualify");
            }
        }
    }
}
