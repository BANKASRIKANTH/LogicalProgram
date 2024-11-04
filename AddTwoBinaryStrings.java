package HelloWorld;
import java.util.Scanner;

public class AddTwoBinaryStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        // Prompt for the first binary string
		        System.out.print("Enter the first binary string: ");
		        String binary1 = scanner.nextLine();

		        // Prompt for the second binary string
		        System.out.print("Enter the second binary string: ");
		        String binary2 = scanner.nextLine();

		        // Perform the addition of binary strings
		        String result = addBinary(binary1, binary2);

		        // Display the result
		        System.out.println("The sum of the two binary strings is: " + result);

		        // Close the scanner to avoid resource leaks
		        scanner.close();
		    }

		    // Method to add two binary strings
		    public static String addBinary(String a, String b) {
		        StringBuilder result = new StringBuilder();
		        int carry = 0;

		        int i = a.length() - 1;
		        int j = b.length() - 1;

		        while (i >= 0 || j >= 0 || carry != 0) {
		            int sum = carry;

		            if (i >= 0) {
		                sum += a.charAt(i) - '0'; // Convert char to int
		                i--;
		            }

		            if (j >= 0) {
		                sum += b.charAt(j) - '0'; // Convert char to int
		                j--;
		            }

		            result.append(sum % 2); // Append the binary digit
		            carry = sum / 2; // Calculate carry
		        }

		        return result.reverse().toString(); // Reverse the result
	}

}
