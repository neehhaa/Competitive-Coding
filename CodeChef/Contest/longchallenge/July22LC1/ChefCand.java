/*
Chef and Candies :
There are N children and Chef wants to give them 1 candy each.
Chef already has X candies with him. To buy the rest, he visits a candy shop.
In the shop, packets containing exactly 4 candies are available.
Determine the minimum number of candy packets Chef must buy
so that he is able to give 1 candy to each of the N children.
For each test case, output the minimum number of candy packets Chef must buy so that he is able to give 11 candy to each of the NN children.
 */
package CodeChef.Contest.longchallenge.July22LC1;

import java.util.Scanner;

public class ChefCand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int child = input.nextInt();
            int candies = input.nextInt();
            int packet = 0;
            if (child > candies) {
                int buy = child - candies;
                int packets = buy / 4;
                if (buy % 4 != 0) {
                    packets++;
                }
                System.out.println(packets);

            } else {
                System.out.println(packet);

            }
        }
    }
}
