/**
 * 
 * @author Alexa
 *
 */
public class Palindrome {

	public static void main(String[] args) {

		int product;
		int max = 0;
		for (int counter1 = 100; counter1 <= 999; counter1++) {
			for (int counter2 = 999; counter2 >= 100; counter2--) {
				product = counter1 * counter2;
				if (checkIfPalindrome(product)) {
					if (product > max) {
						max = product;
						System.out.println(product + " is palindrome");
						System.out.println(counter1 + " * " + counter2 + " = " + product);

					}
				}
			}
		}

		System.out.println("The largest of them all is " + max);

	}

	public static int reverseNumber(int number) {
		int reversedNo = 0;
		do {
			reversedNo = number % 10 + reversedNo * 10;
			number = number / 10;
		} while (number > 0);
		return reversedNo;
	}

	public static boolean checkIfPalindrome(int n) {

		if (n == reverseNumber(n)) {
			return true;
		} else {
			return false;
		}

	}
}

