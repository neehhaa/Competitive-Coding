package CodeChef.Contest.Starters.starters110;

import java.util.Scanner;

public class SPCP3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();;
        while (testcase-- > 0) {
            int totalStudens = input.nextInt();
            int boys = input.nextInt();
            int trek = input.nextInt();
            int girls = totalStudens - boys;

            int boysTrek = boys / trek;
            int remainboys = boys - (boysTrek*trek);
            int girlsTrek = girls / trek;
            int remaingirls = girls - (girlsTrek*trek);

            if (remainboys > remaingirls){
                System.out.println(remainboys-remaingirls);
            } else if (remaingirls > remainboys){
                System.out.println(remaingirls-remainboys);
            } else {
                System.out.println(0);
            }
        }
    }
}
