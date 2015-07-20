package second.pack;
import java.util.Scanner;

/**
 * 
 * @author Diana
 *
 */

public final class FibonacciTwist1 {
	/**
	 *  Fibonacci calculator in O(n) time 
	 */
	
	private FibonacciTwist1() {
		
	}
	/**
	 * 
	 * @param args
	 *  the param args are not used
	 */
	public static void main(final String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		
		long n1 = 1, n2 = 2, n3 = 0, n;
		System.out.println("Enter the number of Fibonacci terms : ");
		n = sc.nextInt();
		System.out.println(n1);
		System.out.println(n2);
		
		for (int i = 3; i <= n; i++) {
			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
		}
		sc.close();
	}
}