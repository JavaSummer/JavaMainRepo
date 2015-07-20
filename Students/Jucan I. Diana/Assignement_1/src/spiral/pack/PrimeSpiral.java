package spiral.pack;
import java.util.Scanner;

/**
 * 
 * @author Diana
 *
 */

public final class PrimeSpiral {
	/**
	 *  
	 */
	
	private PrimeSpiral() {
		
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
		
		int[][] matrix = new int[n][n];
		int x = n * n;
		int m;
		if (n % 2 == 0) {
			m = n / 2;
		} else {
			m = (n - 1) / 2 - 1;
		}
		for (int i = 0; i <= m + 1; i++) {
			for (int j = n - 1 - i; j >= i; j--) {
				matrix[n - i - 1][j] = x--;
			}
			for (int j = n - i - 2; j >= i; j--) {
				matrix[j][i] = x--;
			}
			for (int j = i + 1; j <= n - i - 1; j++) {
				matrix[i][j] = x--;
			}
			for (int j = i + 1; j <= n - i - 2; j++) {
				matrix[j][n - i - 1] = x--;
			}	
		}
		sc.close();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			if (i == j || i + j + 1 == n) {
				diagonal++;
				if (isPrime(matrix[i][j]) == 1) {
					prim++;
				}
			}
		}
	}
	System.out.println("Prime numbers : " + prim);
	System.out.println("Diagonal numbers : " + diagonal);
	System.out.println("The ratio is: " + prim / diagonal * 100 + " %");
	
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
		if (n == 1 || n == 2) {
			logic = 0;
		}
		return logic;
	}
}