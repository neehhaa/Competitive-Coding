//Candies
//unsolved

package Contest.starters.starters65;

import java.util.Scanner;

public class Cndy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int len = input.nextInt();
            int noOfElements = len * 2;
            int[] arr = new int[noOfElements];

            for (int i = 0; i < noOfElements; i++) {
                arr[i] = input.nextInt();
            }

            int[] fr = new int[arr.length];
            int visited = -1;
            for (int i = 0; i < arr.length; i++) {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        //To avoid counting same element again
                        fr[j] = visited;
                    }
                }
                if (fr[i] != visited)
                    fr[i] = count;
            }


            for (int i = 0; i < fr.length; i++) {
                if (fr[i] != visited) {
                    if (fr[i] > 2) {
                        System.out.println("NO");
                    } else {
                        System.out.println("YES");
                        break;
                    }
                }

            }
        }
    }
}
