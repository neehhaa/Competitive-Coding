package CodeChef.Contest.Starters.starters76;

import java.util.Scanner;

public class ReadPages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int pages = input.nextInt();
            int reqPages = input.nextInt();
            int days = input.nextInt();

            int pagesDone = reqPages * days;
            if (pagesDone >=pages){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
