//Sum it

package CodeChef.Contest.Starters.starters72;

import java.util.Scanner;

public class Summ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int a = input.nextInt();
            int b = input.nextInt();
            int answer = input.nextInt();
            int rightAnswer = a + b;

            if (rightAnswer == answer){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
