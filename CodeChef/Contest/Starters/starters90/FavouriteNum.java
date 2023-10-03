//Favourite Numbers

package CodeChef.Contest.Starters.starters90;

import java.util.Scanner;

public class FavouriteNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while(testcase-- > 0) {
            int number = input.nextInt();

            if (number % 2 == 0 && number % 7 == 0){
                System.out.println("Alice");
            } else if (number % 2 != 0 && number % 9 == 0) {
                System.out.println("Bob");
            } else {
                System.out.println("Charlie");
            }
        }
    }
}
