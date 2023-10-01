//Overspeeding Fine

package CodeChef.Contest.LongChallenge.Jan23LC;

import java.util.Scanner;

public class Fine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int speed = input.nextInt();
            if (speed <= 70){
                System.out.println(0);
            }else if (speed <= 100){
                System.out.println(500);
            }else {
                System.out.println(2000);
            }
        }
    }
}
