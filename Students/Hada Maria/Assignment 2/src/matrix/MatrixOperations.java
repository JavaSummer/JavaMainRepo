package matrix;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MatrixOperations {

	public static BigDecimal[][] add(BigDecimal[][] a, BigDecimal[][] b) {

		BigDecimal[][] sum = new BigDecimal[a.length][a[0].length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				sum[i][j] = a[i][j].add(b[i][j]);
			}
		}
		return sum;
	}

	public static BigDecimal[][] subtract(BigDecimal[][] a, BigDecimal[][] b) {

		BigDecimal[][] result = new BigDecimal[a.length][a[0].length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				result[i][j] = a[i][j].subtract(b[i][j]);
			}
		}
		return result;
	}

	public static BigDecimal[][] multiply(BigDecimal[][] a, BigDecimal[][] b) {
		BigDecimal[][] product = new BigDecimal[a.length][b[0].length];
		BigDecimal sum = BigDecimal.ZERO;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < product[0].length; j++) {
				for (int k = 0; k < b.length; k++) {
					sum = sum.add(a[i][k].multiply(b[k][j]));
				}
				product[i][j] = sum;
				sum = BigDecimal.ZERO;
			}
		}
		return product;
	}

	public static BigDecimal[][] multiplyScalar(BigDecimal[][] a, BigDecimal scalar) {
		BigDecimal[][] result = new BigDecimal[a.length][a[0].length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				result[i][j] = a[i][j].multiply(scalar);
			}
		}
		return result;
	}

	public static BigDecimal determinant(BigDecimal[][] a) {
		BigDecimal det = BigDecimal.ZERO;
		BigDecimal theSign = BigDecimal.ONE;

		if (a.length == 1) {
			det = a[0][0];
		} else {
			BigDecimal[][] b = new BigDecimal[a.length - 1][a.length - 1];
			for (int i = 0; i < a.length; i++) {
				int c = 0, d = 0;
				for (int j = 1; j < a.length; j++) {
					for (int k = 0; k < a.length; k++) {
						if (i != k) {
							b[c][d++] = a[j][k];
							if (d % (a.length - 1) == 0) {
								c++;
								d = 0;
							}
						}
					}
				}
				det = det.add((a[0][i].multiply(determinant(b))).multiply(theSign));
				theSign = theSign.negate();
			}
		}
		return det;
	}

	public static boolean areEqual(BigDecimal[][] a, BigDecimal[][] b) {
		boolean equalTheyAre = true;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j].equals(b[i][j]) == false) {
					equalTheyAre = false;
				}
			}
		}
		return equalTheyAre;
	}

	public static boolean isZeroMatrix(BigDecimal[][] a) {
		boolean isZero = true;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j].compareTo(BigDecimal.ZERO) != 0) {
					isZero = false;
				}
			}
		}
		return isZero;
	}

	public static boolean isIdentityMatrix(BigDecimal[][] a) {
		boolean identityMatrix = true;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i == j) {
					if (a[i][j].compareTo(BigDecimal.ONE) != 0) {
						identityMatrix = false;
					}
				} else {
					if (a[i][j].compareTo(BigDecimal.ZERO) != 0) {
						identityMatrix = false;
					}
				}
			}
		}
		return identityMatrix;
	}

	public static BigDecimal fillDegree(BigDecimal[][] a) {
		BigDecimal filled = BigDecimal.ZERO;
		BigDecimal total = BigDecimal.ZERO;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				total = total.add(BigDecimal.ONE);
				if (a[i][j].compareTo(BigDecimal.ZERO) != 0) {
					filled = filled.add(BigDecimal.ONE);
				}
			}
		}
		return filled.divide(total, 1, RoundingMode.HALF_UP).multiply(BigDecimal.valueOf(100));
	}
}