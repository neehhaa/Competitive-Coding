/*
My very 1st contest! :
In a contest where N new users visited the contest,
A users just saw the problems and didn’t make any submissions and hence won’t get any rating.
B users who made a submission but could not solve any problem correctly.
Thus, after the contest, they will get a rating in the range 800−1000.
Everyone else could correctly solve at least 1 problem.
Thus, they will get a rating strictly greater than 1000 after the contest.
You need to output the number of new users in the contest who,
after the contest, will get a rating and also the number of new users
who will get a rating strictly greater than 1000.
 */
package CodeChef.Practice;

import java.util.Scanner;

public class FirstContest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int users = input.nextInt();
        int visited = input.nextInt();
        int submission = input.nextInt();

        int rated = users - visited;
        int toprated = rated - submission;
        System.out.println(rated + " " + toprated);
    }
}
