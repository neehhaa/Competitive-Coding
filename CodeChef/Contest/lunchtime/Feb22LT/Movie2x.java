//Watching Movies at 2x
package CodeChef.Contest.lunchtime.Feb22LT;

import java.util.Scanner;

public class Movie2x {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalMovie = input.nextInt();
        int speeduptill = input.nextInt();

        int totalSpeedup = speeduptill / 2;

        int remain = totalMovie - totalSpeedup;
        System.out.println(remain);


    }
}
