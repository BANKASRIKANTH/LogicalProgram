package HelloWorld;
import java.util.Scanner;

class ComplexNumber {
    private double real;
    private double imaginary;

    // Constructor
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public ComplexNumber add(ComplexNumber other) {
        double realPart = this.real + other.real;
        double imaginaryPart = this.imaginary + other.imaginary;
        return new ComplexNumber(realPart, imaginaryPart);
    }

    // Method to display a complex number
    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}

public class AddTwoComplexNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        // Input for the first complex number
		        System.out.print("Enter the real part of the first complex number: ");
		        double real1 = scanner.nextDouble();
		        System.out.print("Enter the imaginary part of the first complex number: ");
		        double imaginary1 = scanner.nextDouble();
		        ComplexNumber complex1 = new ComplexNumber(real1, imaginary1);

		        // Input for the second complex number
		        System.out.print("Enter the real part of the second complex number: ");
		        double real2 = scanner.nextDouble();
		        System.out.print("Enter the imaginary part of the second complex number: ");
		        double imaginary2 = scanner.nextDouble();
		        ComplexNumber complex2 = new ComplexNumber(real2, imaginary2);

		        // Adding the two complex numbers
		        ComplexNumber result = complex1.add(complex2);

		        // Displaying the result
		        System.out.println("The sum of the two complex numbers is: " + result);

		        // Close the scanner
		        scanner.close();
	}

}
