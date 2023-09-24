//Playlist
package CodeChef.Contest.CookOff.June22CO;

import java.util.Scanner;

public class Songs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int trainTime = input.nextInt();
            int songtime = input.nextInt();
            int songOf3 = songtime * 3;
            int songC = trainTime / songOf3;
            System.out.println(songC);
        }
    }
}
