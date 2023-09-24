//Lucky Seven

package CodeChef.Contest.ShortChallenge.Sept23;

import java.util.Scanner;

public class LuckySeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            String letter = input.next();
            System.out.println(letter.charAt(6));
        }
    }
}