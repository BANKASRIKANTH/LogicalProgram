package HelloWorld;
import java.util.Scanner;
public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a string: ");
		        String original = scanner.nextLine();
		        
		        // Remove spaces and convert to lowercase
		        String cleaned = original.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		        String reversed = new StringBuilder(cleaned).reverse().toString();

		        // Check if the cleaned string is equal to its reverse
		        if (cleaned.equals(reversed)) {
		            System.out.println("\"" + original + "\" is a palindrome string.");
		        } else {
		            System.out.println("\"" + original + "\" is not a palindrome string.");
		        }

		        scanner.close();
	}

}
