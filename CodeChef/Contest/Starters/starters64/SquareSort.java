//Square Sort
//unsolved

package Contest.starters.starters64;

import java.util.ArrayList;
import java.util.Scanner;

public class SquareSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = 1;//input.nextInt();
        while (testcase-- > 0) {
            int len = input.nextInt();
            ArrayList<Integer> AL = new ArrayList<>(len);

            for (int i = 0; i < len; i++) {
                AL.add(input.nextInt());
            }

            for (int i = 0; i < len - 1; i++) {
                for (int j = 1; j < len - i - 1; j++) {
                    if (AL.get(i) > AL.get(j)) {
                        int sq = (int) Math.sqrt(AL.get(i));
                        AL.set(i, sq);

                    }

                }
                System.out.println(AL);
            }
        }
    }
}