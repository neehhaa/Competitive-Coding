//Chef and Donation

package CodeChef.Contest.Starters.starters84;

import java.util.Scanner;

public class Dnation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int chef = input.nextInt();
            int chefina = input.nextInt();
            int donate = chefina - chef;
            System.out.println(donate);

        }
    }
}
