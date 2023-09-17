//MATH1 Enrolment
package CodeChef.Contest.starters.starters46;

import java.util.Scanner;

public class M1Enroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int seats = input.nextInt();
            int students = input.nextInt();
            int seatsNeeded = students - seats;
            if (seats >= students) {
                System.out.println(0);
            } else {
                System.out.println(seatsNeeded);
            }
        }
    }
}
