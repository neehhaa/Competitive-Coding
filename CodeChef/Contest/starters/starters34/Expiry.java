//Expiring Bread
package CodeChef.Contest.starters.starters34;

import java.util.Scanner;

public class Expiry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int loaves = input.nextInt();
            int expire = input.nextInt();
            int canEat = input.nextInt();

            int eat = expire * canEat;
            if (eat >= loaves) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
