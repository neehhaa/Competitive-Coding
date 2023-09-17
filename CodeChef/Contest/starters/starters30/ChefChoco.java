//Chef and Chocolates
package CodeChef.Contest.starters.starters30;

import java.util.Scanner;

public class ChefChoco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int totalChoco = input.nextInt();
            int hasChoco = input.nextInt();
            int price = input.nextInt();
            int buy = totalChoco - hasChoco;
            int money = price * buy;
            System.out.println(money);
        }
    }
}
