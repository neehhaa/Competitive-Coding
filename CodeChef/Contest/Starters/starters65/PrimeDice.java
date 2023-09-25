//Hackerman

package Contest.starters.starters65;

import java.util.Scanner;

public class PrimeDice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int a = input.nextInt();
            int b = input.nextInt();
            int num = a + b;
            boolean flag = false;
            for (int i = 2; i <= num / 2; ++i) {
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}