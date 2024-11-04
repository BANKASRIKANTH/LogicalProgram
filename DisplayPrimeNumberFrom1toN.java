package HelloWorld;
import java.util.Scanner;
public class DisplayPrimeNumberFrom1toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        // Prompt for the upper limit
		        System.out.print("Enter a number (n): ");
		        int n = scanner.nextInt();

		        System.out.println("Prime numbers from 1 to " + n + " are:");
		        for (int i = 2; i <= n; i++) {
		            if (isPrime(i)) {
		                System.out.print(i + " ");
		            }
		        }

		        // Close the scanner to avoid resource leaks
		        scanner.close();
		    }

		    // Method to check if a number is prime
		    public static boolean isPrime(int number) {
		        if (number < 2) {
		            return false; // 0 and 1 are not prime numbers
		        }
		        for (int i = 2; i <= Math.sqrt(number); i++) {
		            if (number % i == 0) {
		                return false; // Not a prime number
		            }
		        }
		        return true; // It's a prime number
	
	}

}
