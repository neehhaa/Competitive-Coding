//The Three Topics
package CodeChef.Contest.longchallenge.Mar22LC2;

import java.util.Scanner;

public class ThreeTopics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int topicA = input.nextInt();
        int topicB = input.nextInt();
        int topicC = input.nextInt();

        int gotTopic = input.nextInt();

        if ((gotTopic == topicA) || (gotTopic == topicB) || (gotTopic == topicC)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

