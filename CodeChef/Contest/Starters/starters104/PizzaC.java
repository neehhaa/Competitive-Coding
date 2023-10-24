//Pizza Cutting

package CodeChef.Contest.Starters.starters104;

import java.util.Scanner;

public class PizzaC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int cut = input.nextInt();
            if(cut == 1 || cut % 2 == 0){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
