package sumOfMultiples;
import java.util.Scanner;

/**
 * 
 * @author Adina
 *
 */
public final class Sum {
	/**
	 * Computes the sum of all multiples of 5 or 3 below a given number.
	 */
	private Sum() { }

	/**
	 * 
	 * @param args 
	 */

	public static void main(final String[] args) { 
		
		System.out.println("The sum of all multiples of 5 or 3 below 1000 is:");
		int i;
		int sum = 0;
		for (i = 0; i < 1000; ++i) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;
				
			}
		}
		System.out.println(sum);

		
	}
	
}