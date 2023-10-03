//Sum Of Cube
//unsolved

package Contest.longchallenge.DecLC;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfCube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = 1;//input.nextInt();
        while (testcase-- > 0) {
            int noOfElements = 5;//input.nextInt();
            //int k = input.nextInt();
            int product = 1;
            ArrayList<Integer> lst = new ArrayList<Integer>(noOfElements);

            for (int i = 0; i < noOfElements; i++) {
                lst.add(input.nextInt());
            }
            for (int i = 0; i < noOfElements; i++) {
                for (int j = i; j < noOfElements; j++) {
                    int a = lst.get(i) + lst.get(j);
                    System.out.println(a);
                }
            }
        }
    }
}
