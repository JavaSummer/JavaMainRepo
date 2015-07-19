package spiral.pack;
import java.util.Scanner;

/**
 * 
 * @author Diana
 *
 */

public final class PrimeSpiral1 {
	/**
	 *  
	 */
	
	private PrimeSpiral1() {
		
	}
	/**
	 * 
	 * @param args
	 * the param args are not used
	 */
	public static void main(final String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		double diagonal = 0, prim = 0;
		System.out.println("Enter the side length: ");
		n = sc.nextInt();
		int x = n * n;
		int substracter = n - 1;

		while (x >= 1 && substracter >= 0) {
			if (substracter == 0) {
				diagonal++;
				if (isPrime(x) == 1) {
					prim++;
				}
			} else {
				for (int i = 1; i <= 4; i++) {
					diagonal++;
					if (isPrime(x) == 1) {
						prim++;
					}
					x = x - substracter;	
				}	
			}
			substracter = substracter - 2;
		}
		
	System.out.println("Prime numbers : " + prim);
	System.out.println("Diagonal numbers : " + diagonal);
	System.out.println("The ratio is: " + prim / diagonal * 100 + " %");
	sc.close();
	}
	/**
	 * 
	 * @param x is the number that we want to verify if is prime
	 * @return 1 if n is prime, and 0 if not
	 */
	public static int isPrime(final int x) {
		int logic = 1; 
		int n = x;
		for (int i = 2; i < n && logic == 1; i++) {
			if (n % i == 0) {
				logic = 0;
			}
		}
		if (n == 1 ) {
			logic = 0;
		}
		if (n == 2) {
			logic = 1;
		}
		return logic;
	}
}
