//Apples and Oranges
package CodeChef.Contest.LunchTime.May22LT;

import java.util.Scanner;

public class ApplOrng {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int money = input.nextInt();
        int apple = input.nextInt();
        int orange = input.nextInt();
        int fruits = apple + orange;
        if (money >= fruits) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
