//Work Smarter, Not Harder

package CodeChef.Contest.Starters.starters101;

import java.util.Scanner;

public class Smarter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int length = input.nextInt();
            int tortoiseSpeed = input.nextInt();
            int hareSpeed = input.nextInt();
            int tortoiseTime = 0;
            int hareTime = 0;

            if (length % tortoiseSpeed > 0){
                tortoiseTime = length / tortoiseSpeed +1;

            }else {
                tortoiseTime = length / tortoiseSpeed ;
            }
            if (length % hareSpeed > 0){
                hareTime = length / hareSpeed +1;

            }else {
                hareTime = length / hareSpeed;
            }

            int hareRest = tortoiseTime - hareTime;
            System.out.println(hareRest - 1);
        }
    }
}
