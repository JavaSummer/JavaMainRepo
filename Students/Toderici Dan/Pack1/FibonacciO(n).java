package Pack1;

/**
 * . javadoc comment
 * 
 * @author T
 *
 */
public final class FibonacciTwist1 {

	/**
	 * . javadoc
	 * 
	 * @param args
	 */
	public static void main(final String[] args) {
		int sumofTerms = 2;
		int firstNumber = 1;
		int secondNumber = 2;
		int thirdNumber = 0;
		while (thirdNumber <= 4000000) {
			thirdNumber = firstNumber + secondNumber;
			if (thirdNumber <= 4000000 && thirdNumber % 2 == 0) {
				sumofTerms += thirdNumber;
			}
			firstNumber = secondNumber;
			secondNumber = thirdNumber;
		}
		System.out.println("The sum is:");
		System.out.println(sumofTerms);
	}

}
