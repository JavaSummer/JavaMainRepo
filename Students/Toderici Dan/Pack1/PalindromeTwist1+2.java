package Pack1;

/**
 * .
 * 
 * @author T
 *
 */
public final class PalindromTwist1 {

	/**
	 * .
	 * 
	 * @param args
	 */
	public static void main(final String[] args) {
		int palindromValue = 0, number1 = 0, number2 = 0;
		for (int i = 999; i >= 100; i--) {
			for (int j = 999; j >= 100; j--) {
				if (Palindrom(i * j)) {
					if (i * j > palindromValue) {
						palindromValue = i * j;
						number1 = i;
						number2 = j;
					}
				}
			}
		}
		System.out.println("The value of the maximum palindrom formed by multiplying to 3-digit numbers is:");
		System.out.println(palindromValue);
		System.out.println("It was formed by multiplying " + number1 + " with " + number2);
		/**
		 * Twist 2
		 */
	
		for (int i = 9999; i >= 1000; i--) {
			for (int j = 9999; j >= 1000; j--) {
				if (Palindrom(i * j)) {
					if(i*j>palindromValue)
					{
					palindromValue = i * j;
					number1 = i;
					number2 = j;
					}
				}
			}


		}
		System.out.println("The value of the maximum palindrom formed by multiplying to 4-digit numbers is:");
		System.out.println(palindromValue);
		System.out.println("It was formed by multiplying " + number1 + " with " + number2);

	}

	/**
	 * .
	 * @param a
	 * @return
	 */
	public static boolean Palindrom(int a) {
		String normalString = "" + a;
		String reverseString = new StringBuffer(normalString).reverse().toString();
		if (normalString.equals(reverseString)) {
			return true;
		}
		return false;
	}
}
