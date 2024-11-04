package HelloWorld;
import java.util.Scanner;
public class NeolNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        // Prompt for input
		        System.out.print("Enter a number: ");
		        int number = scanner.nextInt();

		        // Check if the number is a Neon number
		        if (isNeon(number)) {
		            System.out.println(number + " is a Neon number.");
		        } else {
		            System.out.println(number + " is not a Neon number.");
		        }

		        // Close the scanner to avoid resource leaks
		        scanner.close();
		    }

		    // Method to check if a number is a Neon number
		    public static boolean isNeon(int number) {
		        int square = number * number; // Calculate the square of the number
		        int sumOfDigits = sumOfDigits(square); // Get the sum of the digits of the square
		        return sumOfDigits == number; // Check if the sum of the digits equals the original number
		    }

		    // Method to calculate the sum of digits of a number
		    public static int sumOfDigits(int num) {
		        int sum = 0;
		        while (num > 0) {
		            sum += num % 10; // Add the last digit to the sum
		            num /= 10; // Remove the last digit
		        }
		        return sum;
	}

}
