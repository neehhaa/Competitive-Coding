package CodeChef.Contest.Starters.starters118;

import java.util.Scanner;

public class x {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int X = input.nextInt();
            int[] xorryPair = findXorryPair(X);

            if (xorryPair.length == 2) {
                System.out.println(xorryPair[0] + " " + xorryPair[1]);
            } else {
                System.out.println(X);
            }

        }
    }
    public static int[] findXorryPair(int X) {
        for (int A = 0; A <= X; A++) {
            for (int B = A; B <= X; B++) {
                if ((A ^ B) == X) {
                    return new int[]{A, B};
                }
            }
        }
        // If no Xorry pair is found, return an empty array or handle accordingly
        return new int[0];
    }
}
