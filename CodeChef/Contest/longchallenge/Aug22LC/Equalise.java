//Make A and B equal

package Contest.longchallenge.AugustLC;

import java.util.Scanner;

public class Equalise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int num1 = input.nextInt();
            int num2 = input.nextInt();
//            if (num1 <= 50 && num2 <= 50) {
//                if (num1 == 0 && num2 == 0) {
//                    System.out.println("YES");
//                } else if
//                (num1 == 0 || num2 == 0) {
//                    System.out.println("NO");
//
//                } else if (num1 > num2) {
//                    while (num1 > num2) {
//                        num1 = num1 / 2;
//                    }
//                    if (num1 == num2) {
//                        System.out.println("YES");
//                    } else {
//                        System.out.println("NO");
//                    }
//
//                } else if (num2 > num1) {
//                    while (num2 > num1) {
//                        num2 = num2 / 2;
//                    }
//                    if (num1 == num2) {
//                        System.out.println("YES");
//                    } else {
//                        System.out.println("NO");
//                    }
//                } else {
//                    System.out.println("YES");
//                }
//            }else {
//                System.out.println("NO");
//            }
//        }
//    }
//}

//approach2


            if (num1 < num2) {
                while (num1 < num2) {
                    num1 = num1 * 2;
                }
                if (num1 == num2) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else if (num2 < num1) {
                while (num2 < num1) {
                    num2 = num2 * 2;
                }
                if (num1 == num2) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }

            } else {
                System.out.println("YES");
            }
        }
    }
}