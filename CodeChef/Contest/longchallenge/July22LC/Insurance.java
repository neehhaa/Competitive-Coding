//Insurance

package CodeChef.Contest.longchallenge.July22LC;

import java.util.Scanner;

public class Insurance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int insurance = input.nextInt();
            int damage = input.nextInt();
            if (damage >= insurance) {
                System.out.println(insurance);
            } else {
                System.out.println(damage);
            }
        }
    }
}
