//Mileage matters

package Contest.starters.starters50;

import java.util.Scanner;

public class Mileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while (testcase-- > 0) {
            double distance = input.nextInt();
            double petrol = input.nextInt();
            double diesel = input.nextInt();
            double petrolMil = input.nextInt();
            double dieselMil = input.nextInt();

            double petrolReq = distance / petrolMil;

            double dieselReq = distance / dieselMil;

            double petrolCost = petrol * petrolReq;
            double dieselCost = diesel * dieselReq;

            if (petrolCost < dieselCost) {
                System.out.println("Petrol");
            } else if (dieselCost < petrolCost) {
                System.out.println("Diesel");
            } else {
                System.out.println("Any");
            }
        }
    }
}
