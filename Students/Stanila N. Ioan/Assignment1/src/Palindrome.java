
/**
 * 
 * @author Ion
 * A simple class for finding the largest palindrome obtained by multiplying
 * two numbers from some intervals.
 */
public class Palindrome {
	
	/**
	 * Basic constructor.
	 */
	Palindrome() { };
	
	/**
	 * Loops trough all the palindromes in the interval [100, 999].
	 * @return the largest palindrome.
	 */
	public final int threeDigits() {
		int pMax = 0, i, j, x;
		int start = 100;
		int finish = 999;
		for (i = start; i <= finish; i++) {
			for (j = start; j <= finish; j++) {
				x = i * j;
				if (isPalindrome(x)) {
					if (x > pMax) {
						pMax = x;
					}
				}
			}
		}
		return pMax;
	}
	
	/**
	 * Loops trough all the palindromes in the interval [1000, 9999].
	 * @return the largest palindrome.
	 */
	public final int fourDigits() {
		int pMax = 0, i, j, x;
		int start = 1000;
		int finish = 9999;
		for (i = start; i <= finish; i++) {
			for (j = start; j <= finish; j++) {
				x = i * j;
				if (isPalindrome(x)) {
					if (x > pMax) {
						pMax = x;
					}
				}
			}
		}
		return pMax;
	}
	
	/**
	 * Method to quicly verify if a number is palindrome.
	 * @param n - the number to verify.
	 * @return true if it is palindrome, false otherwise.
	 */
	private boolean isPalindrome(final int n) {
		int inv = 0, orig = n;
		while (orig != 0) {
			inv = inv * 10 + orig % 10;
			orig /= 10;
		}
		if (inv == n) {
			return true;
		}
		return false;
	}
}
