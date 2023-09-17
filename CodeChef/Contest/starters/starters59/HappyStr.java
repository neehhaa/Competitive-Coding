//Chef and Happy String
//unsolved

package Contest.starters.starters59;

import java.util.Scanner;

public class HappyStr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = 1;//input.nextInt();

        while (testcase-- > 0) {
            String str = "bacdeoijkq";//input.next();
            char[] vowels = {'a', 'e', 'i', 'o', 'u'};
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                for (int j = 0; j < vowels.length; j++) {
                    if (str.charAt(i) == vowels[j]) {
                        count++;
                        break;
                    }
                    if (count > 3) {
                        System.out.println("happy");
                        System.out.println(count);
                    }
                    if (str.charAt(i) != vowels[j]) {
                        count = 0;
                    }
                }
            }
        }
    }
}