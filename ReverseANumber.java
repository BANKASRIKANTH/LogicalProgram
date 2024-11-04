package HelloWorld;
import java.util.Scanner;
public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter an integer: ");
		        int number = scanner.nextInt();
		        int reversed = 0;

		        // Reverse the number
		        while (number != 0) {
		            int digit = number % 10;      // Get the last digit
		            reversed = reversed * 10 + digit; // Build the reversed number
		            number /= 10;                  // Remove the last digit
		        }

		        System.out.println("Reversed number: " + reversed);
		        
		        scanner.close();
	}

}
