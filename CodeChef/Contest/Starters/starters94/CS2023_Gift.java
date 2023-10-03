package CodeChef.Contest.Starters.starters94;

import java.util.Scanner;

public class CS2023_Gift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int om = input.nextInt();
            int laptop = input.nextInt();
            int funds = input.nextInt();
            if ((funds + om) >= laptop){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
