/*
Pass the Exam :
Chef appeared for an exam consisting of 3 sections. Each section is worth 100 marks.
Chef scored A marks in Section 1, B marks in section 2, and C marks in section 3.
Chef passes the exam if both of the following conditions satisfy:
Total score of Chef is ≥100;
Score of each section ≥10.
Determine whether Chef passes the exam or not.
output PASS if Chef passes the exam, FAIL otherwise.
 */
package CodeChef.Contest.longchallenge.July22LC1;

import java.util.Scanner;

public class PassTheExam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int exam1 = input.nextInt();
            int exam2 = input.nextInt();
            int exam3 = input.nextInt();
            int total = exam1 + exam2 + exam3;

            if (exam1 >= 10 && exam2 >= 10 && exam3 >= 10) {
                if (total >= 100) {
                    System.out.println("PASS");
                } else {
                    System.out.println("FAIL");
                }
            } else {
                System.out.println("FAIL");
            }
        }
    }
}
