package CodeChef.Contest.Starters.starters118;

import java.util.Scanner;

public class IED {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int chef = input.nextInt();
            int chefina = input.nextInt();
            int items = input.nextInt();

            int chefSold = chef * items;
            int chefinaSold = chefina * items;

            System.out.println(Math.max(chefinaSold,chefSold));


    }
}
