import java.util.Scanner;
/**
 * 
 * @author Ion
 * Implements the computation of the sum of multiples of two numbers.
 * In order to use it call the methods original, twist1 and twist2.
 *
 */
public class SumOfMultiples {
	
	/**
	 * Basic constructor.
	 * @param a - first number;
	 * @param b - second number;
	 */
	SumOfMultiples(final int a, final int b) {
		firstPrime = a;
		secondPrime = b;
	};
	
	/**
	 * firstPrime - container for the first number.
	 */
	private int firstPrime;
	/**
	 * secondPrime - container for the second number.
	 */
	private int secondPrime;
	
	/**
	 * A method for computing the sum of multiples of the two numbers.
	 * @param n - the upper limit for the number of terms;
	 * @return the sum of multiples;
	 */
	private int sumOfMult(final int n) {
		int sum = 0, i;
		for (i = 0; i < n; i += firstPrime) {
			sum += i;
		}
		for (i = 0; i < n; i += secondPrime) {
			if (i % firstPrime != 0) {
				sum += i;
			}
		}
		return sum;
	}
	
	/**
	 * A method for computing the sum of multiples of the two numbers.
	 * @param n - the upper limit for the terms;
	 * @return the sum of multiples;
	 */
	private long sumOfMult(final long n) {
		long sum = 0, term;
		term = n;
		while (term % 3 != 0) {
			term--;
		}
		sum += term * ((term / 3) + 1) / 2;
		term = n;
		while (term % 5 != 0) {
			term--;
		}
		sum += term * ((term / 5) + 1) / 2;
		term = n;
		while (term % 15 != 0) {
			term--;
		}
		sum -= term * ((term / 15) + 1) / 2;
		return sum;
	}
	
	/**
	 * The original request.
	 * @return the sum of multiples going up to 1000;
	 */
	public final int original() {
		return sumOfMult(1000);
	}
	
	/**
	 * Twist 1.
	 * @return sum of multiples going up to the input of the user;
	 */
	public final int twist1() {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Give an upper limit:");
		n = s.nextInt();
		s.close();
		return sumOfMult(n);
	}
	
	/**
	 * Twist 2.
	 */
	public final void twist2() {
		// INT
		int i = 0, sum = 0;
		while (sum > -1) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
			i++;
		}
		i--;
		System.out.print("The value at which the overflow occurs "
				+ "for integers is ");
		System.out.print(i);
		System.out.println();
		
		// LONG
		long summ = 0;
		long left = 0, right = Long.MAX_VALUE;
		long mid = 1;
		while (right - left > 1) {
			mid = left / 2 + right / 2;
			summ = sumOfMult(mid);
			if (summ > -1) {
				left = mid;
			} else {
				right = mid;
			}
		}
		
		System.out.print("The value at which the overflow occurs "
				+ "for long integers is ");
		System.out.print(mid);
		System.out.println();
	}
	
}
