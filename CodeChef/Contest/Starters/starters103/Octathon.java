//October Marathon

package CodeChef.Contest.Starters.starters103;

import java.util.Scanner;

public class Octathon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while(testcase-- > 0) {
            int time = input.nextInt();
            if (time < 3){
                System.out.println("Gold");
            } else if (time < 6) {
                System.out.println("Silver");
            }else {
                System.out.println("Bronze");
            }
        }
    }
}
