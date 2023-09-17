//Minimum Pizzas

package Contest.longchallenge.OctLC;

import java.util.Scanner;

public class MinPizza {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int friends = input.nextInt();
            int slices = input.nextInt();
            int totalSlices = friends * slices;
            int totalpizza = totalSlices / 4;

            if (totalSlices % 4 == 0) {
                System.out.println(totalpizza);
            } else {
                System.out.println(totalpizza + 1);
            }
        }
    }
}
