//Ticket Fine

package Contest.starters.starters54;

import java.util.Scanner;

public class TcktFine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int fineAmount = input.nextInt();
            int noOfPassengers = input.nextInt();
            int tickets = input.nextInt();
            if (tickets < noOfPassengers) {
                int noTickets = noOfPassengers - tickets;
                int fine = fineAmount * noTickets;
                System.out.println(fine);
            } else {
                System.out.println(0);
            }
        }
    }
}