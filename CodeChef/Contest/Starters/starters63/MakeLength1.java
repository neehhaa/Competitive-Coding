//Make Length 1
//unsolved

package Contest.starters.starters63;

import java.util.Scanner;

public class MakeLength1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int len = input.nextInt();
            String bin = "";

            for (int i = 0; i < len; i++) {
                bin = bin + input.next();
            }
            System.out.println(bin);

        }
    }
}

