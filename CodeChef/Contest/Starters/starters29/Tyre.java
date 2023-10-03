//Tyre problem
package CodeChef.Contest.Starters.starters29;

import java.util.Scanner;

public class Tyre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int bike = input.nextInt();
            int car = input.nextInt();
            int bikeWheels = bike * 2;
            int carWheels = car * 4;
            System.out.println(bikeWheels + carWheels);
        }
    }
}