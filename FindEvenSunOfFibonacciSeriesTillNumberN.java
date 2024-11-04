package HelloWorld;
import java.util.Scanner;
public class FindEvenSunOfFibonacciSeriesTillNumberN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        // Prompt for the upper limit
		        System.out.print("Enter the value of n: ");
		        int n = scanner.nextInt();

		        int sum = calculateEvenFibonacciSum(n);
		        System.out.println("The sum of even Fibonacci numbers up to " + n + " is: " + sum);

		        // Close the scanner to avoid resource leaks
		        scanner.close();
		    }

		    // Method to calculate the sum of even Fibonacci numbers up to n
		    public static int calculateEvenFibonacciSum(int n) {
		        int a = 0, b = 1;
		        int sum = 0;

		        // Generate Fibonacci numbers until b exceeds n
		        while (b <= n) {
		            // Check if the Fibonacci number is even
		            if (b % 2 == 0) {
		                sum += b; // Add to sum if even
		            }
		            int next = a + b; // Calculate the next Fibonacci number
		            a = b; // Move to the next number
		            b = next; // Update b to the next Fibonacci number
		        }

		        return sum;

	}

}
