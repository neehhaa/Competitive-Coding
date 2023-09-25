//Tour of King

package CodeChef.Contest.Starters.starters67;

import java.util.Scanner;

public class KingTor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while(testcase-- > 0) {
            int fiveSeatCar = input.nextInt();
            int sevenSeatCar = input.nextInt();
            int friends = (5 * fiveSeatCar + 7 * sevenSeatCar);
            System.out.println(friends);

        }
    }
}
