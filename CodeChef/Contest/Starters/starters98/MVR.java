//Messi vs Ronaldo

package CodeChef.Contest.Starters.starters98;

import java.util.Scanner;

public class MVR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int messiGoals = input.nextInt();
            int messiAssist = input.nextInt();
            int ronaldoGoals = input.nextInt();
            int ronaldoAssist = input.nextInt();

            int messiScore = 2 * messiGoals + messiAssist;
            int ronaldoScore = 2 * ronaldoGoals + ronaldoAssist;

            if (messiScore > ronaldoScore){
                System.out.println("Messi");
            } else if (ronaldoScore > messiScore) {
                System.out.println("Ronaldo");
            }else {
                System.out.println("Equal");
            }
        }
    }
}
