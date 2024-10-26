package CodeChef.Contest.Starters.starters118;

import java.util.Arrays;
import java.util.Scanner;

public class GCDPerm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int N = input.nextInt();
            int K = input.nextInt();
            int[] result = findMaxGCDSubset(N, K);

            for (int num : result) {
                System.out.print(num + " ");
            }
        }
    }
    public static int[] findMaxGCDSubset(int N, int K) {
        // Initialize the result array
        int[] result = new int[K];

        // Start with the largest numbers in the subset
        int start = N - K + 1;

        // Fill the result array with consecutive numbers
        for (int i = 0; i < K; i++) {
            result[i] = i + 1;
        }

        return result;
    }
}
