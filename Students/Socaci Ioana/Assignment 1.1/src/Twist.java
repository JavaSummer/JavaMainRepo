import java.util.Scanner;

public class Twist {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		System.out.println("Enter the upLimit: ");

		int upLimit = userInput.nextInt();
		int multipleOfThree, multipleOfFive, multipleOfFifteen;
		int sum;

		multipleOfThree = (upLimit - 1) / 3;//the number of multiples of 3 below the upLimit
		multipleOfFive = (upLimit - 1) / 5;
		multipleOfFifteen = (upLimit - 1) / 15;
	
		sum = 3 * calculateSum(multipleOfThree) + 5 * calculateSum(multipleOfFive)
				- 15 * calculateSum(multipleOfFifteen);

		System.out.println("The required sum is: " + sum);
	}

	public static int calculateSum(int n) {
		return (n * (n + 1)) / 2;
	}
}
