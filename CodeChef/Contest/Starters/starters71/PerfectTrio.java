//Perfect Trio

package CodeChef.Contest.Starters.starters71;

import java.util.Scanner;

public class PerfectTrio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while(testcase-- > 0) {
            int person1 = input.nextInt();
            int person2 = input.nextInt();
            int person3 = input.nextInt();

            if ((person1 == (person2 + person3)) || (person2 == (person1 + person3)) || (person3 == (person2 + person1))){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }

        }
    }
}
