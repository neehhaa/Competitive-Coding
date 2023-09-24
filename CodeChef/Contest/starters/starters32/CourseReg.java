/*
Course Registration :
There is a group of N friends who wish to enroll in a course together.
The course has a maximum capacity of M students that can register for it.
If there are K other students who have already enrolled in the course,
determine if it will still be possible for all the N friends to do so or not.
 */

package CodeChef.Contest.starters.starters32;

import java.util.Scanner;

public class CourseReg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int friends = input.nextInt();
            int capacity = input.nextInt();
            int occupied = input.nextInt();

            int unoccupied = capacity - occupied;

            if (unoccupied >= friends) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
