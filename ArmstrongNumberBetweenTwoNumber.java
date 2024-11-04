package HelloWorld;
import java.util.Scanner;
public class ArmstrongNumberBetweenTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        // Prompt for the range
		        System.out.print("Enter the lower bound: ");
		        int lower = scanner.nextInt();
		        System.out.print("Enter the upper bound: ");
		        int upper = scanner.nextInt();

		        System.out.println("Armstrong numbers between " + lower + " and " + upper + " are:");
		        for (int number = lower; number <= upper; number++) {
		            if (isArmstrong(number)) {
		                System.out.print(number + " ");
		            }
		        }

		        // Close the scanner to avoid resource leaks
		        scanner.close();
		    }

		    // Method to check if a number is an Armstrong number
		    public static boolean isArmstrong(int number) {
		        int originalNumber = number;
		        int sum = 0;
		        int digits = String.valueOf(number).length();

		        while (number > 0) {
		            int digit = number % 10;
		            sum += Math.pow(digit, digits);
		            number /= 10;
		        }

		        return sum == originalNumber;
	}

}
