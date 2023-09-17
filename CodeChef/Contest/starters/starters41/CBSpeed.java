//Chef and Brain Speed
package CodeChef.Contest.starters.starters41;

import java.util.Scanner;

public class CBSpeed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cheflimit = input.nextInt();
        int chefspeed = input.nextInt();
        if (chefspeed > cheflimit) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
