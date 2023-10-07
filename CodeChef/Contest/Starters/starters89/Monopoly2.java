//Monopoly

package CodeChef.Contest.Starters.starters89;

import java.util.Scanner;

public class Monopoly2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int P = input.nextInt();
            int Q = input.nextInt();
            int R = input.nextInt();
            int S = input.nextInt();

            if (P > (Q+R+S) || Q > (P+R+S) || R > (Q+P+S) || S > (P+R+Q) ){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }


        }
    }
}
