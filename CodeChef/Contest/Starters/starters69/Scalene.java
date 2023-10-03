//Scalene Triangle

package CodeChef.Contest.Starters.starters69;

import java.util.Scanner;

public class Scalene {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while(testcase-- > 0) {
            int sideA = input.nextInt();
            int sideB = input.nextInt();
            int sideC = input.nextInt();

            if (sideA != sideB && sideB != sideC && sideA !=sideC){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
