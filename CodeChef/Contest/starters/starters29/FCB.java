//Fill the Bucket
package CodeChef.Contest.starters.starters29;

import java.util.Scanner;

public class FCB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int capacity = input.nextInt();
            int filled = input.nextInt();
            int extraWater = capacity - filled;
            System.out.println(extraWater);
        }
    }
}