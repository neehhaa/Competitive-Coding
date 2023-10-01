package CodeChef.Practice.Star1ToStar2;

import java.util.Scanner;

public class VaccineDates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int daysGone = input.nextInt();
            int earlyLimit = input.nextInt();
            int deadline = input.nextInt();

            if (daysGone >= earlyLimit && daysGone <= deadline){
                System.out.println("Take second dose now");
            } else if (daysGone<earlyLimit) {
                System.out.println("Too Early");
            } else {
                System.out.println("Too Late");
            }
        }
    }
}