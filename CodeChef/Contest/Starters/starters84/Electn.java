//Elections in Chefland

package CodeChef.Contest.Starters.starters84;

import java.util.Scanner;

public class Electn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int count = 0;
            int people = input.nextInt();
            int ageLimit = input.nextInt();
            int[] totalPeople = new int[people];

            for (int i = 0; i < people; i++) {
                totalPeople[i] = input.nextInt();
            }
            for (int i = 0; i < people; i++) {
                if (totalPeople[i] >= ageLimit){
                    count++;
                }
            }
            System.out.println(count);
        }
    } 
}
