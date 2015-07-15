package mainpack;

/**
 * 
 * @author alexh
 *
 */
public final class LargestPalindrome {

	/**
	 * Constructor.
	 */
	private LargestPalindrome() {
	}
	/**
	 * 
	 * @param args 
	 */
	public static void main(final String[] args) {
		final int lowBound = 1;
		final int highBound = 8;
		for (int nDigits = lowBound; nDigits <= highBound; nDigits++) {
			solve(nDigits);
		}
		//Nice pattern for 1, 2, 4, 6, 8
	}
	
	/**
	 * 
	 * @param originalNumber 
	 * @return - true if the number is a pali
	 */
	public static boolean isPalindrome(final long originalNumber) {
		final int base = 10;
		
		long number = originalNumber;
		long reversedNumber = 0;
		while (number > 0) {
			reversedNumber *= base;
			reversedNumber += number % base;
			number /= base;
		}
		
		return originalNumber == reversedNumber;
	}
	
	/**
	 * 
	 * @param noOfDigits 
	 * @return - the largest palindrome that is the product of 2
	 * "noOfDigits" digit numbers and the numbers
	 */
	public static long[] getLargestPali(final int noOfDigits) {
		final int magicNumberBase = 10;
		
		// Ceil will be 999...9 noOfDigits times
		// which is 10^noOfDigits - 1
		// and floor will be 10^(noOfDigits - 1)
		long operandCeil;
		long operandFloor = 1;	
		for (int i = 0; i < noOfDigits - 1; i++) {
			operandFloor *= magicNumberBase;
		}
		operandCeil = operandFloor * magicNumberBase - 1;
		
		long largestPali = 0;
		long factor1 = 0;
		long factor2 = 0;
		boolean paliNotFound = true;
		for (long operand1 = operandCeil; operand1 >= operandFloor && paliNotFound; operand1--) {
			for (long operand2 = operand1; operand2 >= operandFloor && paliNotFound; operand2--) {
				long product = operand1 * operand2;
				if (isPalindrome(product)) {
					paliNotFound = false;
					largestPali = product;
					factor1 = operand1;
					factor2 = operand2;
				}
			}
		}
		
		long[] result = {largestPali, factor1, factor2};
		return result;
	}
	
	/**
	 * 
	 * @param noOfDigits 
	 * @param result 
	 */
	public static void printResult(final int noOfDigits, final long[] result) {
		System.out.println("The largest palindrome that is the product of two " 
				+ noOfDigits + " digit numbers is " + result[0]
				+ " which is " + result[1] + '*' + result[2] + '.');
	}
	
	/**
	 * 
	 * @param noOfDigits 
	 * used as to not use int[] in the main method
	 */
	public static void solve(final int noOfDigits) {
		long[] result = getLargestPali(noOfDigits);
		printResult(noOfDigits, result);
	}
}
