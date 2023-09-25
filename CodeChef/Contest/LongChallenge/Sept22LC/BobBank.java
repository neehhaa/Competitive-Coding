//Bob at the Bank

package Contest.longchallenge.SeptLC;

import java.util.Scanner;

public class BobBank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int balance = input.nextInt();
            int deposit = input.nextInt();
            int bankCharge = input.nextInt();
            int months = input.nextInt();
            int balanceLeft = balance + (deposit * months) - (bankCharge * months);
            System.out.println(balanceLeft);

        }
    }
}
