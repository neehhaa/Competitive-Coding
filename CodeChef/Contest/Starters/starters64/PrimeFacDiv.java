//Prime Factor Division
//unsolved

package Contest.starters.starters64;

import java.util.ArrayList;
import java.util.Scanner;


public class PrimeFacDiv {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int a = input.nextInt();
            int number = input.nextInt();
            int count = 0;
            ArrayList<Integer> al = new ArrayList<>();
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    number = number / i;
                    al.add(i);
                }
            }
            if (number > 2) {
                al.add(number);
            }
            for (int i = 0; i < al.size(); i++) {
                if (a % al.get(i) == 0) {
                    count++;
                }
            }
            if (count == al.size()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
