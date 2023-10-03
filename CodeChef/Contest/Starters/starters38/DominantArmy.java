//Dominant Army
package CodeChef.Contest.Starters.starters38;

import java.util.Scanner;

public class DominantArmy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int armyA = input.nextInt();
            int armyB = input.nextInt();
            int armyC = input.nextInt();
            if (armyA > (armyB + armyC) || armyB > (armyA + armyC) || armyC > (armyB + armyA)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
