/**
 * This class takes user inputs of customer and their parking hours
 * calculates the parking fee for each customer.
 * calculate the total profit of the garage.
 * $2 for the first 3 hours
 * after 3 hours, $.5 per hour. no more that $ 10 a day
 *
 * !!!!!! encountered an error ----- when using nextLine(), Scanner skips the input. Changed to next(), it worked.
 * Reason?
 * @author--Zheng Wang
 */
import java.util.Scanner;

public class ParkingCharges {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char moreParkings = 'y';

        double totalCharges = 0;

        while (moreParkings == 'y') {
            System.out.print("Please enter customer's name: ");
            String name = in.next();//if I use nextLine(); on the 2nd iteration, Scanner skips this input.

            System.out.print("Please enter customer's parking hours: ");
            double parkingHours = in.nextDouble();
            System.out.printf("%n%s parked %.2f hours. Parking fee is $%.2f%n", name, parkingHours,calculateParkingCharges(parkingHours));
            totalCharges += calculateParkingCharges(parkingHours);
            System.out.println("More parkings? (y/n)");
            moreParkings = in.next().charAt(0);
        }

        System.out.printf("Total charges of the day: $%.2f", totalCharges);

    }

    public static double calculateParkingCharges(double hours) {
        double charges;

        if (hours == 0) {
            charges = 0;
        }else if(hours < 3) {
            charges = 2;
        }else {
            charges= 2.00 + (Math.ceil(hours) - 3) * 0.5;
        }
        if (charges > 10.00) {
            charges = 10.00;
        }
        return charges;
    }
}
