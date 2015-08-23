package assignment2_2;

import java.math.BigDecimal;

public class MatrixOperations {
	public MatrixOperations() {

	}

	public static BigDecimal[][] add(BigDecimal[][] a, BigDecimal[][] b) {
		int m = a.length;
		int n = a[0].length;
		BigDecimal[][] c = new BigDecimal[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				c[i][j] = a[i][j].add(b[i][j]);
			}
		}
		return c;
	}

	public static BigDecimal[][] subtract(BigDecimal[][] a, BigDecimal[][] b) {
		int m = a.length;
		int n = a[0].length;
		BigDecimal[][] c = new BigDecimal[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				c[i][j] = a[i][j].subtract(b[i][j]);
			}
		}
		return c;
	}

	public static BigDecimal[][] multiply(BigDecimal[][] a, BigDecimal[][] b) {
		int mA = a.length;
		int nA = a[0].length;
		int mB = b.length;
		int nB = b[0].length;
		if (nA != mB) {
			throw new RuntimeException("Illegal matrix dimensions!");
		}
		BigDecimal[][] c = new BigDecimal[mA][nB];
		for (int i = 0; i < mA; i++) {
			for (int j = 0; j < nB; j++) {
				c[i][j] = BigDecimal.ZERO;
			}
		}
		for (int i = 0; i < mA; i++) {
			for (int j = 0; j < nB; j++) {
				for (int k = 0; k < nA; k++) {
					c[i][j] = c[i][j].add(a[i][k].multiply(b[k][j]));
				}
			}
		}
		return c;
	}

	public static BigDecimal[][] multiplyScalar(BigDecimal[][] a, BigDecimal x) {
		int m = a.length;
		int n = a[0].length;
		BigDecimal[][] c = new BigDecimal[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				c[i][j] = BigDecimal.ZERO;
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				c[i][j] = c[i][j].add(a[i][j].multiply(x));
			}
		}
		return c;
	}

	public static BigDecimal determinant(BigDecimal[][] matrix) {
		BigDecimal s;
		BigDecimal sum = BigDecimal.ZERO;
		if (matrix.length == 1) {
			return matrix[0][0];
		}
		for (int i = 0; i < matrix.length; i++) {
			BigDecimal[][] smaller = new BigDecimal[matrix.length - 1][matrix.length - 1];
			for (int a = 1; a < matrix.length; a++) {
				for (int b = 0; b < matrix.length; b++) {
					if (b < i) {
						smaller[a - 1][b] = matrix[a][b];
					} else if (b > i) {
						smaller[a - 1][b - 1] = matrix[a][b];
					}
				}
			}
			if (i % 2 == 0) {
				s = BigDecimal.ONE;
			} else {
				s = BigDecimal.ZERO.subtract(BigDecimal.ONE);
			}
			sum = sum.add(s.multiply(matrix[0][i]).multiply(determinant(smaller)));
		}
		return sum;
	}

	public static boolean isEqual(BigDecimal[][] a, BigDecimal[][] b) {
		int mA = a.length;
		int nA = a[0].length;
		int mB = b.length;
		int nB = b[0].length;
		if (mA != mB || nA != nB) {
			return false;
		} else {
			for (int i = 0; i < mA; i++) {
				for (int j = 0; j < nA; j++) {
					if (a[i][j] != b[i][j]) {
						return false;
					}
				}
			}
			return true;
		}
	}

	public static boolean isZeroMatrix(BigDecimal[][] a) {
		int m = a.length;
		int n = a[0].length;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] != BigDecimal.ZERO) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean isIdentityMatrix(BigDecimal[][] a) {
		int m = a.length;
		int n = a[0].length;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (((i == j) && (a[i][j] != BigDecimal.ONE)) || ((i != j) && (a[i][j] != BigDecimal.ZERO))) {
					return false;
				}
			}
		}
		return true;
	}

	public static BigDecimal fillDegree(BigDecimal[][] a) {
		int m = a.length;
		int n = a[0].length;
		BigDecimal numberOfElements = BigDecimal.ZERO;
		BigDecimal numberOfNonZeroElements = BigDecimal.ZERO;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (!(a[i][j].equals(BigDecimal.ZERO))) {
					numberOfNonZeroElements = numberOfNonZeroElements.add(BigDecimal.ONE);
				}
				numberOfElements = numberOfElements.add(BigDecimal.ONE);
			}
		}
		if (numberOfNonZeroElements.equals(BigDecimal.ZERO)) {
			return BigDecimal.ZERO;
		} else {
			return numberOfNonZeroElements.divide(numberOfElements);
		}
	}
}
