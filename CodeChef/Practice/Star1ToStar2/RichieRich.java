package CodeChef.Practice.Star1ToStar2;

import java.util.Scanner;

public class RichieRich {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int chefAssets = input.nextInt();
            int richest = input.nextInt();
            int chefYearly = input.nextInt();

            int chefNeeds = richest - chefAssets;
            int timeTaken = chefNeeds/chefYearly;
            System.out.println(timeTaken);

        }
    }
}
