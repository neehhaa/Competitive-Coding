//Parliament

package CodeChef.Contest.Starters.starters89;

import java.util.Scanner;

public class Parliament {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while(testcase-- > 0) {
            int members = input.nextInt();
            int voted = input.nextInt();

            if (members % 2 != 0){
                members++;
            }
            if (voted >= (members/2)){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
