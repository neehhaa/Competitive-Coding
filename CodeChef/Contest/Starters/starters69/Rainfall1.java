//Rain in Chefland

package CodeChef.Contest.Starters.starters69;

import java.util.Scanner;

public class Rainfall1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int rainfall = input.nextInt();
            if (rainfall < 3){
                System.out.println("Light");
            } else if (rainfall < 7) {
                System.out.println("Moderate");
            } else {
                System.out.println("Heavy");
            }
        }
    }
}
