//Tom and Jerry Chase

package CodeChef.Contest.Starters.starters77;

import java.util.Scanner;

public class JerryChase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int jerry = input.nextInt();
            int tom = input.nextInt();
            if (jerry < tom){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }

        }
    }
}
