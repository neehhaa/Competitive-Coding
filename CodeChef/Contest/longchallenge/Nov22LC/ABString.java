//String Game
//unsolved

package Contest.longchallenge.NovLC;

import java.util.Scanner;

public class ABString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int len = input.nextInt();
            int count = 0;
            String common = input.next();
            for (int i = 0; i < len; i++) {
                for (int j = 1; j < len; j++) {
                    if (common.charAt(i) == common.charAt(j)) {
                        count++;
                    }
                }
            }
            if (len % 2 == 0) {

            } else {
                System.out.println("NO");
            }
        }
    }
}