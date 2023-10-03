//Lockpicking Chef

package CodeChef.Contest.Starters.starters101;

import java.util.Scanner;

public class LPC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int stringLength = input.nextInt();
            int secretCodeLength  = input.nextInt();
            String lockString = input.next();
            String secretCode = input.next();

            if (lockString.contains(secretCode)){
                System.out.println(0);
            }else {
                int minSteps = Integer.MAX_VALUE;
                String closestStr = "";

                for (int i = 0; i <= stringLength - secretCodeLength; i++) {
                    String currentSubstring = lockString.substring(i, i + secretCodeLength);
                    int steps = calculateSteps(secretCode, currentSubstring);

                    if (steps < minSteps) {
                        minSteps = steps;
                    }
                }

                System.out.println(minSteps);

            }

        }
    }
    private static int calculateSteps(String target, String current) {
        int steps = 0;

        for (int i = 0; i < target.length(); i++) {
            int targetDigit = Character.getNumericValue(target.charAt(i));
            int currentDigit = Character.getNumericValue(current.charAt(i));

            int clockwiseSteps = Math.abs(targetDigit - currentDigit);
            int counterClockwiseSteps = 10 - clockwiseSteps;

            steps += Math.min(clockwiseSteps, counterClockwiseSteps);
        }

        return steps;
    }
}
