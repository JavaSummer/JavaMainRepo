import java.math.BigDecimal;

public class MatrixOperations {

	private static MatrixOperations singleton = new MatrixOperations();

	private MatrixOperations() {
	};

	public static MatrixOperations getInstance() {
		return singleton;
	}

	/**
	 * Advantages of singleton pattern
	 * 
	 * We can use singleton pattern instead of having multiple instances of a
	 * class which manages the state of a single resource. The singleton pattern
	 * ensures that there will be only one instance of the class at any given
	 * time. A common example for a singleton class is the one used for logging
	 * purposes where the whole application needs only one logger instance at
	 * any time.
	 */
	public static BigDecimal[][] add(BigDecimal[][] A, BigDecimal[][] B) {
		if (A.length != B.length || A[0].length != B[0].length) {
			System.out.println("Cannot add these matrices");
			return null;
		}
		BigDecimal[][] result = new BigDecimal[A.length][A[0].length];
		int i, j;
		for (i = 0; i < A.length; i++) {
			for (j = 0; j < A[0].length; j++) {
				result[i][j] = A[i][j].add(B[i][j]);
			}
		}
		return result;
	}

	public static BigDecimal[][] subtract(BigDecimal[][] A, BigDecimal[][] B) {
		if (A.length != B.length || A[0].length != B[0].length) {
			System.out.println("Cannot subtract these matrices");
			return null;
		}
		BigDecimal[][] result = new BigDecimal[A.length][A[0].length];
		int i, j;
		for (i = 0; i < A.length; i++) {
			for (j = 0; j < A[0].length; j++) {
				result[i][j] = A[i][j].subtract(B[i][j]);
			}
		}
		return result;
	}

	public static BigDecimal[][] multiply(BigDecimal[][] A, BigDecimal[][] B) {
		if (A[0].length != B.length) {
			System.out.println("Cannot multiply these matrices");
			return null;
		}
		BigDecimal[][] result = new BigDecimal[A.length][B[0].length];
		int i, j, k;
		for (i = 0; i < A.length; i++) {
			for (j = 0; j < B[0].length; j++) {
				result[i][j] = BigDecimal.ZERO;
				for (k = 0; k < A[0].length; k++) {
					result[i][j] = result[i][j].add(A[i][k].multiply(B[k][j]));
				}
			}
		}
		return result;

	}

	public static BigDecimal[][] multiplyScalar(BigDecimal[][] A, BigDecimal B) {
		BigDecimal[][] result = new BigDecimal[A.length][A[0].length];
		int i, j;
		for (i = 0; i < A.length; i++) {
			for (j = 0; j < A[0].length; j++) {
				result[i][j] = A[i][j].multiply(B);
			}
		}
		return result;
	}

	public static BigDecimal determinant(BigDecimal[][] A) {
		BigDecimal sum = BigDecimal.ZERO;
		BigDecimal s;
		if (A.length == 1) {
			return (A[0][0]);
		}
		for (int i = 0; i < A.length; i++) {
			BigDecimal[][] smaller = new BigDecimal[A.length - 1][A.length - 1];
			for (int a = 1; a < A.length; a++) {
				for (int b = 0; b < A.length; b++) {
					if (b < i) {
						smaller[a - 1][b] = A[a][b];
					} else if (b > i) {
						smaller[a - 1][b - 1] = A[a][b];
					}
				}
			}
			if (i % 2 == 0) {
				s = BigDecimal.ONE;
			} else {
				s = new BigDecimal("-1");
			}
			sum = sum.add(s.multiply(A[0][i].multiply(determinant(smaller))));
		}
		return (sum);
	}

	public static boolean areEqual(BigDecimal[][] A, BigDecimal[][] B) {
		int i, j;
		for (i = 0; i < A.length; i++) {
			for (j = 0; j < A[0].length; j++) {
				if ((A[i][j].compareTo(B[i][j])) != 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean isZeroMatrix(BigDecimal[][] A) {
		int i, j;
		for (i = 0; i < A.length; i++) {
			for (j = 0; j < A[0].length; j++) {
				if ((A[i][j].compareTo(BigDecimal.ZERO)) != 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean isIdentityMatrix(BigDecimal[][] A) {
		int i, j;
		for (i = 0; i < A.length; i++) {
			for (j = 0; j < A[0].length; j++) {
				if (i == j) {
					if ((A[i][j].compareTo(BigDecimal.ONE)) != 0) {
						return false;
					}
				} else {
					if ((A[i][j].compareTo(BigDecimal.ZERO)) != 0) {
						return false;
					}
				}
			}
		}
		return true;
	}

	public static BigDecimal fillDegree(BigDecimal[][] A) {
		double fill = 0;
		int i, j;
		for (i = 0; i < A.length; i++) {
			for (j = 0; j < A[0].length; j++) {
				if ((A[i][j].compareTo(BigDecimal.ZERO)) != 0) {
					fill++;
				}
			}
		}
		BigDecimal f = new BigDecimal(fill / (A.length * A[0].length));
		return f;
	}

}
