package HelloWorld;
import java.util.Scanner;
public class CheckEvenOrOddInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        // Prompt for an integer
		        System.out.print("Enter an integer: ");
		        int number = scanner.nextInt();

		        // Check if the number is even or odd
		        if (number % 2 == 0) {
		            System.out.println(number + " is an even number.");
		        } else {
		            System.out.println(number + " is an odd number.");
		        }

		        // Close the scanner to avoid resource leaks
		        scanner.close();
	}

}
