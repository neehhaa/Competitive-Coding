//Fill The Grid

package Contest.starters.starters48;

import java.util.Scanner;

public class GridBL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int rows = input.nextInt();
            int columns = input.nextInt();
            if (rows % 2 != 0 && columns % 2 != 0) {
                System.out.println(rows + columns - 1);
            } else if (rows % 2 != 0) {
                System.out.println(columns);
            } else if (columns % 2 != 0) {
                System.out.println(rows);
            } else {
                System.out.println(0);
            }
        }
    }
}
