//Puzzle Hunt

package CodeChef.Contest.Starters.starters99;

import java.util.Scanner;

public class PuzHunt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int member = input.nextInt();
            if (member >= 6 && member <= 8){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
