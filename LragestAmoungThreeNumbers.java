package HelloWorld;
import java.util.Scanner;
public class LragestAmoungThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        // Create a Scanner object to read input
		        Scanner scanner = new Scanner(System.in);

		        // Prompt for three numbers
		        System.out.print("Enter the first number: ");
		        int num1 = scanner.nextInt();

		        System.out.print("Enter the second number: ");
		        int num2 = scanner.nextInt();

		        System.out.print("Enter the third number: ");
		        int num3 = scanner.nextInt();

		        // Initialize largest with the first number
		        int largest = num1;

		        // Compare with the second number
		        if (num2 > largest) {
		            largest = num2;
		        }

		        // Compare with the third number
		        if (num3 > largest) {
		            largest = num3;
		        }

		        // Display the largest number
		        System.out.println("The largest number is: " + largest);

		        // Close the scanner to avoid resource leaks
		        scanner.close();
	}

}
