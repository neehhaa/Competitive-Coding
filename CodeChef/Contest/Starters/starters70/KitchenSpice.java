//Spice Level

package CodeChef.Contest.Starters.starters70;

import java.util.Scanner;

public class KitchenSpice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int level = input.nextInt();
            if (level < 4){
                System.out.println("MILD");
            } else if (level < 7) {
                System.out.println("MEDIUM");
            } else {
                System.out.println("HOT");
            }
        }
    }
}
