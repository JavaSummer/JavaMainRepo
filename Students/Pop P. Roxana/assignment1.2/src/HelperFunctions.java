
public class HelperFunctions {

	/// the recursive method
	public int fibonacciRec(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}
		return fibonacciRec(n - 1) + fibonacciRec(n - 2);
	}

	/// helper functions for computing the fibonacci terms using a matrix

	public int[][] matrixMultiplication(int a[][], int b[][]) {/// function that
																/// multiplies 2 matrices of size 2

		int result[][] = new int[2][2];

		result[0][0] = a[0][0] * b[0][0] + a[0][1] * b[1][0];
		result[0][1] = a[0][0] * b[0][1] + a[0][1] * b[1][1];
		result[1][0] = a[1][0] * b[0][0] + a[1][1] * b[1][0];
		result[1][1] = a[1][0] * b[0][1] + a[1][1] * b[1][1];

		return result;

	}

	public int[][] raiseToPower(int a[][], int n) {/// if i recall well, this is
													/// called binary
													/// exponentiation
		/// and i think it runs in logarithmic time

		int result[][] = new int[2][2];
		/// initializing the result matrix with the identity matrix
		result[0][0] = 1;
		result[0][1] = 0;
		result[1][0] = 0;
		result[1][1] = 1;

		/// computing result=a^n
		while (n > 0) {
			if (n % 2 == 0) {
				a = matrixMultiplication(a, a);/// a is squared
				n /= 2;
			} else {
				result = matrixMultiplication(result, a);
				n--;
			}
		}
		return result;
	}

	public int fibonacciWithMatrix(int n) {

		int a[][] = new int[2][2];/// this is a matrix that appears in an
									/// identity that gives the n-th fibonacci
									/// term (when raised to power)
		a[0][0] = 1;
		a[0][1] = 1;
		a[1][0] = 1;
		a[1][1] = 0;

		int raisedMatrix[][] = new int[2][2];
		raisedMatrix = raiseToPower(a, n);/// usually the matrix is raised to
											/// n-1
											/// but up to now I've considered
											/// f1=1,f2=2... instead of
											/// f1=1,f2=1...
											// so, for continuity, I will
											/// generate the terms with the same
											/// index. Therefore, I raised it to
											/// n-1
		return raisedMatrix[0][0];
	}
}
