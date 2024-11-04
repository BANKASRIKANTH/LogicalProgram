package HelloWorld;
import java.util.Scanner;
public class NumberfromStandardInput {

	public static void main(String[] args) {
		        // Create a Scanner object to read input
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a number: ");
		        // Read the number from standard input
		        int number = scanner.nextInt();

		        // Display the entered number
		        System.out.println("You entered: " + number);

		        // Close the scanner to avoid resource leaks
		        scanner.close();
	}

}
