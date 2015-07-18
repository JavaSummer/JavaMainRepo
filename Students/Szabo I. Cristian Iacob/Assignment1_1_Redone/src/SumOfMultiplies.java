import java.util.Scanner;

public class SumOfMultiplies {
	static Scanner keyInput = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Give a number: ");
		int number = keyInput.nextInt();
		addMultiplies(number);
		System.out.println("An overflow will occur for integers greater than " + Integer.MAX_VALUE
				+ " or longs greater than " + Long.MAX_VALUE);
	}

	public static void addMultiplies(int n) {

		int sum = 0;
		sum = 3 * ((n / 3) * (n / 3 + 1)) / 2 + 5 * ((n / 5 - 1) * (n / 5)) / 2 - 15 * ((n / 15) * (n / 15 + 1)) / 2;
		System.out.println("The sum of the multiplies of 3 and 5 below " + n + " is " + sum);
	}
}
