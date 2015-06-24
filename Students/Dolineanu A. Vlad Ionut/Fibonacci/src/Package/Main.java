package Package;

import java.util.Scanner;

/**
 * 
 * @author Vlad Dolieanu
 *
 */
public final class Main {
	
	/**
	 * Hiding the constructor.
	 */
	
	private Main() {
		
	}
	
	/**
	 * 
	 * @param n - N
	 * @return - Sum of the even numbers in the Fibonacci sequence
	 */
	private static int fibonacci(final int n) {
		int sum = 0;
		int a = 0, b = 1, c;
		
		if (n == 0) {
			return 0;
		}
		//O(n) time complexity
		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
			
			if (b % 2 == 0) {
				sum += b;
			}
		}
		
		return sum;
	}
	
	/**
	 * 
	 * @param args - Arguments from the command line(not used).
	 */
	public static void main(final String[] args) {
		
		int n, sum;
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		
		sum = fibonacci(n);
		
		System.out.println(sum);
		in.close();
	}

}
