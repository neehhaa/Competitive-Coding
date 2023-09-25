//Reach on Time

package CodeChef.Contest.Starters.starters61;

import java.util.Scanner;

public class Timely {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int time = input.nextInt();
            if (time > 30){
                System.out.println("No");
            }else {
                System.out.println("Yes");
            }
        }
    }
}
