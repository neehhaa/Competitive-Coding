package CodeChef.Contest.Starters.starters118;

import java.util.Scanner;

public class Litrate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while(testcase-- > 0){
            int population = input.nextInt();
            int literate = input.nextInt();
            float literacyRate = ((float) literate / population) * 100;
            if (literacyRate >= 75){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
