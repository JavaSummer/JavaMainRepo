import java.util.InputMismatchException;
import java.util.Scanner;

public class Twist2 {
	static Scanner userInput = new Scanner(System.in);
	static int upLimit;

	public static void main(String[] args) {

		System.out.println("Enter the upLimit: ");

		getUpLimit();// function used to detect an InputMismatchException error
		int sum = 0;
		System.out.println("The integer variable for which an overflow can occur is: " + Integer.MAX_VALUE);
		System.out.println("The long variable for which an overflow can occur is: " + Long.MAX_VALUE);
		for (int number = 3; number < upLimit; number++) {
			if ((number % 3 == 0) || (number % 5 == 0)) {
				sum += number;
			}

		}
		System.out.println("The required sum is: " + sum);

	}

	public static void getUpLimit() {
		try {
			upLimit = userInput.nextInt();
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		}
	}

}
