package first.pack;
import java.util.Scanner;

/**
 * 
 * @author Diana
 *
 */

public final class MultiplesTwist1 {
	/**
	 *   The sum of multiples of 3 or 5 below a number read from the keyboard.
	 */
	
	private MultiplesTwist1() {
		
	}
	/**
	 * 
	 * @param args
	 * the param args are not used
	 */
	public static void main(final String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int suma3, suma5, suma15;
		int total, n, number;
		
		System.out.println("Enter the number: ");
		number = sc.nextInt();
		
		if (number % 3 == 0) {
			n = number / 3 - 1;	
			}
		else {
			n = number / 3;
		}
		
		suma3 = 3 * n * (n + 1) / 2;
		System.out.println(suma3);     // I printed the sum
		//  of multiples of 3,5 and 15 to see when an error occurs
		
		if (number % 5 == 0) {
			n = number / 5 - 1;
		}
		
		else {
			n = number / 5;
		}
		
		suma5 = 5 * n * (n + 1) / 2;
		System.out.println(suma5);
		
		if (number % 15 == 0) {
			n = number / 15 - 1;
		}
		else {
			n = number / 15;
		}
		
		suma15 = 15 * n * (n + 1) / 2;
		System.out.println(suma15);
		
		total = suma3 + suma5 - suma15;
		System.out.println("The sum is:" + total);
		
		}	
	}
