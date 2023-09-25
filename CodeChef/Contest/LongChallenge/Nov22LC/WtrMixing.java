//Water Mixing

package Contest.longchallenge.NovLC;

import java.util.Scanner;

public class WtrMixing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int temp = input.nextInt();
            int desired = input.nextInt();

            int hot = input.nextInt();
            int cold = input.nextInt();

            if (temp >= desired) {
                int coldneeded = temp - desired;
                if (coldneeded < cold) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                int hotneeded = desired - temp;
                if (hotneeded < hot) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
