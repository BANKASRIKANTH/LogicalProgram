package HelloWorld;
import java.util.Scanner;
public class MultiplyTwoFloatingPointNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        // Prompt for the first floating-point number
		        System.out.print("Enter the first floating-point number: ");
		        float number1 = scanner.nextFloat();

		        // Prompt for the second floating-point number
		        System.out.print("Enter the second floating-point number: ");
		        float number2 = scanner.nextFloat();

		        // Perform multiplication
		        float result = number1 * number2;

		        // Display the result
		        System.out.printf("The result of multiplying %.2f and %.2f is: %.2f%n", number1, number2, result);

		        // Close the scanner to avoid resource leaks
		        scanner.close();
	}

}
