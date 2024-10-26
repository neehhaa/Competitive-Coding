package CodeChef.Contest.Starters.starters109;

import java.util.Scanner;

public class CWC23QUALIF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int n = input.nextInt();
            if (n >= 12){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }

        }
    }
}
