import java.math.BigDecimal;

public class Functions {

	private static Functions obj = new Functions();

	private Functions() {

	}

	public static Functions getObject() {
		return obj;
	}
	
	

	public static void printMatrix(BigDecimal[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
	}

	public static BigDecimal[][] add(BigDecimal[][] matrix1, BigDecimal[][] matrix2) {
		// suppose the two matrices have the same order
		if (matrix1[0].length == matrix2[0].length && matrix1.length == matrix2.length) {
			BigDecimal[][] resultMatrix = new BigDecimal[matrix1.length][matrix1.length];
			for (int i = 0; i < matrix1.length; i++)
				for (int j = 0; j < matrix1[0].length; j++)
					resultMatrix[i][j] = matrix1[i][j].add(matrix2[i][j]);
			return resultMatrix;
		} else {
			System.out.println("Addition cannot be done");
			return null;
		}
	}

	public static BigDecimal[][] subtract(BigDecimal[][] matrix1, BigDecimal[][] matrix2) {
		if (matrix1[0].length == matrix2[0].length && matrix1.length == matrix2.length) {
			BigDecimal[][] resultMatrix = new BigDecimal[matrix1.length][matrix1.length];
			for (int i = 0; i < matrix1.length; i++)
				for (int j = 0; j < matrix1[0].length; j++) {
					resultMatrix[i][j] = matrix1[i][j].subtract(matrix2[i][j]);
				}

			return resultMatrix;
		} else {
			System.out.println("Subtraction cannot be done");
			return null;
		}
	}

	public static BigDecimal[][] multiplication(BigDecimal[][] matrix1, BigDecimal[][] matrix2) {

		if (matrix1[0].length == matrix2.length) {
			// the number of columns of first matrix equals the number of rows
			// of the second one
			BigDecimal[][] resultMatrix = new BigDecimal[matrix1.length][matrix2[0].length];
			BigDecimal sum = new BigDecimal("0");
			for (int i = 0; i < matrix1.length; i++)
				for (int j = 0; j < matrix1[0].length; j++) {
					for (int k = 0; k < matrix2.length; k++) {
						sum = sum.add(matrix1[i][k].multiply(matrix2[k][j]));
						resultMatrix[i][j] = sum;
					}
					sum = BigDecimal.ZERO;
				}
			return resultMatrix;
		} else {
			System.out.println("Multiplication cannot be done");
			return null;
		}

	}

	public static BigDecimal[][] multiplyWithScalar(BigDecimal[][] matrix, BigDecimal scalar) {
		BigDecimal nullElement = new BigDecimal("0");
		if (scalar.equals(nullElement) == false) {
			BigDecimal[][] resultMatrix = new BigDecimal[matrix.length][matrix[0].length];
			for (int i = 0; i < matrix.length; i++)
				for (int j = 0; j < matrix[0].length; j++) {
					resultMatrix[i][j] = matrix[i][j].multiply(scalar);
				}
			return resultMatrix;
		} else {
			System.out.println("Enter a scalar different from zero");
			return null;
		}
	}

	public static BigDecimal determinant(BigDecimal[][] matrix) {
		if (matrix.length == matrix[0].length) {
			BigDecimal det = new BigDecimal("0");
			if (matrix.length == 1)
				return matrix[0][0];// matrix has only one element
			else {
				for (int i = 0; i < matrix.length; i++) {
					// expand the determinant by the first column
					BigDecimal[][] auxilliaryMatrix = new BigDecimal[matrix.length - 1][matrix.length - 1];
					for (int j = 0; j < matrix.length; j++)
						for (int k = 1; k < matrix.length; k++) {
							if (j < i)
								auxilliaryMatrix[j][k - 1] = matrix[j][k];
							else if (j > i)
								auxilliaryMatrix[j - 1][k - 1] = matrix[j][k];
						}
					if (i % 2 == 0) {
						det = det.add(matrix[i][0].multiply(determinant(auxilliaryMatrix)));

					} else {
						det = det.subtract(matrix[i][0].multiply(determinant(auxilliaryMatrix)));

					}
				}
			}
			return det;
		} else {
			System.out.println("The determinant cannot be found");
			return null;
		}

	}

	public static Boolean areEqual(BigDecimal[][] matrix1, BigDecimal[][] matrix2) {
		if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length) {
			for (int i = 0; i < matrix1.length; i++)
				for (int j = 0; j < matrix1[0].length; j++)
					if (matrix1[i][j].equals(matrix2[i][j]) == false)
						return false;
			return true;
		} else {
			return false;
		}
	}

	public static Boolean isZeroMatrix(BigDecimal[][] matrix) {
		BigDecimal nullElement = new BigDecimal("0");
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[0].length; j++)
				if (matrix[i][j].equals(nullElement) == false)
					return false;
		return true;
	}

	public static Boolean isIdentityMatrix(BigDecimal[][] matrix) {
		if (matrix.length == matrix[0].length) {
			BigDecimal oneElement = new BigDecimal("1");
			BigDecimal nullElement = new BigDecimal("0");
			for (int i = 0; i < matrix.length; i++)
				for (int j = 0; j < matrix[0].length; j++)
					if ((i == j && matrix[i][j].equals(oneElement) == false)
							|| (i != j && matrix[i][j].equals(nullElement) == false)) {
						return false;
					}
			return true;
		} else {
			return false;
		}
	}

	public static BigDecimal fillDegree(BigDecimal[][] matrix) {
		BigDecimal numberOfNonzeroElements = new BigDecimal("0");
		BigDecimal degreeRequired = new BigDecimal("0");
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[0].length; j++)
				if (matrix[i][j].equals(new BigDecimal("0")) == true)
					numberOfNonzeroElements = numberOfNonzeroElements.add(BigDecimal.ONE);

		degreeRequired = numberOfNonzeroElements.divide(new BigDecimal(matrix.length * matrix[0].length))
				.multiply(new BigDecimal("100"));
		return degreeRequired;
	}

	
}
