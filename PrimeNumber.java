import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a positive integer: ");
		        int number = scanner.nextInt();

		        if (number <= 1) {
		            System.out.println(number + " is not a prime number.");
		            return;
		        }

		        boolean isPrime = true;

		        // Check for factors from 2 to the square root of the number
		        for (int i = 2; i <= Math.sqrt(number); i++) {
		            if (number % i == 0) {
		                isPrime = false;
		                break;
		            }
		        }

		        // Output the result
		        if (isPrime) {
		            System.out.println(number + " is a prime number.");
		        } else {
		            System.out.println(number + " is not a prime number.");
		        }

		        scanner.close();
		 
	}

}
