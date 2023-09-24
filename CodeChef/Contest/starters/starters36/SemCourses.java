//Chef and Chapters
package CodeChef.Contest.starters.starters36;

import java.util.Scanner;

public class SemCourses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int courses = input.nextInt();
            int units = input.nextInt();
            int chapters = input.nextInt();
            int totalChapters = (chapters * units * courses);
            System.out.println(totalChapters);
        }
    }
}
