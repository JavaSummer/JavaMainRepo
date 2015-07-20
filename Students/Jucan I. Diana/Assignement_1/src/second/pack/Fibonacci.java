package second.pack;

/**
 * 
 * @author Diana
 *
 */

public final class Fibonacci {
	/**
	 *  The sum of even-valued terms in the Fibonacci sequence
	 */
	
	private Fibonacci() {
		
	}
	/**
	 * 
	 * @param args
	 *  the param args are not used
	 */
	public static void main(final String[] args) { // O(n) time
		
		int n1 = 1, n2 = 2, n3 = 0, sum = 2;
		
		do {
			n3 = n1 + n2;
			if (n3 % 2 == 0)
				sum += n3;
			n1 = n2;
			n2 = n3;
		}
		while (n1 + n2 < 4000000);
		
		System.out.println("The sum of the even-valued terms is: " + sum);
	}
}