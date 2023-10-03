//Just One More Episode

package CodeChef.Contest.Starters.starters80;

import java.util.Scanner;

public class OneMore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int minutes = input.nextInt();
            if (minutes <= 24){
                System.out.println("No");
            }else {
                System.out.println("Yes");
            }
        }
    }
}
