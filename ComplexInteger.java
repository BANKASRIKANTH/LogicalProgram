package HelloWorld;
class Complex {
    private double real; // Real part
    private double imaginary; // Imaginary part

    // Constructor
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    // Method to display the complex number
    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}

		        Scanner scanner = new Scanner(System.in);

		        // Input for the first complex number
		        System.out.print("Enter the real part of the first complex number: ");
		        double real1 = scanner.nextDouble();
		        System.out.print("Enter the imaginary part of the first complex number: ");
		        double imaginary1 = scanner.nextDouble();
		        Complex complex1 = new Complex(real1, imaginary1);

		        // Input for the second complex number
		        System.out.print("Enter the real part of the second complex number: ");
		        double real2 = scanner.nextDouble();
		        System.out.print("Enter the imaginary part of the second complex number: ");
		        double imaginary2 = scanner.nextDouble();
		        Complex complex2 = new Complex(real2, imaginary2);

		        // Add the complex numbers
		        Complex result = complex1.add(complex2);

		        // Display the result
		        System.out.println("The sum of the two complex numbers is: " + result);

		        // Close the scanner to avoid resource leaks
		        scanner.close();
	}

}
