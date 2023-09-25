//Number of Credits

package Contest.starters.starters54;

import java.util.Scanner;

public class Creds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int RTP = input.nextInt();
            int audit = input.nextInt();
            int nonRTP = input.nextInt();

            int cred = (RTP * 4) + (audit * 2);
            System.out.println(cred);
        }
    }
}