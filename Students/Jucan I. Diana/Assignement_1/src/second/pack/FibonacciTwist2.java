package second.pack;
/**
 * .
 * 
 * @author D
 *
 */
public final class FibonacciTwist2 {
	/**
	 * .
	 * 
	 * @param args
	 * param args are not used.
	 */
	public static void main(final String[] args) {
		long sum = 2;
		int n3 = generateNextFiboNumber(2);
		int position = 2;
		while (n3 <= 4000000) {
			if (n3 % 2 == 0) {
				sum += n3;
			}
			n3 = generateNextFiboNumber(position);
			position++;
		}
		System.out.println("The sum is:");
		System.out.println(sum);
	}

	/**
	 * .
	 */
	public static int generateNextFiboNumber(final int index) {
		int[][] fibonacciMatrix = { { 1, 1 }, { 1, 0 } };
		 matrixExponetial(fibonacciMatrix , index - 1);
		 return fibonacciMatrix[0][0];
	}
	/**
	 * .
	 * @param fibonacciMatrix
	 * @param index
	 */
	public static void matrixExponetial(final int[][] fibonacciMatrix, final int index) {
		int[][] matrix = {{1, 1}, {1, 0}};
		if (index != 0 && index != 1) {
			matrixExponetial(fibonacciMatrix, index / 2);
			multiplyMatrices(fibonacciMatrix, fibonacciMatrix);
			if (index % 2 != 0) {
				multiplyMatrices(fibonacciMatrix, matrix);
			}
		}
	}

	/**
	 * 
	 */
	
	public static void multiplyMatrices(final int[][] matrixA , final int[][] matrixB) {
		int a11 = matrixA[0][0] * matrixB[0][0] + matrixA[0][1] * matrixB[1][0];
		int a12 = matrixA[0][0] * matrixB[0][1] + matrixA[0][1] * matrixB[1][1];
		int a21 = matrixA[1][0] * matrixB[0][0] + matrixA[1][1] * matrixB[1][0];
		int a22 = matrixA[1][0] * matrixB[0][1] + matrixA[1][1] * matrixB[1][1];
		matrixA [0][0] = a11;
		matrixA [0][1] = a12;
		matrixA [1][0] = a21;
		matrixA [1][1] = a22;
	}
	
}