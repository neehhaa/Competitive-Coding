package Contest.lunchtime;

import java.util.ArrayList;
import java.util.Scanner;

public class IncAdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int n = input.nextInt();
            int q = input.nextInt();
            ArrayList<Integer> a = new ArrayList<>(n);

            for (int i = 0; i < n; i++) {
                a.add(input.nextInt());
            }

        }
    }
}
