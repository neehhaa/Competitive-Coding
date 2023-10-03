//Battery Health

package CodeChef.Contest.CookOff.Feb22;

import java.util.Scanner;

public class BtryHlth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while(testcase-- > 0) {
            int battery = input.nextInt();
            if (battery >= 80){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
