package HelloWorld;
import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter an integer: ");
		        int number = scanner.nextInt();
		        int originalNumber = number;
		        int reversed = 0;

		        // Reverse the number
		        while (number != 0) {
		            int digit = number % 10;      // Get the last digit
		            reversed = reversed * 10 + digit; // Build the reversed number
		            number /= 10;                  // Remove the last digit
		        }

		        // Check if the original number and the reversed number are the same
		        if (originalNumber == reversed) {
		            System.out.println(originalNumber + " is a palindrome number.");
		        } else {
		            System.out.println(originalNumber + " is not a palindrome number.");
		        }

		        scanner.close();
	}

}
