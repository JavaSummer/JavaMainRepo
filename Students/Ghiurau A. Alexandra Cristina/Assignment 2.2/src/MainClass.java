import java.math.BigDecimal;

public class MainClass {
	public static void main(String[] args) {

		BigDecimal[][] matrix = createMatrix(3, 3);
		BigDecimal[][] matrix2 = createMatrix(3, 3);

		MatrixOperations instance = new MatrixOperations();

		// I left the addition method static just to see the difference between
		// using a singleton pattern and not using one.
		System.out.println("The addition of the two matrixes is: ");
		instance.displayMatrix(MatrixOperations.add(matrix, matrix2));

		System.out.println("The subtraction of the two matrixes is: ");
		instance.displayMatrix(instance.subtract(matrix, matrix2));

		System.out.println("The multiplication of the two matrixes is: ");
		instance.displayMatrix(instance.multiply(matrix, matrix2));

		System.out.println("The multiplication of 1st matrix by a scalar is: ");
		instance.displayMatrix(instance.multiplyScalar(matrix, new BigDecimal(5)));
		
		System.out.println("The determinant of the matrix is");
		System.out.println(instance.computeDeterminant(matrix));

		System.out.println("Are the two matrixes equal? ");
		System.out.println(instance.areEqual(matrix, matrix2));

		System.out.println("Is the matrix ZERO? (all elements = 0) ");
		System.out.println(instance.isZeroMatrix(matrix));

		System.out.println("Is the matrix = the identity matrix ");
		System.out.println(instance.isIdentityMatrix(matrix));

		System.out.println("How many elements of the matrix are filled (nonzero elements)");
		System.out.println(instance.fillDegree(matrix));

	}

	public static BigDecimal[][] createMatrix(int m, int n) {
		BigDecimal[][] matrix = new BigDecimal[m][n];

		/*
		 * for(int i = 0; i< m; i++){ for(int j = 0; j< n; j++){ matrix[i][j] =
		 * new BigDecimal(10); } }
		 */
		matrix[0][0] = new BigDecimal(1);
		matrix[0][1] = new BigDecimal(5);
		matrix[0][2] = new BigDecimal(6);
		matrix[1][0] = new BigDecimal(9);
		matrix[1][1] = new BigDecimal(7);
		matrix[1][2] = new BigDecimal(8);
		matrix[2][0] = new BigDecimal(10);
		matrix[2][1] = new BigDecimal(3);
		matrix[2][2] = new BigDecimal(1);
		

		return matrix;
	}
}
