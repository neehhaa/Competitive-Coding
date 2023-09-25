//Positive array
//unsolved

package Contest.starters.starters48;

import java.util.Scanner;

public class CIREQ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = 1;//input.nextInt();
        while (testcase-- > 0) {
            int N = input.nextInt();
            int[] A = new int[N];
            for (int i = 0; i <= N - 1; i++) {
                A[i] = input.nextInt();
                System.out.println(i);
                if (A[i] >= i) {

                }
            }
        }
    }
}
