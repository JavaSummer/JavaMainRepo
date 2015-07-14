
public class Twist2 {
	/**
	 * 
	 * @param args
	 *            we calculate the sum knowing that after 3 positions there is
	 *            an even number
	 */
	public static void main(String[] args) {

		int n = 2, sumOfEven = 0;
		while (obtainFibNum(n) <= 4000000) {
			sumOfEven += obtainFibNum(n);
			n = n + 3;
		}
		System.out.println("Sum of the even-valued terms: " + sumOfEven);
	}

	/**
	 * 
	 * @param a
	 * @param b
	 *            function used to multiply two square matrices of dimension 2
	 */
	public static void multiplySquareMatrices(int a[][], int b[][]) {
		int x, y, z, w;
		x = a[0][0] * b[0][0] + a[0][1] * b[1][0];
		y = a[0][0] * b[0][1] + a[0][1] * b[1][1];
		z = a[1][0] * b[0][0] + a[1][1] * b[1][0];
		w = a[1][0] * b[0][1] + a[1][1] * b[1][1];

		a[0][0] = x;
		a[0][1] = y;
		a[1][0] = z;
		a[1][1] = w;

	}

	/**
	 * 
	 * @param n
	 *            to obtain the fibonacci numbers we use the matrix m[][] = {{1,
	 *            1}, {1, 0}} the element on position 00 in the matrix m ^ n is
	 *            the nth Fibonacci number
	 */
	public static int obtainFibNum(int n) {
		int fibonacciMatrix[][] = { { 1, 1 }, { 1, 0 } };
		int finalMatrix[][] = { { 1, 0 }, { 0, 1 } };// will keep the final
														// result: nth fib
														// number

		if (n == 1 || n == 2)
			return n;
		else {
			while (n > 0) {
				if (n % 2 == 1) {
					multiplySquareMatrices(finalMatrix, fibonacciMatrix);
				}
				n = n / 2;
				multiplySquareMatrices(fibonacciMatrix, fibonacciMatrix);
			}
		}

		return finalMatrix[0][0];
	}
}
