//Rivalry

package CodeChef.Contest.Starters.starters108;

import java.util.Scanner;

public class CPRival {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int rating1 = input.nextInt();
            int rating2 = input.nextInt();

            int newRating1 = input.nextInt();
            int newRating2 = input.nextInt();

            int changedRating1 = rating1 + newRating1;
            int changedRating2 = rating2 + newRating2;

            if (changedRating1 > changedRating2){
                System.out.println("Dominator");
            }else {
                System.out.println("Everule");
            }


        }
    }
}
