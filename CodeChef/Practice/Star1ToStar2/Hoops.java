package CodeChef.Practice.Star1ToStar2;

import java.util.Scanner;

public class Hoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int steps = input.nextInt();
            System.out.println((steps/2)+1);
        }
    }
}
