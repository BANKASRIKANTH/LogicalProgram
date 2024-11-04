package HelloWorld;
import java.util.Scanner;
public class LCMofTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        // Prompt for two numbers
		        System.out.print("Enter the first number: ");
		        int num1 = scanner.nextInt();

		        System.out.print("Enter the second number: ");
		        int num2 = scanner.nextInt();

		        // Calculate the LCM
		        int lcm = calculateLCM(num1, num2);

		        // Display the result
		        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);

		        // Close the scanner to avoid resource leaks
		        scanner.close();
		    }

		    // Method to calculate LCM
		    public static int calculateLCM(int a, int b) {
		        return (a * b) / calculateGCD(a, b);
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
