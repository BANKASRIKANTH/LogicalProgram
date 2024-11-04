package HelloWorld;
import java.util.Scanner;
public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        // Prompt for the first number
		        System.out.print("Enter the first number: ");
		        int num1 = scanner.nextInt();

		        // Prompt for the second number
		        System.out.print("Enter the second number: ");
		        int num2 = scanner.nextInt();

		        // Display numbers before swapping
		        System.out.println("Before swapping: ");
		        System.out.println("First number: " + num1);
		        System.out.println("Second number: " + num2);

		        // Swap the numbers using a temporary variable
		        int temp = num1;
		        num1 = num2;
		        num2 = temp;

		        // Display numbers after swapping
		        System.out.println("After swapping: ");
		        System.out.println("First number: " + num1);
		        System.out.println("Second number: " + num2);

		        // Close the scanner to avoid resource leaks
		        scanner.close();
	}

}
