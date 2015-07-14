import java.util.Scanner;

public class Twist {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the upLimit: ");
		int upLimit = userInput.nextInt();
		int sum = 0;
		for (int number = 3; number < upLimit; number++) {
			if ((number % 3 == 0) || (number % 5 == 0)) {
				sum += number;
			}

		}
		System.out.println("The required sum is: " + sum);
	}
}
