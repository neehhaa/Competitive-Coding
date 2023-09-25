/*
Alice, Bob and Charlie are bidding for an artifact at an auction.
Alice bids AA rupees, Bob bids BB rupees, and Charlie bids CC rupees (where AA, BB, and CC are distinct).
According to the rules of the auction, the person who bids the highest amount will win the auction.
Determine who will win the auction.
For each test case, output who (out of Alice, Bob, and Charlie) will win the auction
*/


package CodeChef.Contest.LongChallenge.July22LC1;

import java.util.Scanner;

public class Auction {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of Test cases : ");
        int testCase = scan.nextInt();

        while (testCase-- > 0) {
            int aliceBid = scan.nextInt();
            int bobBid = scan.nextInt();
            int charlieBid = scan.nextInt();

            if (aliceBid > bobBid) {
                if (charlieBid > aliceBid) {
                    System.out.println("CHARLIE WINS!!!");
                } else {
                    System.out.println("ALICE WINS!!!");
                }
            } else if (bobBid > charlieBid) {

                System.out.println("BOB WINS!!!");

            } else {
                System.out.println("CHARLIE WINS!!!");
            }
        }
    }
}
