//Equal distinct
//unsolved

package Contest.starters.starters54;

import java.util.Scanner;

public class EqDis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int n = input.nextInt();
            int[] a = new int[n];

            for (int i = 0; i <= n - 1; i++) {
                a[i] = input.nextInt();
            }
            int[] frequency = new int[n];
            int visited = -1;

            for (int i = 0; i <= n - 1; i++) {
                int count = 1;
                for (int j = i + 1; j < n - 1; j++) {
                    if (a[i] == a[j]) {
                        count++;
                        //To avoid counting same element again
                        frequency[j] = visited;
                    }
                    if (count > 2) {
                        System.out.println("no");
                    }
                }
                if (frequency[i] != visited)
                    frequency[i] = count;
            }
        }
    }
}
