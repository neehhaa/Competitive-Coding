// Sports Section

package CodeChef.Contest.Starters.starters102;

import java.util.Scanner;

public class Newspaper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int pageNumber = input.nextInt();
            if (pageNumber > 7 && pageNumber < 11){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
