package CodeChef.Contest.Starters.starters93;

import java.util.Scanner;

public class RightThere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int people = input.nextInt();
            int capacity = input.nextInt();
            if(people <= capacity){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
