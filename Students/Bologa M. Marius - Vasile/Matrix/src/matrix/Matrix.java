package matrix;

import java.math.BigDecimal;

/**
 * 
 * @author Marius Bologa
 *
 */
public final class Matrix {
	/**
	 * 
	 */
	private Matrix() {
	}

	/**
	 * 
	 * @param a
	 *            BigDecimal[][] Matrix.
	 */
	public static void show(final BigDecimal[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.printf("%9.4f ", a[i][j]);
			}
			System.out.println();
		}
	}

	/**
	 * 
	 * @param rows
	 *            Number of rows.
	 * @param colums
	 *            Number of colums.
	 * @return A new matrix.
	 */
	public static BigDecimal[][] random(final int rows, final int colums) {
		BigDecimal[][] a = new BigDecimal[rows][colums];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = new BigDecimal(Math.random());
			}
		}
		return a;
	}

	/**
	 * 
	 * @param args
	 *            Not used.
	 */
	public static void main(final String[] args) {
		BigDecimal[][] a = random(2, 3);
		BigDecimal[][] b = random(2, 2);
		BigDecimal[][] c;
		show(a);
		System.out.println();
		show(b);
		System.out.println("The sum of the 2 matrices is: ");
		c = MatrixOperations.add(a, b);
		if (c != null) {
			show(c);
		}
		System.out.println();
		System.out.println("The difference of the 2 matrices is: ");
		c = MatrixOperations.subtract(a, b);
		if (c != null) {
			show(c);
		}
		System.out.println();
		System.out.println("The product of the 2 matrices is: ");
		c = MatrixOperations.multiply(a, b);
		if (c != null) {
			show(c);
		}
		System.out.println();
		BigDecimal numberA = new BigDecimal("10");
		System.out.println("The product of the first matrix with "
		+ numberA + " is:");
		c = MatrixOperations.multiplyScalar(a, numberA);
		if (c != null) {
			show(c);
		}
		System.out.println();
		BigDecimal numberB = new BigDecimal("10");
		System.out.println("The product of the second matrix with "
		+ numberB + " is:");
		c = MatrixOperations.multiplyScalar(b, numberB);
		if (c != null) {
			show(c);
		}
		System.out.println();
		System.out.println("The determinant of the matrix A is:");
		BigDecimal det = MatrixOperations.determinant(a);
		String determinantA = det.setScale(
				5, BigDecimal.ROUND_CEILING).toString();
		//Takes only 5 digits after the point.
		System.out.println(determinantA);
		System.out.println();
		System.out.println("The determinant of the matrix B is: ");
		BigDecimal detB = MatrixOperations.determinant(b);
		String determinantB = detB.setScale(
				5, BigDecimal.ROUND_CEILING).toString();
		//Takes only 5 digits after the point.
		System.out.println(determinantB);
		System.out.println();
		System.out.print("The matrices A and B are equal?");
		System.out.println();
		System.out.println(MatrixOperations.areEqual(a, b) 
				? "Yes!" : "No!");
		System.out.println();
		System.out.print("Is A zero matrix? ");
		System.out.println();
		System.out.println(MatrixOperations.isZeroMatrix(a) 
				? "Yes!" : "No!");
		System.out.println();
		System.out.print("Is B zero matrix? ");
		System.out.println();
		System.out.println(MatrixOperations.isZeroMatrix(b) 
				? "Yes!" : "No!");
		System.out.println();
		System.out.print("Is A identity matrix? ");
		System.out.println();
		System.out.println(MatrixOperations.isIdentityMatrix(a) 
				? "Yes!" : "No!");
		System.out.println();
		System.out.print("Is B identity matrix? ");
		System.out.println();
		System.out.println(MatrixOperations.isIdentityMatrix(b) 
				? "Yes!" : "No!");
		System.out.println();

		System.out.print("The fill degree of the matrix A is:");
		BigDecimal fillDegreeA = MatrixOperations.fillDegree(a);
		String degreeA = fillDegreeA.toString();
		System.out.println(degreeA + "%");
		System.out.print("The fill degree of the matrix B is:");
		BigDecimal fillDegreeB = MatrixOperations.fillDegree(b);
		String degreeB = fillDegreeB.toString();
		System.out.println(degreeB + "%");

	}

}