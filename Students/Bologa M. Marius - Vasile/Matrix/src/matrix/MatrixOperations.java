package matrix;

import java.math.BigDecimal;

/**
 * 
 * @author Marius Bologa
 *
 */
public final class MatrixOperations {
	/**
	 * 
	 */
	private static MatrixOperations instance = null;

	/**
	*
	*/
	protected MatrixOperations() {
		// Exists only to defeat instantiation.
	}

	/**
	 * 
	 * @return Reference from the static getInstance() method.
	 */
	public static MatrixOperations getInstance() {
		if (instance == null) {
			instance = new MatrixOperations();
		}
		return instance;
	}

	/**
	 * 
	 * @param a
	 *            First BigDecimal[][] Matrix.
	 * @param b
	 *            Second BigDecimal[][] Matrix.
	 * @return Sum.
	 */
	public BigDecimal[][] add(final BigDecimal[][] a, final BigDecimal[][] b) {
		if (b.length != a.length || b[0].length != a[0].length) {
			System.out.println("Error! Wrong dimensions!");
		} else {

			BigDecimal[][] c = new BigDecimal[a.length][a[0].length];
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[0].length; j++) {
					c[i][j] = a[i][j].add(b[i][j]);
				}
			}

			return c;
		}
		return null;
	}

	/**
	 * 
	 * @param a
	 *            First BigDecimal[][] Matrix.
	 * @param b
	 *            Second BigDecimal[][] Matrix.
	 * @return Difference.
	 */
public BigDecimal[][] subtract(final BigDecimal[][] a, final BigDecimal[][] b) {

		if (b.length != a.length || b[0].length != a[0].length) {
			System.out.println("Error! Wrong dimensions!");
		} else {
			BigDecimal[][] c = new BigDecimal[a.length][a[0].length];
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[0].length; j++) {
					c[i][j] = a[i][j].subtract(b[i][j]);
				}
			}
			return c;
		}
		return null;
	}

	/**
	 * 
	 * @param a
	 *            First BigDecimal[][] Matrix.
	 * @param b
	 *            Second BigDecimal[][] Matrix.
	 * @return If are equal or not.
	 */
	public boolean areEqual(final BigDecimal[][] a, final BigDecimal[][] b) {
		if ((a.length == b.length) && (a[0].length == b[0].length)) {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[0].length; j++) {
					if (!a[i][j].equals(b[i][j])) {
						return false;
					}
				}
			}
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 
	 * @param a
	 *            First BigDecimal[][] Matrix.
	 * @param b
	 *            Second BigDecimal[][] Matrix.
	 * @return The product of them.
	 */
public BigDecimal[][] multiply(final BigDecimal[][] a, final BigDecimal[][] b) {
		if (a[0].length != b.length) {

			System.out.println("Error! Wrong dimensions!");
		} else {
			BigDecimal[][] c = new BigDecimal[a.length][b[0].length];
			for (int i = 0; i < c.length; i++) {
				for (int j = 0; j < c[0].length; j++) {
					BigDecimal aux = new BigDecimal(0);
					for (int k = 0; k < a[0].length; k++) {
						aux = aux.add(a[i][k].multiply(b[k][j]));
					}
					c[i][j] = aux;
				}
			}

			return c;
		}
		return null;
	}

	/**
	 * 
	 * @param a
	 *            BigDecimal[][] Matrix.
	 * @param key
	 *            A BigDecimal number.
	 * @return The product between the scalar and the matrix.
	 */
public BigDecimal[][] multiplyScalar(final BigDecimal[][] a, final BigDecimal key) {
		BigDecimal[][] newA = new BigDecimal[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				newA[i][j] = a[i][j].multiply(key);
			}
		}
		return newA;
	}

	/**
	 * 
	 * @param a
	 *            BigDecimal[][] Matrix.
	 * @return Calculates the determinant of a matrix.
	 */
	public BigDecimal determinant(final BigDecimal[][] a) {
		BigDecimal sum = new BigDecimal("0.00");
		BigDecimal aux = new BigDecimal("0.00");
		BigDecimal s = new BigDecimal("0.00");
		if (a.length == 1) {
			return (a[0][0]);
		}
		if (a.length != a[0].length) {
			System.out.println(" Sorry! It is not a square matrix. So:");
		} else {
			for (int i = 0; i < a.length; i++) {
		BigDecimal[][] smaller = new BigDecimal[a.length - 1][a.length - 1];
				for (int j = 1; j < a.length; j++) {
					for (int k = 0; k < a.length; k++) {
						if (k < i) {
							smaller[j - 1][k] = a[j][k];
						} else if (k > i) {
							smaller[j - 1][k - 1] = a[j][k];
						}
					}
				}
				if (i % 2 == 0) {
					s = BigDecimal.valueOf(1);
				} else {
					s = BigDecimal.valueOf(-1);
				}
				aux = s.multiply(a[0][i]).multiply(determinant(smaller));
				sum = sum.add(aux);
			}
		}
		return (sum);
	}

	/**
	 * 
	 * @param a
	 *            BigDecimal[][] Matrix.
	 * @return Checks if a matrix contains only 0s.
	 */

	public boolean isZeroMatrix(final BigDecimal[][] a) {
		BigDecimal z = new BigDecimal("0.00");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j].compareTo(z) != 0) {
					return false;
				}

			}
		}
		return true;
	}

	/**
	 * 
	 * @param a
	 *            BigDecimal[][] Matrix.
	 * @return Checks if a matrix is an identity matrix
	 */
	public boolean isIdentityMatrix(final BigDecimal[][] a) {
		BigDecimal z = new BigDecimal("0.00");
		BigDecimal one = new BigDecimal("1.00");
		if (a.length != a[0].length) {
			return false;
		} else {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[0].length; j++) {
					if (i == j) {
						if ((a[i][j].compareTo(one)) != 0) {
							return false;
						}
					} else {
						if (a[i][j].compareTo(z) != 0) {
							return false;
						}

					}
				}
			}
		}

		return true;

	}

	/**
	 * 
	 * @param a
	 *            BigDecimal[][] Matrix.
	 * @return Computes the % of the matrix which is filled (elements != 0).
	 */
	public BigDecimal fillDegree(final BigDecimal[][] a) {
		BigDecimal count = new BigDecimal("0.00");
		BigDecimal result = new BigDecimal("0.00");
		BigDecimal z = new BigDecimal("0.00");
		BigDecimal percent = new BigDecimal("100");
		BigDecimal one = new BigDecimal("1");
		BigDecimal total = new BigDecimal(a.length * a[0].length);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j].compareTo(z) != 0) {
					count = count.add(one);
				}
			}
		}
		result = count.divide(total);
		return result.multiply(percent);
	}
}