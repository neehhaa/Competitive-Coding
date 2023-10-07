//Reverse The Number

package CodeChef.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class FLOW007 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();


        while (testcase-- > 0) {
            int number = input.nextInt();
            int reverse =0;
            while (number != 0){
                int lastNumber = number % 10;
                reverse = (reverse * 10) + lastNumber;
                number = number / 10;
            }
            System.out.println(reverse);
        }
    }
}
