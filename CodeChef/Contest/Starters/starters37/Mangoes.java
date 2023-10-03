//The Mango Truck
package CodeChef.Contest.Starters.starters37;

import java.util.Scanner;

public class Mangoes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int mango = input.nextInt();
            int truck = input.nextInt();
            int canWithstand = input.nextInt();

            int remain = canWithstand - truck;
            int mangoes = remain / mango;
            System.out.println(mangoes);
        }
    }
}
