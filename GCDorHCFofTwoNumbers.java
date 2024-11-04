package HelloWorld;
import java.util.Scanner;

public class GCDorHCFofTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);

		        // Prompt for two numbers
		        System.out.print("Enter the first number: ");
		        int num1 = scanner.nextInt();

		        System.out.print("Enter the second number: ");
		        int num2 = scanner.nextInt();

		        // Calculate the GCD
		        int gcd = calculateGCD(num1, num2);

		        // Display the result
		        System.out.println("The GCD (HCF) of " + num1 + " and " + num2 + " is: " + gcd);

		        // Close the scanner to avoid resource leaks
		        scanner.close();
		    }

		    // Method to calculate GCD using the Euclidean algorithm
		    public static int calculateGCD(int a, int b) {
		        while (b != 0) {
		            int temp = b;
		            b = a % b;
		            a = temp;
		        }
		        return a;
		 
	}

}
