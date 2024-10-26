package CodeChef.Contest.Starters.starters140;

import java.util.Scanner;

public class YogaClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int hours = input.nextInt();
            int cost_one = input.nextInt();
            int cost_two = input.nextInt();
            int salary = 0;
            if (cost_one * 2 > cost_two){
                salary = cost_one * hours;
                System.out.println(salary);
            }else{
                if (hours % 2 == 0){
                    hours = hours/2;
                    salary = hours * cost_two;
                    System.out.println(salary);
                }else {
                    hours = hours/2;
                    salary = (hours * cost_two) + cost_one;
                    System.out.println(salary);
                }
            }
        }
    }
}
