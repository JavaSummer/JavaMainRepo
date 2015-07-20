package first.pack;

/**
 * 
 * @author Diana
 *
 */

public final class Multiples {
	/**
	 *   The sum of multiples of 3 or 5 below 1000.
	 */
	
	private Multiples() {
		
	}
	/**
	 * 
	 * @param args
	 * the param args are not used
	 */
	public static void main(final String[] args) {
		
		int suma3, suma5, suma15;
		int total, n;
		
        n = 999 / 3;
		suma3 = 3 * n * (n + 1) / 2;
		
		n = 999 / 5;
		suma5 = 5 * n * (n + 1) / 2;
		
		n = 999 / 15;
		suma15 = 15 * n * (n + 1) / 2;
		
		total = suma3 + suma5 - suma15;
		System.out.println("The sum is: " + total);
		
		}	
	}
