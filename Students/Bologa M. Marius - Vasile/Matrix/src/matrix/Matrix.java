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
		MatrixOperations singletonMatrixOperations = 
				MatrixOperations.getInstance();
		show(a);
		System.out.println();
		show(b);
		System.out.println("The sum of the 2 matrices is: ");
		c = singletonMatrixOperations.add(a, b);
		if (c != null) {
			show(c);
		}
		System.out.println();
		System.out.println("The difference of the 2 matrices is: ");
		c = singletonMatrixOperations.subtract(a, b);
		if (c != null) {
			show(c);
		}
		System.out.println();
		System.out.println("The product of the 2 matrices is: ");
		c = singletonMatrixOperations.multiply(a, b);
		if (c != null) {
			show(c);
		}
		System.out.println();
		BigDecimal numberA = new BigDecimal("10");
		System.out.println("The product of the first matrix with "
		+ numberA + " is:");
		c = singletonMatrixOperations.multiplyScalar(a, numberA);
		if (c != null) {
			show(c);
		}
		System.out.println();
		BigDecimal numberB = new BigDecimal("10");
		System.out.println("The product of the second matrix with "
		+ numberB + " is:");
		c = singletonMatrixOperations.multiplyScalar(b, numberB);
		if (c != null) {
			show(c);
		}
		System.out.println();
		System.out.println("The determinant of the matrix A is:");
		BigDecimal det = singletonMatrixOperations.determinant(a);
		String determinantA = det.setScale(
				5, BigDecimal.ROUND_CEILING).toString();
		//Takes only 5 digits after the point.
		System.out.println(determinantA);
		System.out.println();
		System.out.println("The determinant of the matrix B is: ");
		BigDecimal detB = singletonMatrixOperations.determinant(b);
		String determinantB = detB.setScale(
				5, BigDecimal.ROUND_CEILING).toString();
		//Takes only 5 digits after the point.
		System.out.println(determinantB);
		System.out.println();
		System.out.print("The matrices A and B are equal?");
		System.out.println();
		System.out.println(singletonMatrixOperations.areEqual(a, b) 
				? "Yes!" : "No!");
		System.out.println();
		System.out.print("Is A zero matrix? ");
		System.out.println();
		System.out.println(singletonMatrixOperations.isZeroMatrix(a) 
				? "Yes!" : "No!");
		System.out.println();
		System.out.print("Is B zero matrix? ");
		System.out.println();
		System.out.println(singletonMatrixOperations.isZeroMatrix(b) 
				? "Yes!" : "No!");
		System.out.println();
		System.out.print("Is A identity matrix? ");
		System.out.println();
		System.out.println(singletonMatrixOperations.isIdentityMatrix(a) 
				? "Yes!" : "No!");
		System.out.println();
		System.out.print("Is B identity matrix? ");
		System.out.println();
		System.out.println(singletonMatrixOperations.isIdentityMatrix(b) 
				? "Yes!" : "No!");
		System.out.println();

		System.out.print("The fill degree of the matrix A is:");
		BigDecimal fillDegreeA = singletonMatrixOperations.fillDegree(a);
		String degreeA = fillDegreeA.toString();
		System.out.println(degreeA + "%");
		System.out.print("The fill degree of the matrix B is:");
		BigDecimal fillDegreeB = singletonMatrixOperations.fillDegree(b);
		String degreeB = fillDegreeB.toString();
		System.out.println(degreeB + "%");

	}

}
/*Advantages: It is created only one instance(and there is no need for  more than one instance)
 *  of the class MatrixOperations and it can be accessed by different programs.
 */