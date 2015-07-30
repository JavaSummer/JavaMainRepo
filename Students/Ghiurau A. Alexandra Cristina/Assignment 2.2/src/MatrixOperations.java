import java.math.BigDecimal;
import java.math.RoundingMode;

public class MatrixOperations {

	private static MatrixOperations instance = null;

	/**
	 * Exists only to defeat instantiation.
	 */
	private MatrixOperations() {
	}

	/**
	 * maintains a static reference to the lone singleton instance
	 * 
	 * @return - that reference from the static getInstance() method
	 */
	public static MatrixOperations getInstance() {
		if (instance == null) {
			instance = new MatrixOperations();
		}
		return instance;
	}

	/**
	 * static method in order to test the program without the 'instance'
	 * 
	 * @param a
	 *            - first matrix of type BigDecimal
	 * @param b
	 *            - second matrix of type BigDecimal
	 * @return the addition between the two matrices
	 */
	public BigDecimal[][] add(BigDecimal[][] a, BigDecimal[][] b) {
		int maxLength = Math.max(a.length, b.length);
		BigDecimal[][] result = new BigDecimal[maxLength][maxLength];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				result[i][j] = a[i][j].add(b[i][j]);
			}
		}
		return result;
	}

	/**
	 * 
	 * @param a
	 *            - first matrix of type BigDecimal
	 * @param b
	 *            - second matrix of type BigDecimal
	 * @return the difference between the two matrices
	 */
	public BigDecimal[][] subtract(BigDecimal[][] a, BigDecimal[][] b) {
		int maxLength = Math.max(a.length, b.length);
		BigDecimal[][] result = new BigDecimal[maxLength][maxLength];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				result[i][j] = a[i][j].subtract(b[i][j]);
			}
		}
		return result;
	}

	/**
	 * 
	 * @param a
	 *            - first matrix of type BigDecimal
	 * @param b
	 *            - second matrix of type BigDecimal
	 * @return the multiplication between the two matrices
	 */
	public BigDecimal[][] multiply(BigDecimal[][] a, BigDecimal[][] b) {
		int maxLength = Math.max(a.length, b.length);
		BigDecimal[][] result = new BigDecimal[maxLength][maxLength];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				result[i][j] = a[i][j].multiply(b[i][j]);
			}
		}
		return result;
	}

	/**
	 * 
	 * @param a
	 *            - matrix of type BigDecimal
	 * @param value
	 *            - the scalar by which the matrix is multiplied
	 * @return the matrix multiplied by the scalar
	 */
	public BigDecimal[][] multiplyScalar(BigDecimal[][] a, BigDecimal value) {
		BigDecimal[][] result = new BigDecimal[a.length][a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				result[i][j] = a[i][j].multiply(value);
			}
		}
		return result;
	}

	/**
	 * 
	 * @param a
	 *            - matrix of type BigDecimal
	 * @return the determinant of the matrix
	 */
	public BigDecimal computeDeterminant(BigDecimal[][] a) {

		BigDecimal result = new BigDecimal(0);
		BigDecimal sign = BigDecimal.valueOf(1);
		int p = 0;
		int q = 0;

		if (a.length == 1) {
			result = a[0][0];
		} else if (a.length == 2) {
			result = a[0][0].multiply(a[1][1]).subtract(a[1][0].multiply(a[0][1]));
		} else {
			// result = new BigDecimal(0);
			BigDecimal[][] b = new BigDecimal[a.length - 1][a.length - 1];
			for (int x = 0; x < a.length; x++) {
				p = 0;
				q = 0;
				for (int i = 1; i < a.length; i++) {
					for (int j = 0; j < a.length; j++) {
						if (j != x) {
							b[p][q++] = a[i][j];
							if (q % (a.length - 1) == 0) {
								p++;
								q = 0;
							}
						}
					}
				}
				result = result.add(a[0][x].multiply(computeDeterminant(b)).multiply(sign));
				sign = BigDecimal.valueOf(-1);
			}
		}
		return result;
	}

	public BigDecimal[][] copyMatrix(BigDecimal[][] a) {
		BigDecimal[][] result = new BigDecimal[a.length][a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				result[i][j] = a[i][j];
			}
		}
		return result;
	}

	public BigDecimal[][] changeColumn(BigDecimal[][] a, BigDecimal[] vector, int column) {
		BigDecimal[][] result = copyMatrix(a);
		for (int i = 0; i < a.length; i++) {
			result[i][column] = vector[i];
		}
		return result;
	}

	public BigDecimal[] solveEquations(BigDecimal[][] a, BigDecimal[] vector) {
		BigDecimal[] solution = new BigDecimal[a.length];

		BigDecimal det = computeDeterminant(a);
		BigDecimal det2;
		if (det.compareTo(BigDecimal.ZERO) != 0) {
			for (int j = 0; j < a.length; j++) {
				det2 = computeDeterminant(changeColumn(a, vector, j));
				// if I don't use some sort of approximation for decimal I can
				// get an Arithmetic Exception.
				// BigDecimal is complaining that it could an infinity decimal
				// places, and it still
				// wouldn't be able to give you an exact representation of the
				// number
				// However, if I supply a RoundingMode and a precision, then
				// it will be able to convert (e.g. 1.333333333-to-infinity to
				// something like 1.33)
				solution[j] = det2.divide(det, 2, RoundingMode.HALF_EVEN);
			}
		}
		return solution;
	}

	/**
	 * 
	 * @param a
	 *            - first matrix of type BigDecimal
	 * @param b
	 *            - second matrix of type BigDecimal
	 * @return true if the matrices are equal, false otherwise
	 */
	public boolean areEqual(BigDecimal[][] a, BigDecimal[][] b) {
		boolean areEqual = false;
		if (a.length != b.length) {
			return areEqual;
		} else {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a.length; j++) {
					if (a[i][j].compareTo(b[i][j]) == 0)
						areEqual = true;
				}
			}
		}
		return areEqual;
	}

	/**
	 * 
	 * @param a
	 *            - matrix of type BigDecimal
	 * @return true if the matrix is zero (all elements == 0), false otherwise
	 */
	public boolean isZeroMatrix(BigDecimal[][] a) {
		boolean isZero = false;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i][j].compareTo(BigDecimal.ZERO) != 0)
					isZero = false;
				else
					isZero = true;
			}
		}
		return isZero;
	}

	/**
	 * 
	 * @param a
	 *            - matrix of type BigDecimal
	 * @return true if the matrix is the identity matrix (has 1 on the 1st
	 *         diagonal, the rest of the elements = 0), false otherwise
	 */
	public boolean isIdentityMatrix(BigDecimal[][] a) {
		boolean isIdentityMatrix = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i][i].compareTo(BigDecimal.ONE) == 0)
				isIdentityMatrix = true;
		}
		return isIdentityMatrix;
	}

	/**
	 * 
	 * @param a
	 *            - matrix of type BigDecimal
	 * @return the number of filled elements (non zero elements)
	 */
	public BigDecimal fillDegree(BigDecimal[][] a) {
		BigDecimal counter = new BigDecimal(0);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i][j].compareTo(BigDecimal.ZERO) != 0) {
					// counter++;
					counter = counter.add(BigDecimal.ONE);
				}
			}
		}
		return counter;
	}

	/**
	 * 
	 * @param a
	 *            - matrix of type BigDecimal
	 */
	public void displayMatrix(BigDecimal[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(String.format("%s\t", a[i][j]));
			}
			System.out.println();
		}
	}

}
