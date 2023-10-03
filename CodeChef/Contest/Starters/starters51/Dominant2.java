//Dominant Element
//unsolved

package Contest.starters.starters51;

import java.util.Arrays;
import java.util.Scanner;

public class Dominant2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = 1;//input.nextInt();
        while (testcase-- > 0) {
            int noOfElement = 6;//input.nextInt();
            int[] x = new int[noOfElement];
            int[] occur = new int[noOfElement];
            int count = 0;
            Arrays.fill(occur, 0);

            for (int i = 0; i < noOfElement; i++) {
                x[i] = input.nextInt();
                occur[x[i]]++;
            }
            for (int i = 0; i < noOfElement; i++) {
                if (occur[i] > 1)
                    System.out.println(i + " is occurs " + occur[i] + " times");
            }
        }
    }
}
