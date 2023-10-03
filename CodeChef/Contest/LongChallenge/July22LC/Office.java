//Chef in his Office

package CodeChef.Contest.LongChallenge.July22LC;

import java.util.Scanner;

public class Office {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int workDay = input.nextInt();
            int chillDay = input.nextInt();
            int totalHours = (workDay * 4) + chillDay;
            System.out.println(totalHours);
        }
    }
}
