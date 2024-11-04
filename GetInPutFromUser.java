package HelloWorld;
import java.util.Scanner;
public class GetInPutFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        // Prompt for the user's name
		        System.out.print("Enter your name: ");
		        String name = scanner.nextLine(); // Read a line of text

		        // Prompt for the user's age
		        System.out.print("Enter your age: ");
		        int age = scanner.nextInt(); // Read an integer

		        // Display the input back to the user
		        System.out.println("Hello, " + name + "! You are " + age + " years old.");

		        // Close the scanner to avoid resource leaks
		        scanner.close();
	}

}
