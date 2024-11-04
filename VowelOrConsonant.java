package HelloWorld;
import java.util.Scanner;
public class VowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        // Prompt for a character
		        System.out.print("Enter a character: ");
		        char ch = scanner.next().charAt(0);

		        // Check if the character is a vowel or consonant
		        if (Character.isLetter(ch)) { // Check if it's a letter
		            if (isVowel(ch)) {
		                System.out.println(ch + " is a vowel.");
		            } else {
		                System.out.println(ch + " is a consonant.");
		            }
		        } else {
		            System.out.println("Please enter a valid alphabetic character.");
		        }

		        // Close the scanner to avoid resource leaks
		        scanner.close();
		    }

		    // Method to check if a character is a vowel
		    public static boolean isVowel(char ch) {
		        ch = Character.toLowerCase(ch); // Convert to lowercase for comparison
		        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}

}
