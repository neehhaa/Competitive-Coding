//Divisible by K
//unsolved

package Contest.longchallenge.DecLC;

import java.util.Scanner;

public class DivByK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();
            int product = 1;
            int[] lst = new int[n];

            for (int i = 0; i < n; i++) {
                lst[i] = input.nextInt();
                if (lst[i] != 0) {
                    product = product * lst[i];
                }
            }
            if (k > 0) {
                if (product % k == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}