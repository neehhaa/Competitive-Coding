//Count the Notebooks
package CodeChef.Contest.starters.starters26;

import java.util.Scanner;

public class NotebookCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            int pulp = input.nextInt();
            int notebook = (pulp * 10);
            System.out.println(notebook);
        }
    }
}
