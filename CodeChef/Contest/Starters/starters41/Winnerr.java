//Determine the Winner

package CodeChef.Contest.Starters.starters41;

import java.util.Scanner;

public class Winnerr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int timePA = input.nextInt();
            int timePB = input.nextInt();
            int timeQA = input.nextInt();
            int timeQB = input.nextInt();

            int timeP = 0;
            int timeQ = 0;

            if (timePA >= timePB){
                timeP = timePA;
            }else {
                timeP = timePB;
            }

            if (timeQA >= timeQB){
                timeQ = timeQA;
            }else {
                timeQ = timeQB;
            }

            if (timeP < timeQ){
                System.out.println("P");
            }else if (timeQ < timeP){
                System.out.println("Q");
            } else {
                System.out.println("TIE");
            }

        }
    }
}
