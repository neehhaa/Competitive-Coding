//Netflix

package CodeChef.Contest.CookOff.Feb22;

import java.util.Scanner;

public class Netflix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while(testcase-- > 0) {
            int alice = input.nextInt();
            int bob = input.nextInt();
            int charlie = input.nextInt();
            int subscription = input.nextInt();

            if ((subscription <= (alice + bob)) || subscription <= (alice + charlie) || subscription <= (charlie + bob)){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
