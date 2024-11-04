package HelloWorld;
import java.util.Scanner;
public class PrimitiveOfARectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        // Prompt for length and width
		        System.out.print("Enter the length of the rectangle: ");
		        double length = scanner.nextDouble();
		        System.out.print("Enter the width of the rectangle: ");
		        double width = scanner.nextDouble();

		        // Calculate perimeter
		        double perimeter = calculatePerimeter(length, width);

		        // Display the result
		        System.out.println("The perimeter of the rectangle is: " + perimeter);

		        // Close the scanner to avoid resource leaks
		        scanner.close();
		    }

		    // Method to calculate perimeter of a rectangle
		    public static double calculatePerimeter(double length, double width) {
		        return 2 * (length + width); // Perimeter formula

	}

}
