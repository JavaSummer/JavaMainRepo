import java.util.Scanner;

public class SumOfMultiples2 {

	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {

		int sum = 0;

		System.out.println("Please enter a number: ");
		int numberEntered = userInput.nextInt();

		for (int counter = 0; counter < numberEntered; counter++) {
			if (counter % 3 == 0 || counter % 5 == 0) {
				sum += counter;
			}
		}

		System.out.println("The sum of multiples of 3 or 5 below " + numberEntered + " is " + sum);
	}
}

/* Twist 2:
      - in the case of an integer variable, an overflow will occur for a number greater than
        2,147,483,647
      - in the case of a long variable, an overflow will occur for a number greater than
        Long.MAX_VALUE
*/