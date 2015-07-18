import java.util.Scanner;

public class multiples {
	public static void main(String[] args) {
		// without the twist
		int counter = 1000;
		
		int sum1 = 0;	
		sum1 = 3 * ((counter / 3) * (counter / 3 + 1)) / 2;
		
		int sum2 = 0;
		sum2 = 5 * ((counter / 5) * (counter / 5 - 1)) / 2;
		
		int sum3 = 0;
		sum3 = 15 * ((counter / 15) * (counter / 15 + 1)) / 2;
		
		int finalSum = sum1 + sum2 - sum3;
		System.out.println("FinalSum= " + finalSum);

		// with the 1st twist && 2nd twist
		Scanner userInput = new Scanner(System.in);

		System.out.println("If you are using an integer make sure your number is less than " + Integer.MAX_VALUE);
		System.out.println("If you are using a long variable make sure your number is less than " + Long.MAX_VALUE);

		System.out.print("Enter number ");

		int number = userInput.nextInt();
		
		sum1 = 0;	
		sum1 = 3 * ((number / 3) * (number / 3 + 1)) / 2;
		
	    sum2 = 0;
		sum2 = 5 * ((number / 5) * (number / 5 - 1)) / 2;
		
		sum3 = 0;
		sum3 = 15 * ((number / 15) * (number / 15 + 1)) / 2;
		
		finalSum = sum1 + sum2 - sum3;
		System.out.println("FinalSum= " + finalSum);
		
		userInput.close();

	}
}
