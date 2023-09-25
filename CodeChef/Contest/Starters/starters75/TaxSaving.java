//Saving Taxes

package Contest.starters.starters75;

import java.util.Scanner;

public class TaxSaving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int salary = input.nextInt();
            int maxSalary = input.nextInt();
            if (salary > maxSalary) {
                System.out.println(salary - maxSalary);
            } else {
                System.out.println(0);
            }

        }
    }
}
