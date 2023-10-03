//Four Tickets

package CodeChef.Contest.Starters.starters87;

import java.util.Scanner;

public class FourTickets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int cost = input.nextInt();
            if (cost * 4 > 1000){
                System.out.println("No");
            }else {
                System.out.println("Yes");
            }
        }
    }
}
