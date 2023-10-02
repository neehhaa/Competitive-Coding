//Candy Store

package CodeChef.Contest.Starters.starters78;

import java.util.Scanner;

public class CandyStore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while(testcase-- > 0) {
            int sell = input.nextInt();
            int sold = input.nextInt();

            if (sold > sell){
                System.out.println(((sold - sell) * 2) + sell);
            }
            else {
                System.out.println(sold);
            }
        }
    }
}

