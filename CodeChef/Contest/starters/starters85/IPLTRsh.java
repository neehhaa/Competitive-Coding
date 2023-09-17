package Contest.starters.starters85;

import java.util.Scanner;

public class IPLTRsh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int students = input.nextInt();
            int ticketsAvailable = input.nextInt();
            if (ticketsAvailable < students) {
                System.out.println(students - ticketsAvailable);
            } else {
                System.out.println(0);
            }
        }
    }
}
