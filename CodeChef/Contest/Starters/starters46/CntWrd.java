//Counting Words
package CodeChef.Contest.Starters.starters46;

import java.util.Scanner;

public class CntWrd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int pages = input.nextInt();
            int pagewords = input.nextInt();

            int bookwords = pages * pagewords;
            System.out.println(bookwords);
        }
    }
}
