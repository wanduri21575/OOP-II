//CT100/G/21575/24
//WANDURI MOSES 
//WEEK 5 ACTIVITY -Electric Bill,Fare Calculation,Temperature Conversion

import java.util.Scanner;

public class Week5Activity {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  Electric Bill
        System.out.print("Enter the number of units consumed: ");
        int units = scanner.nextInt();
        double bill = calculateElectricBill(units);
        System.out.println("Total bill amount: KSh. " + bill);
        System.out.println();

        //  Fare Calculation
        System.out.print("Enter the distance traveled (in kilometers): ");
        double distance = scanner.nextDouble();
        double fare = calculateFare(distance);
        System.out.println("Total fare: KSh. " + fare);
        System.out.println();

        // Temperature Conversion
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = convertToCelsius(fahrenheit);
        System.out.printf("Temperature in Celsius: %.2f°C%n", celsius);
        System.out.println();

        scanner.close();
    }

    // Calculates the electric bill based on units consumed.
     
    public static double calculateElectricBill(int units) {
        double totalBill = 0;

        if (units <= 100) {
            totalBill = units * 10;
        } else if (units <= 200) {
            totalBill = (100 * 10) + ((units - 100) * 15);
        } else {
            totalBill = (100 * 10) + (100 * 15) + ((units - 200) * 20);
        }

        return totalBill;
    }

    //Calculates the fare based on distance traveled.
    
    public static double calculateFare(double distance) {
        return distance * 50;
    }

    //Converts temperature from Fahrenheit to Celsius.
    
    public static double convertToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
}
