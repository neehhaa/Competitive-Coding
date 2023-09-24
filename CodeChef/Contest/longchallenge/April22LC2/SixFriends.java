//Six Friends
package CodeChef.Contest.longchallenge.April22LC2;

import java.util.Scanner;

public class SixFriends {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int doublee = input.nextInt();
            int triple = input.nextInt();

            int roomFor2 = doublee * 3;
            int roomFor3 = triple * 2;

            if (roomFor2 <= roomFor3) {
                System.out.println(roomFor2);
            } else {
                System.out.println(roomFor3);
            }
        }
    }
}
