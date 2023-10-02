//Codechef Airlines

package CodeChef.Contest.Starters.starters77;

import java.util.Scanner;

public class Airlines {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while(testcase-- > 0) {
            int capacity = input.nextInt();
            int people = input.nextInt();
            int price = input.nextInt();

            int totalCapacity = capacity * 10;

            if (people <= totalCapacity){
                System.out.println(people * price);
            }else {
                System.out.println(totalCapacity * price);
            }
        }
    }
}
