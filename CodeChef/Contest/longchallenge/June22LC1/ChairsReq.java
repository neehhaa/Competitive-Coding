//Chairs Requirement
package CodeChef.Contest.longchallenge.June22LC1;

import java.util.Scanner;

public class ChairsReq {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int students = input.nextInt();
            int chairs = input.nextInt();
            if (students > chairs) {
                int req = students - chairs;
                System.out.println(req);
            } else {
                System.out.println(0);
            }


        }
    }
}
