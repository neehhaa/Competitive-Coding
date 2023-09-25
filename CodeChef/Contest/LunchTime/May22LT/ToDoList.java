//Problems in your to-do list
package CodeChef.Contest.LunchTime.May22LT;

import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int noOfProblems = input.nextInt();
            int[] ratings = new int[noOfProblems];
            int count = 0;

            for (int i = 0; i < noOfProblems; i++) {
                ratings[i] = input.nextInt();
            }
            for (int i = 0; i < noOfProblems; i++) {
                if (ratings[i] >= 1000) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
