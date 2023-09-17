//Final Population

package Contest.starters.starters51;

import java.util.Scanner;

public class Population {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int initialPeople = input.nextInt();
            int leftedPeople = input.nextInt();
            int immigratedPeople = input.nextInt();
            int finalPeople = initialPeople - leftedPeople + immigratedPeople;
            System.out.println(finalPeople);
        }
    }
}
