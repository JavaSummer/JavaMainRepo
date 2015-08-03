package assig.matrix;

import java.math.BigDecimal;

public class MatrixOperations {
	// create an object of this class:
	private static MatrixOperations instance = new MatrixOperations();

	// make the constructor private so that this class cannot be instantiated
	private MatrixOperations() {
	}

	// Get the only object available
	public static MatrixOperations getInstance() {
		return instance;
	}

	public BigDecimal[][] add(BigDecimal[][] a, BigDecimal[][] b) {
		BigDecimal c[][];
		int rowsA = a.length;
		int colsA = a[0].length;
		int rowsB = b.length;
		int colsB = b[0].length;

		if ((rowsA == rowsB) && (colsA == colsB)) {
			c = new BigDecimal[rowsA][colsA];
			for (int i = 0; i < rowsA; i++)
				for (int j = 0; j < colsA; j++)
					c[i][j] = a[i][j].add(b[i][j]);
		} else {
			System.out.println("The matrices can not be added !");
			return null;
		}
		return c;
	}

	public BigDecimal[][] subtract(BigDecimal[][] a, BigDecimal[][] b) {
		BigDecimal c[][];
		int rowsA = a.length;
		int colsA = a[0].length;
		int rowsB = b.length;
		int colsB = b[0].length;

		if ((rowsA == rowsB) && (colsA == colsB)) {
			c = new BigDecimal[rowsA][colsA];
			for (int i = 0; i < rowsA; i++)
				for (int j = 0; j < colsA; j++)
					c[i][j] = a[i][j].subtract(b[i][j]);
		} else {
			System.out.println("The matrices can not be subtracted !");
			return null;
		}
		return c;
	}

	public BigDecimal[][] multiply(BigDecimal[][] a, BigDecimal[][] b) {
		BigDecimal c[][];
		int rowsA = a.length;
		int colsA = a[0].length;
		int rowsB = b.length;
		int colsB = b[0].length;

		if (colsA == rowsB) {
			BigDecimal temp = new BigDecimal(0.00);
			c = new BigDecimal[rowsA][colsB];
			for (int i = 0; i < rowsA; i++) {
				for (int j = 0; j < colsB; j++) {
					for (int k = 0; k < rowsB; k++) {
						temp = temp.add(a[i][k].multiply(b[k][j]));
					}
					c[i][j] = temp;
					temp = temp.subtract(temp);
				}
			}
		} else {
			System.out.println("The matrices can not be multiplied !");
			return null;
		}
		return c;
	}

	public BigDecimal[][] multiplyScalar(BigDecimal[][] a, BigDecimal d) {
		BigDecimal c[][];
		int rowsA = a.length;
		int colsA = a[0].length;
		c = new BigDecimal[rowsA][colsA];
		for (int i = 0; i < rowsA; i++)
			for (int j = 0; j < colsA; j++) {
				c[i][j] = d.multiply(a[i][j]);
			}
		return c;
	}

	public boolean areEqual(BigDecimal[][] a, BigDecimal[][] b) {
		if ((a.length == b.length) && (a[0].length == b[0].length)) {
			for (int i = 0; i < a.length; i++)
				for (int j = 0; j < a[0].length; j++)
					if (!a[i][j].equals(b[i][j]))
						return false;
			return true;
		} else
			return false;
	}

	public boolean isZeroMatrix(BigDecimal[][] a) {
		BigDecimal zero = new BigDecimal("0");
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[0].length; j++)
				if (a[i][j].compareTo(zero) != 0)
					return false;
		return true;
	}

	public boolean isIdentityMatrix(BigDecimal[][] a) {
		BigDecimal zero = new BigDecimal("0");
		BigDecimal one = new BigDecimal("1");
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[0].length; j++)
				if (i == j) {
					if (a[i][j].compareTo(one) != 0)
						return false;
				} else if (a[i][j].compareTo(zero) != 0)
					return false;
		return true;
	}

	public BigDecimal fillDegree(BigDecimal[][] a) {
		BigDecimal zero = new BigDecimal("0");
		int count = 0;
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[0].length; j++)
				if (a[i][j].compareTo(zero) == 0)
					count++;
		BigDecimal totalNr = new BigDecimal((a.length - 1) * (a[0].length - 1));
		BigDecimal zeroNr = new BigDecimal(count);
		if (count == 0) {
			BigDecimal one = new BigDecimal("1");
			return one;
		}
		return zeroNr.divide(totalNr);
	}

	public BigDecimal determinant(BigDecimal[][] a) {
		BigDecimal det = new BigDecimal("0.00");
		if (a.length == a[0].length)
			det = determinantRecursive(a);
		else {
			System.out.println("The determinant can not be calculated !");
			return null;
		}
		return det;
	}

	public BigDecimal determinantRecursive(BigDecimal[][] mat) {
		BigDecimal sum = new BigDecimal("0.00");
		if (mat.length == 1) {
			return (mat[0][0]);
		}
		if (mat.length == 2) {
			return (mat[0][0].multiply(mat[1][1]).subtract(mat[1][0].multiply(mat[0][1])));
		}
		for (int i = 0; i < mat.length; i++) { // finds determinant using
												// row-by-row expansion
			BigDecimal[][] smallerMat = new BigDecimal[mat.length - 1][mat.length - 1];
			// creates the smaller matrix from the expansion
			for (int a = 1; a < mat.length; a++) {
				for (int b = 0; b < mat.length; b++) {
					if (b < i) {
						smallerMat[a - 1][b] = mat[a][b];
					} else if (b > i) {
						smallerMat[a - 1][b - 1] = mat[a][b];
					}
				}
			}

			if (i % 2 == 0) { // sign changes based on i
				sum = sum.add(mat[0][i].multiply(determinantRecursive(smallerMat)));
			} else {
				sum = sum.add((mat[0][i].multiply(determinantRecursive(smallerMat))).negate());
			}
		}
		return (sum); // returns determinant value. once stack is finished,
						// returns final determinant.
	}
}
