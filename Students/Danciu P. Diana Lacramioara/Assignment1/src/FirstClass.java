import java.util.Scanner;

public class FirstClass {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		long number = in.nextLong();
		in.close();

		number--; // we compute sum below n.

		long sum = 0;
		long totalMulti = 0;

		// Check if number is more than or equal to 3 then compute sum of all
		// numbers divisible by 3 and add to sum.
		if (number >= 3) {
			totalMulti = number / 3;
			sum = sum + (totalMulti * (3 + totalMulti * 3)) / 2;
		}

		// Check if number is more than or equal to 5 then compute sum of all
		// numbers divisible by 5 and add to sum.
		if (number >= 5) {
			totalMulti = number / 5;
			sum = sum + (totalMulti * (5 + totalMulti * 5)) / 2;
		}

		// Check if number is more than or equal to 15 then compute sum of all
		// numbers divisible by 15 and subtract from sum.
		if (number >= 15) {
			totalMulti = number / 15;
			sum = sum - (totalMulti * (15 + totalMulti * 15)) / 2;
		}

		System.out.print("Sum of multiples of 3 and 5 are : ");
		System.out.println(sum);
	}
}