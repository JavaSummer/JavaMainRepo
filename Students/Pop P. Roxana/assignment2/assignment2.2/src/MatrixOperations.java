import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class MatrixOperations {
	
	//applying the singleton pattern
	static MatrixOperations obj = new MatrixOperations();
	
	private MatrixOperations(){
		
	}
	
	public static MatrixOperations getInstance(){
		return obj;
	}
	

	public static BigDecimal[][] add(BigDecimal[][] a, BigDecimal[][] b) {

		int length = a.length;
		int width = a[0].length;
		BigDecimal result[][] = new BigDecimal[length][width];

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < width; j++) {

				result[i][j] = a[i][j].add(b[i][j]);
			}
		}

		return result;
	}

	public static BigDecimal[][] subtract(BigDecimal[][] a, BigDecimal[][] b) {

		int length = a.length;
		int width = a[0].length;
		BigDecimal result[][] = new BigDecimal[length][width];

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < width; j++) {

				result[i][j] = a[i][j].subtract(b[i][j]);
			}
		}

		return result;
	}

	public static BigDecimal[][] multiply(BigDecimal[][] a, BigDecimal[][] b) {

		int length = a.length;
		int width = b[0].length;
		int n = b.length;
		try {
			BigDecimal result[][] = new BigDecimal[length][width];

			for (int i = 0; i < length; i++) {
				Arrays.fill(result[i], BigDecimal.ZERO);
			}

			for (int i = 0; i < length; i++) {
				for (int j = 0; j < width; j++) {
					for (int k = 0; k < n; k++)

						result[i][j] = result[i][j].add(a[i][k].multiply(b[k][j]));
				}
			}
			return result;
		} catch (Exception e) {
			System.out.println("The multiplication could not be performed");
			if (a[0].length != b.length) {
				System.out.println("The dimensions of the matrices are incorrect");
			} else {
				System.out.println("Cause: unknown");
			}
		}
		return null;
	}

	public static BigDecimal[][] multiplyScalar(BigDecimal[][] a, BigDecimal scalar) {

		int length = a.length;
		int width = a[0].length;
		BigDecimal result[][] = new BigDecimal[length][width];

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < width; j++) {

				result[i][j] = a[i][j].multiply(scalar);
			}
		}

		return result;
	}

	public static BigDecimal[][] getMinor(BigDecimal[][] mat, int i) {

		int size = mat.length;
		BigDecimal[][] result = new BigDecimal[size - 1][size - 1];

		for (int j = 0; j < i; j++) {
			for (int k = 1; k < size; k++) {

				result[j][k - 1] = mat[j][k];
			}
		}

		for (int j = i; j < size - 1; j++) {
			for (int k = 1; k < size; k++) {

				result[j][k - 1] = mat[j + 1][k];
			}
		}

		return result;
	}

	public static BigDecimal sign(int i) {

		return new BigDecimal((i % 2 == 0) ? 1 : -1);
	}

	public static BigDecimal determinant(BigDecimal[][] a) {

		int size = a.length;

		if (size == 1) {
			return a[0][0];
		}
		if (size == 2) {
			return (a[0][0].multiply(a[1][1])).subtract(a[0][1].multiply(a[1][0]));
		}
		BigDecimal result = BigDecimal.ZERO;

		for (int i = 0; i < size; i++) {
			result = result.add((a[i][0].multiply(determinant(getMinor(a, i)))).multiply(sign(i)));
		}
		return result;

	}

	public static boolean areEqual(BigDecimal[][] a, BigDecimal[][] b) {

		if (a.length != b.length || a[0].length != b[0].length)
			return false;
		int i = 0, j = 0;
		while (i < a.length) {
			while (j < a[0].length) {

				if (a[i][j].compareTo(b[i][j]) != 0) {
					return false;
				} else {
					j++;
				}
			}
			i++;
		}

		return true;
	}

	public static boolean isZeroMatrix(BigDecimal[][] a) {

		int i = 0, j = 0;
		while (i < a.length) {
			while (j < a[0].length) {

				if (a[i][j].compareTo(new BigDecimal(0)) != 0) {
					return false;
				} else {
					j++;
				}
			}
			i++;
		}

		return true;
	}

	public static boolean isIdentityMatrix(BigDecimal[][] a) {

		int i = 0, j = 0;
		while (i < a.length) {
			while (j < a[0].length) {
				if (i == j) {
					if (a[i][j].compareTo(new BigDecimal(1)) != 0) {
						return false;
					} else {
						j++;
					}
				} else {

					if (a[i][j].compareTo(new BigDecimal(0)) != 0) {
						return false;
					} else {
						j++;
					}
				}
			}
			i++;
		}

		return true;
	}

	public static BigDecimal fillDegree(BigDecimal[][] a) {

		BigDecimal sum = BigDecimal.ZERO;
		int i = 0;
		while (i < a.length) {
			int j = 0;
			while (j < a[0].length) {

				if (a[i][j].compareTo(new BigDecimal(0)) != 0) {
					sum = sum.add(new BigDecimal(1));
				}
				j++;
			}
			i++;
		}

		return sum.divide(new BigDecimal(a.length * a[0].length), 4, RoundingMode.CEILING);
	}
	
    public static void printMatrix(BigDecimal [][] matrix){
		
		int length = matrix.length;
		int width = matrix[0].length;
		
		for (int i=0; i<length;i++){
			for (int j = 0; j<width; j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
