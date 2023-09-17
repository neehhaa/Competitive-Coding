//Packing Books

package Contest.starters.starters63;

import java.util.Scanner;

public class BookPack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int shelves = input.nextInt();
            int books = input.nextInt();
            int boxes = input.nextInt();

            int boxesRequired = books / boxes;

            if (books % boxes != 0) {
                boxesRequired = boxesRequired + 1;
            }
            int totalBoxes = shelves * boxesRequired;
            System.out.println(totalBoxes);
        }
    }
}