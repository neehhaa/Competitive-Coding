//Jenga Night
package CodeChef.Contest.Starters.starters35;

import java.util.Scanner;

public class Jenga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int friends = input.nextInt();
            int jengaTiles = input.nextInt();
            if (jengaTiles >= friends) {
                if (jengaTiles % friends == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }


        }
    }
}
