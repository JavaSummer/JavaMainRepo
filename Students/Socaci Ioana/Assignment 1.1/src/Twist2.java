import java.util.InputMismatchException;
import java.util.Scanner;

public class Twist2 {
	static Scanner userInput = new Scanner(System.in);
	static int upLimit;

	public static void main(String[] args) {

		System.out.println("Enter the upLimit: ");

		getUpLimit();// function used to detect an InputMismatchException error
		
		System.out.println("The integer variable for which an overflow can occur is: " + Integer.MAX_VALUE);
		System.out.println("The long variable for which an overflow can occur is: " + Long.MAX_VALUE);
		
		int sum;
		int multipleOfThree, multipleOfFive, multipleOfFifteen;
		
		multipleOfThree = (upLimit - 1) / 3;//the number of multiples of 3 below the upLimit
		multipleOfFive = (upLimit - 1) / 5;
		multipleOfFifteen = (upLimit - 1) / 15;
	
		sum = 3 * calculateSum(multipleOfThree) + 5 * calculateSum(multipleOfFive)
				- 15 * calculateSum(multipleOfFifteen);
		
		System.out.println("The required sum is: " + sum);

	}

	public static void getUpLimit() {
		try {
			upLimit = userInput.nextInt();
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		}
	}
	public static int calculateSum(int n) {
		return (n * (n + 1)) / 2;
	}

}
