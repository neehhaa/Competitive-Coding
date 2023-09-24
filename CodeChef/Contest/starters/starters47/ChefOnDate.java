/* Chef and his girlfriend go on a date. Chef took XX dollars with him,
and was quite sure that this would be enough to pay the bill.
At the end, the waiter brought a bill of YY dollars.
Print "YES" if Chef has enough money to pay the bill,
or "NO" if he has to borrow from his girlfriend and leave a bad impression on her.
*/

package CodeChef.Contest.starters.starters47;

import java.util.Scanner;

public class ChefOnDate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number of Test Cases : ");
        int testCase = scan.nextInt();
        while (testCase-- > 0) {
            int availableMoney = scan.nextInt();
            int bill = scan.nextInt();
            if (availableMoney >= bill) {
                System.out.println("YES"); // CAN PAY
            } else {
                System.out.println("NO"); //BORROW FROM GIRLFRIEND
            }
        }
    }
}