package Pack1;

/**
 * .
 * 
 * @author T
 *
 */
public final class FibonacciTwist2 {
	/**
	 * .
	 * 
	 * @param args
	 */
	public static void main(final String[] args) {
		long sumofTerms = 2;
		int thirdNumber = generateNextFiboNumber(2);
		int position = 2;
		while (thirdNumber <= 4000000) {
			if (thirdNumber % 2 == 0) {
				sumofTerms += thirdNumber;
			}
			thirdNumber = generateNextFiboNumber(position);
			position++;
		}
		System.out.println("The sum is:");
		System.out.println(sumofTerms);
	}

	/**
	 * .
	 */
	public static int generateNextFiboNumber( int index )  {
		int fibonacciMatrix [][] = { { 1, 1 }, { 1, 0 } };
		 matrixExponetial( fibonacciMatrix , index - 1 ) ;
		 return fibonacciMatrix[0][0];
	}
	/**
	 * .
	 * @param fibonacciMatrix
	 * @param index
	 */
	public static void matrixExponetial (int fibonacciMatrix [] [], int index) {
		int matrix [][] = {{1, 1}, {1, 0}};
		if (index != 0 && index != 1) {
			matrixExponetial (fibonacciMatrix, index / 2);
			multiplyMatrices (fibonacciMatrix, fibonacciMatrix);
			if (index % 2 != 0) {
				multiplyMatrices(fibonacciMatrix, matrix);
			}
		}
	}

	/**
	 * .
	 */
	
	public static void multiplyMatrices(int matrixA [][], int matrixB [][]) {
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
