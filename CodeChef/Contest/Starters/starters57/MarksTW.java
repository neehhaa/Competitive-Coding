//Alice and Marks

package Contest.starters.starters57;

import java.util.Scanner;

public class MarksTW {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int a = input.nextInt();
            int b = input.nextInt();
            int marks = 2 * b;
            if (a >= marks) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
