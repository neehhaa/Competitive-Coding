//Mahasena
package CodeChef.Practice;

import java.util.Scanner;

public class AMR15A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int soldierCount = input.nextInt();
        int[] soldier = new int[soldierCount];
        int count = 0;

        for (int i = 0; i <= soldierCount - 1; i++) {
            soldier[i] = input.nextInt();
        }
        for (int i = 0; i <= soldierCount - 1; i++) {
            if (soldier[i] % 2 == 0) {
                count++;
            }
        }
        if (count > (soldierCount / 2)) {
            System.out.println("READY FOR BATTLE");
        } else {
            System.out.println("NOT READY");
        }
    }
}

