//TV Discount

package Contest.starters.starters51;

import java.util.Scanner;

public class TVdisc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int firstTV = input.nextInt();
            int secondTV = input.nextInt();
            int discOnFirst = input.nextInt();
            int discOnSecond = input.nextInt();

            int firstDiscounted = firstTV - discOnFirst;
            int secondDiscounted = secondTV - discOnSecond;

            if (firstDiscounted < secondDiscounted) {
                System.out.println("FIRST");
            } else if (secondDiscounted < firstDiscounted) {
                System.out.println("SECOND");
            } else {
                System.out.println("ANY");
            }
        }
    }
}
