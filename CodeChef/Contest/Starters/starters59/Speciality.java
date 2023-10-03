//SPECIALITY

package Contest.starters.starters59;

import java.util.Scanner;

public class Speciality {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int set = input.nextInt();
            int tested = input.nextInt();
            int written = input.nextInt();
            if ((set > tested) && (set > written)) {
                System.out.println("setter");
            } else if ((tested > set) && (tested > written)) {
                System.out.println("Tester");
            } else {
                System.out.println("Editorialist");
            }
        }
    }
}
