//Bath in Winters
package CodeChef.Contest.longchallenge.Mar22LC1;

import java.util.Scanner;

public class BathInWinters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int geyser = input.nextInt();
            int bucket = input.nextInt();
            int litrePerperson = bucket * 2;

            int capacity = geyser / litrePerperson;
            System.out.println(capacity);

        }
    }
}
