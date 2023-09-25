//CodeChef Learn Problem Solving

package Contest.starters.starters86;

import java.util.Scanner;

public class CCLearn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int language = input.nextInt();
            int courses = language * 2;
            System.out.println(courses);
        }
    }
}
