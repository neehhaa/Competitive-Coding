//Ageing

package CodeChef.Contest.Starters.starters79;

import java.util.Scanner;

public class Ageing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int chefAge = input.nextInt();
            int chefinaAge = chefAge - 10;
            System.out.println(chefinaAge);

        }
    }
}
