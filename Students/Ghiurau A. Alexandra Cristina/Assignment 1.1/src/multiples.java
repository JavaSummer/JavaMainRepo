import java.util.Scanner;

public class multiples {
	public static void main(String[] args) {
		// without the twist
		int firstArray[] = new int[1000];
		int sum = 0;
		for (int counter = 0; counter < 1000; counter++) {
			firstArray[counter] = counter;
			if (firstArray[counter] % 3 == 0 || firstArray[counter] % 5 == 0) {
				sum += firstArray[counter];
			}
		}
		System.out.println("Sum = " + sum);

		// with the 1st twist && 2nd twist
		Scanner userInput = new Scanner(System.in);

		System.out.println("If you are using an integer make sure your number is less than " + Integer.MAX_VALUE);
		System.out.println("If you are using a long variable make sure your number is less than " + Long.MAX_VALUE);

		System.out.print("Enter length of second array ");

		int number = userInput.nextInt();

		int secondArray[] = new int[number];
		int sum2 = 0;
		for (int counter = 0; counter < secondArray.length; counter++) {
			secondArray[counter] = counter;
			if (secondArray[counter] % 3 == 0 || secondArray[counter] % 5 == 0) {
				sum2 += secondArray[counter];
			}
		}
		System.out.println("Sum = " + sum2);
		userInput.close();

	}
}
