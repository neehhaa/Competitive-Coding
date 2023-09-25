//Practice makes us perfect
package CodeChef.Contest.LongChallenge.May22LC2;

import java.util.Scanner;

public class PracticePerf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int week1 = input.nextInt();
        int week2 = input.nextInt();
        int week3 = input.nextInt();
        int week4 = input.nextInt();
        int[] x = {week1, week2, week3, week4};
        int count = 0;
        for (int i = 0; i <= (x.length - 1); i++) {
            if (x[i] >= 10) {
                count++;
            }
        }
        System.out.println(count);
    }
}
