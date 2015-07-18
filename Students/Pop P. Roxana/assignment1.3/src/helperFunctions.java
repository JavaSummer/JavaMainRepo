
public class helperFunctions {

	public boolean isPalindrome(int number) {// function that determins if a
												// number is a palindrome

		String s = String.valueOf(number);
		StringBuffer buffer = new StringBuffer(s);
		buffer.reverse();
		return buffer.toString().equals(s);
	}

	public void method1(int nrOfDigits) {// there were supposed to be 2 methods

		int low = (int) Math.pow(10, nrOfDigits - 1);
		int high = (int) Math.pow(10, nrOfDigits) - 1;
		int i, j, nr1 = 0, nr2 = 0;// i and j give at each step the number i*j
									// which is checked for being a palindrome
		int maximumPalindrome = 0;

		for (i = high; i >= low; i--) {
			int jLowLimit = Math.max(low, (maximumPalindrome / i));// the limit of j can be recomputed at each
																	// step as there can't be a bigger palindrome
																	// for j<(the biggest palindrome so far)/i,
																	// as i decreases

			for (j = high; j >= jLowLimit; j--) {

				int product = i * j;
				if (isPalindrome(product)) {
					if (product > maximumPalindrome) {
						maximumPalindrome = product;
						nr1 = i;
						nr2 = j;// nr1 and nr2 are the numbers whose product is
								// the greatest palindrome
					}
				}
			}

		}
		System.out.println("The largest palindrome that can be expressed as the product of " + nrOfDigits
				+ "-digit numbers is " + maximumPalindrome + " that is, " + nr1 + "*" + nr2);
	}
}
