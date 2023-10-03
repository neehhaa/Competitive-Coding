package CodeChef.Contest.Starters.starters82;

import java.util.Scanner;

public class Reach_Home {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int fuel = input.nextInt();
            int distance = input.nextInt();
            int totalDistance = fuel * 5;

            if (distance <= totalDistance){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
