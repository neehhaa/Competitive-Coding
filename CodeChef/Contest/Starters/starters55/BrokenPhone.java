//Broken Phone

package Contest.starters.starters55;

import java.util.Scanner;

public class BrokenPhone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = 1;//input.nextInt();
        while (testcase-- > 0) {
            int repair = input.nextInt();
            int newPhone = input.nextInt();
            if (repair > newPhone) {
                System.out.println("NEW PHONE");
            } else if (newPhone > repair) {
                System.out.println("Repair");
            } else {
                System.out.println("ANY");
            }
        }
    }
}
