
public class FibonacciEvenSum {

	public static void main(String[] args) {
		int sumOfEven = 0;
		int N = 1;
		int fibNum;
		while ((fibNum = getTheNthFibNum(N)) <= 4000000) {
			if (fibNum % 2 == 0) {
				sumOfEven += fibNum;
			}
			N++;
		}
		System.out.println("Sum of the even-valued terms: " + sumOfEven);
	}

	/**
	 * 
	 * @param n
	 * @return function that determines the Nth Fibonacci term
	 */
	public static int getTheNthFibNum(int N) {
		if (N == 1 || N == 2)
			return N;
		else {
			return getTheNthFibNum(N - 1) + getTheNthFibNum(N - 2);
		}
	}
}
