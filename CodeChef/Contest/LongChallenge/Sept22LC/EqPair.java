//Good Pairs
//unsolved

package Contest.longchallenge.SeptLC;

import java.util.Scanner;

public class EqPair {
    static int gcd(int a, int b) {
        int result = Math.min(a, b);
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcases = 1;//input.nextInt();
        while (testcases-- > 0) {
            int noOfElements = input.nextInt();
            int count = 0;
            int[] numbers = new int[noOfElements];
            for (int i = 0; i < noOfElements; i++) {
                numbers[i] = input.nextInt();
            }
            for (int i = 0; i < noOfElements; i++) {
                for (int j = 1; j < noOfElements; j++) {
                    int a = numbers[i];
                    int b = numbers[j];


                }
            }

        }
    }
}