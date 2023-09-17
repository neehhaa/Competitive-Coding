/*
Increase IQ :
A study has shown that playing a musical instrument helps in increasing one's IQ by 77 points. Chef knows he can't beat Einstein in physics, but he wants to try to beat him in an IQ competition.

You know that Einstein had an IQ of 170170, and Chef currently has an IQ of XX.

Determine if, after learning to play a musical instrument, Chef's IQ will become strictly greater than Einstein's.

Print "Yes" if it is possible for Chef to beat Einstein, else print "No" (without quotes).
 */
package CodeChef.Contest.longchallenge.Mar22LC2;

import java.util.Scanner;

public class IncrIQ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int chefIQ = input.nextInt();
        int afterMusic = chefIQ + 7;
        int einsteinIQ = 170;
        if (afterMusic > einsteinIQ) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
