//Easy Pronunciation
//unsolved

package Contest.lunchtime.JulyLT;

import java.util.Scanner;

public class EzSpeak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = 1;//input.nextInt();
        while (testcase-- > 0) {
            int wordlength = 15;//input.nextInt();
            String word = "schtschurowskia";//input.next();
            int count = 0;
            char[] vowels = {'a', 'e', 'i', 'o', 'u'};
            if (wordlength == word.length()) {
                for (int i = 0; i <= wordlength - 1; i++) {
                    System.out.println(word.charAt(i));
                    for (int j = 0; j <= vowels.length - 1; j++) {
                        System.out.println(vowels[j]);
                        if (word.charAt(i) != vowels[j]) {
                            //System.out.println("hi");
                            count++;
                            if (count >= 4) {
                                System.out.println("NO");

                            }
                            System.out.println(count);
                            break;
                        } else if (word.charAt(i) == vowels[j]) {
                            count = 0;

                        }
                    }//System.out.println(count);
                }
                //System.out.println(count);
            }
        }
    }
}