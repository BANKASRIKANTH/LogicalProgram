package HelloWorld;
import java.util.Scanner;
public class ReverseASstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a string: ");
		        String original = scanner.nextLine();

		        // Using StringBuilder to reverse the string
		        String reversed = new StringBuilder(original).reverse().toString();

		        System.out.println("Reversed string: " + reversed);

		        scanner.close();
	}

}
