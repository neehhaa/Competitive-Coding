//Can Chef

package CodeChef.Contest.Starters.starters85;

import java.util.Scanner;

public class CanChef {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while(testcase-- > 0) {
            int petrol = input.nextInt();
            int distance = input.nextInt();

            int totalDistance = distance * 2;

            if ((petrol * 15) >= totalDistance){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
