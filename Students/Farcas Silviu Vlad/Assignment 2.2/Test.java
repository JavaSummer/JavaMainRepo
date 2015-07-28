import java.math.BigDecimal;
import java.util.Scanner;
public class Test {

	public static int n;
	public static BigDecimal det;

	public static void main(String[] args) {
		System.out.println("Enter size of system");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		BigDecimal[][] A = new BigDecimal[n][n];
		BigDecimal[][] B = new BigDecimal[n][1];
		BigDecimal[][][] XX = new BigDecimal[n][n][n];
		int i, j, k;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				A[i][j] = in.nextBigDecimal();
			}
		}
		for (i = 0; i < n; i++) {
			B[i][0] = in.nextBigDecimal();
		}
		det = MatrixOperations.determinant(A);
		if (det != BigDecimal.ZERO) {
			for (k = 0; k < n; k++) {
				for (i = 0; i < n; i++) {
					for (j = 0; j < n; j++) {
						if (j == k) {
							XX[k][i][j] = B[i][0];
						} else {
							XX[k][i][j] = A[i][j];
						}
					}
				}
				System.out.println("X[" + k + "] is " + MatrixOperations.determinant(XX[k]).divide(det));
			}
		}
		else {
			
			/**
			 * to be continued...
			 */
			
		}
		in.close();

	}
}
