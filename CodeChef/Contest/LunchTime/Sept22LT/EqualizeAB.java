//Equalize AB
//unsolved

package Contest.lunchtime.SeptLT;

import java.util.Scanner;

public class EqualizeAB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int a = input.nextInt();
            int b = input.nextInt();
            int x = input.nextInt();
            if (a == b) {
                System.out.println("yes");
            }
            if (a < b) {
                while (a < b) {
                    a = a + x;
                    b = b - x;
                    if (a == b) {
                        System.out.println("yes");
                        break;
                    }
                    if (a > b) {
                        System.out.println("no");
                        break;
                    }
                }


            } else if (b < a) {
                while (b < a) {
                    a = a - x;
                    b = b + x;
                    if (a == b) {
                        System.out.println("yes");
                        break;
                    }
                    if (a < b) {
                        System.out.println("no");
                        break;
                    }

                }


            }
        }
    }
}
