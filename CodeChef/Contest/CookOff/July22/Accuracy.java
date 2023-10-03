package CodeChef.Contest.CookOff.July22;

import java.util.Scanner;

public class Accuracy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();
        while (testCase-- > 0) {
            int marks = input.nextInt();
            int extra = marks % 3;
            if (extra > 0) {
                if (extra == 1) {
                    System.out.println(2);
                } else if (extra == 2) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else {
                System.out.println(0);
            }
        }
    }
}
