import java.math.BigDecimal;

public class MainClass {
	public static void main(String[] args) {

		BigDecimal[][] matrix = createMatrix(3, 3);
		BigDecimal[][] matrix2 = createMatrix(3, 3);

		MatrixOperations operations = MatrixOperations.getInstance();

		// I left the addition method static just to see the difference between
		// using a singleton pattern and not using one.
		System.out.println("The addition of the two matrixes is: ");
		operations.displayMatrix(operations.add(matrix, matrix2));

		System.out.println("The subtraction of the two matrixes is: ");
		operations.displayMatrix(operations.subtract(matrix, matrix2));

		System.out.println("The multiplication of the two matrixes is: ");
		operations.displayMatrix(operations.multiply(matrix, matrix2));

		System.out.println("The multiplication of 1st matrix by a scalar is: ");
		operations.displayMatrix(operations.multiplyScalar(matrix, new BigDecimal(5)));
		
		System.out.println("The determinant of the matrix is");
		System.out.println(operations.computeDeterminant(matrix));

		System.out.println("Are the two matrixes equal? ");
		System.out.println(operations.areEqual(matrix, matrix2));

		System.out.println("Is the matrix ZERO? (all elements = 0) ");
		System.out.println(operations.isZeroMatrix(matrix));

		System.out.println("Is the matrix = the identity matrix ");
		System.out.println(operations.isIdentityMatrix(matrix));

		System.out.println("How many elements of the matrix are filled (nonzero elements)");
		System.out.println(operations.fillDegree(matrix));
		
		//in order to compute the solutions of the system, the right-hand side must be set
		BigDecimal[] rightSide = new BigDecimal[3];
		rightSide[0] = new BigDecimal(10);
		rightSide[1] = new BigDecimal(20);
		rightSide[2] = new BigDecimal(10);
		
		 
		BigDecimal[] solutions = operations.solveEquations(matrix, rightSide);
		for(int i=0; i< solutions.length;i++){
			System.out.println(solutions[i] +"\t");
		}

	}

	public static BigDecimal[][] createMatrix(int m, int n) {
		BigDecimal[][] matrix = new BigDecimal[m][n];

		/*
		 * for(int i = 0; i< m; i++){ for(int j = 0; j< n; j++){ matrix[i][j] =
		 * new BigDecimal(10); } }
		 */
		matrix[0][0] = new BigDecimal(10);
		matrix[0][1] = new BigDecimal(20);
		matrix[0][2] = new BigDecimal(10);
		matrix[1][0] = new BigDecimal(10);
		matrix[1][1] = new BigDecimal(20);
		matrix[1][2] = new BigDecimal(3);
		matrix[2][0] = new BigDecimal(20);
		matrix[2][1] = new BigDecimal(10);
		matrix[2][2] = new BigDecimal(20);
		

		return matrix;
	}
}
