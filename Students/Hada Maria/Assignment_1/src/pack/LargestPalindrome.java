package pack;

/**
 * 
 * @author Maria
 *
 */
public final class LargestPalindrome {

	/**
	 * 
	 */
	private LargestPalindrome() {
	}

	/**
	 * 
	 * @param number
	 *            to be checked
	 * @return 1 if nr palindrome, 0 otherwise
	 */
	public static int checkIfPalindrome(final long number) {
		long numberCopy = number;
		long digit = 0;
		long reversedNumber = 0;
		final int m = 10;

		while (numberCopy != 0) {
			digit = numberCopy % m;
			reversedNumber = reversedNumber * m + digit;
			numberCopy /= m;
		}

		if (number == reversedNumber) {
			return 1;
		} else {
			return 0;
		}
	}

	/**
	 * 
	 * @param args
	 *            no param
	 */
	public static void main(final String[] args) {

		final int lowerLimit3 = 100;
		final int lowerLimit4 = 1000;
		final int threeDigitLimit = 999;
		final int fourDigitLimit = 9999;
		int product3D = 0;
		int maxProduct3D = 0;
		long product4D = 0;
		long maxProduct4D = 0;

		// for 3-digit numbers
		for (int i = lowerLimit3; i <= threeDigitLimit; i++) {
			for (int j = lowerLimit3; j <= threeDigitLimit; j++) {
				product3D = i * j;
				if (checkIfPalindrome(product3D) == 1) {
					if (product3D >= maxProduct3D) {
						maxProduct3D = product3D;
					}
				}
			}
		}
		// for 4-digit numbers
		for (int i = lowerLimit4; i <= fourDigitLimit; i++) {
			for (int j = lowerLimit4; j <= fourDigitLimit; j++) {
				product4D = i * j;
				if (checkIfPalindrome(product4D) == 1) {
					if (product4D >= maxProduct4D) {
						maxProduct4D = product4D;
					}
				}
			}
		}
		System.out.print("The largest palindrome from 3-digit numbers is ");
		System.out.print(maxProduct3D);
		System.out.println();
		System.out.print("The largest palindrome from 4-digit numbers is ");
		System.out.print(maxProduct4D);
	}
}
