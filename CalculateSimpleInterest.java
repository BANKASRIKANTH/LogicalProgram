package HelloWorld;
import java.util.Scanner;
public class CalculateSimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        // Prompt for principal amount
		        System.out.print("Enter the principal amount (P): ");
		        double principal = scanner.nextDouble();

		        // Prompt for rate of interest
		        System.out.print("Enter the rate of interest (R) in percentage: ");
		        double rate = scanner.nextDouble();

		        // Prompt for time period
		        System.out.print("Enter the time period (T) in years: ");
		        double time = scanner.nextDouble();

		        // Calculate simple interest
		        double simpleInterest = calculateSimpleInterest(principal, rate, time);

		        // Display the result
		        System.out.println("The Simple Interest is: " + simpleInterest);

		        // Close the scanner to avoid resource leaks
		        scanner.close();
		    }

		    // Method to calculate simple interest
		    public static double calculateSimpleInterest(double P, double R, double T) {
		        return (P * R * T) / 100; // Simple Interest formula

	}

}
