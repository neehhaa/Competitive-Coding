//Sunday Brunch

package CodeChef.Contest.Starters.starters103;

import java.util.Scanner;

public class Brunch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int plates = input.nextInt();
            int platesTaken = input.nextInt();

            int fedCompletely = plates / platesTaken;
            System.out.println(Math.min(fedCompletely, 20));

        }
    }
}
