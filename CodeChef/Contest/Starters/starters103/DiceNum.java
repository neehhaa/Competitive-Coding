//Dice Number

package CodeChef.Contest.Starters.starters103;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DiceNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            ArrayList<Integer> aliceRolls = new ArrayList<>();
            ArrayList<Integer> bobRolls = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                aliceRolls.add(input.nextInt());
            }
            for (int i = 0; i < 3; i++) {
                bobRolls.add(input.nextInt());
            }
            int aliceSorted = Integer.parseInt(sortingReverse(aliceRolls));
            int bobSorted = Integer.parseInt(sortingReverse(bobRolls));
            if (aliceSorted > bobSorted){
                System.out.println("Alice");
            } else if (bobSorted > aliceSorted) {
                System.out.println("Bob");
            }else {
                System.out.println("Tie");
            }

        }
    }
    public static String sortingReverse(ArrayList<Integer> al) {

        al.sort(Collections.reverseOrder());

        String alice = al.get(0).toString() + al.get(1).toString() + al.get(2).toString();


        return alice;

    }
}
