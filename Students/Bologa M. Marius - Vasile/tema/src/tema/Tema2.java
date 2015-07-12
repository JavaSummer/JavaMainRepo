package tema;



/**
 * 
 * @author Marius Bologa
 *
 */

public final class Tema2 {
	/**
	 * 
	 */
	private Tema2() {

	}

	/**
	 * 
	 * @param n
	 *            N.
	 * @return - True if the number is palindrome or false if not.
	 */

	private static boolean palindrome(final int n) {
		int nAgain = n;
		int inv = 0;

		while (nAgain > 0) {
			inv = (inv * 10) + (nAgain % 10);
			nAgain /= 10;
		}

		return (inv == n);
	}
/**
 * 
 * @return The largest palindrome of 6 digits.
 */
	private static int largestPalindromeOf6Digits() {
		int palindrome = 0;


		for (int i = 999; i >= 100; i--) {
			for (int j = i; j >= 100; j--) {
				int product = i * j;

				if (palindrome(product)) {
					if (product > palindrome) {
						palindrome = product;
					}
				}
			}
		}

		return palindrome;
	}
	/**
	 * 
	 * @return The largest palindrome of 8 digits.
	 */
	private static int largestPalindromeOf8Digits() {
		int palindrome = 0;


		for (int i = 9999; i >= 1000; i--) {
			for (int j = i; j >= 1000; j--) {
				int product = i * j;

				if (palindrome(product)) {
					if (product > palindrome) {
						palindrome = product;
					}
				}
			}
		}

		return palindrome;
	}
/**
 * 
 * @param args Command line argmunents not used.
 */
	public static void main(final String[] args) {
	System.out.println("The largest palindrome of 6 digits is:");
	System.out.println(largestPalindromeOf6Digits());
	System.out.println("The largest palindrome of 8 digits  is:");
	System.out.println(largestPalindromeOf8Digits());

	}

}
