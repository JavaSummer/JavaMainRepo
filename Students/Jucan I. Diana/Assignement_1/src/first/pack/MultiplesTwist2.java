package first.pack;
import java.util.Scanner;

/**
 * 
 * @author Diana
 *
 */

public final class MultiplesTwist2 {
	/**
	 *  The sum of multiples of 3 or 5 below a number read from the keyboard.
	 */
	
	private MultiplesTwist2() {
		
	}
	/**
	 * 
	 * @param args
	 * the param args are not used
	 */
	public static void main(final String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long suma3, suma5, suma15; // An overflow occurs for an integer variable 
		long total, n, number;   // for a number > 80.265, so we take long numbers
		// for long variables, we can read a number > 1.000.000.000
		
		System.out.println("Enter the number: ");
		number = sc.nextInt();
		
	if (number % 3 == 0) {
			n = number / 3 - 1;	
			}
		else {
			n = number / 3;
		}
		
		suma3 = 3 * n * (n + 1) / 2;
		
		if (number % 5 == 0) {
			n = number / 5 - 1;
		}
		
		else {
			n = number / 5;
		}
		
		suma5 = 5 * n * (n + 1) / 2;
		
		if (number % 15 == 0) {
			n = number / 15 - 1;
		}
		else {
			n = number / 15;
		}
		
		suma15 = 15 * n * (n + 1) / 2;
		
		total = suma3 + suma5 - suma15;
		System.out.println("The sum is:" + total);
		System.out.println("An overflow occur for an integer variable for : " + Integer.MAX_VALUE);
		System.out.println("An overflow occur for a long variable for : " + Long.MAX_VALUE);
		sc.close();
		}	
	}
