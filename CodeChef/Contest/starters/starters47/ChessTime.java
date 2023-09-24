/*
Chess Time :
Chef has recently started playing chess, and wants to play as many games as possible.
He calculated that playing one game of chess takes at least 20 minutes of his time.
Chef has N hours of free time. What is the maximum number of complete chess games he can play in that time?
 */
package CodeChef.Contest.starters.starters47;

import java.util.Scanner;

public class ChessTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int hours = input.nextInt();
            int minutes = hours * 60;
            System.out.println(minutes / 20);

        }
    }
}
