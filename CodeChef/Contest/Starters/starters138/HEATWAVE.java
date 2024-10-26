package CodeChef.Contest.Starters.starters138;

import java.util.Scanner;

public class HEATWAVE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int x = input.nextInt();
            int y = input.nextInt();
            if (y>x){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }

        }
    }
}
