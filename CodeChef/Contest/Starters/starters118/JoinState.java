package CodeChef.Contest.Starters.starters118;

import java.util.Scanner;

public class JoinState {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int states = input.nextInt();
            int literate = input.nextInt();
            int[] initialCount = new int[states];
            for (int i = 0; i < states; i++) {
                initialCount[i] = input.nextInt();
            }
            int result = maxStatesToMeetCondition(initialCount, states, literate);
            System.out.println(result);
        }
    }
    public static int maxStatesToMeetCondition(int[] A, int N, int M) {
        int result = 0;  // Variable to store the maximum number of states
        int currentLiterateCount = 0;  // Variable to store the literate count of the current combined states

        for (int i = 0; i < N; i++) {
            currentLiterateCount += A[i];

            // If the current literate count is greater than or equal to M, it means the condition is met for the current combined states
            if (currentLiterateCount >= M) {
                result++;
                currentLiterateCount = 0;  // Reset the count for the next set of states
            }
        }

        return result;
    }
}
