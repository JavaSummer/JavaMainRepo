package assignment2_2;

import java.math.BigDecimal;
import java.util.Scanner;

public class TestMatrixOperations {
	static Scanner in;

	public static BigDecimal[][] readMatrix() {
		in = new Scanner(System.in);
		System.out.println("Give the number of rows and columns.");
		int m = in.nextInt();
		int n = in.nextInt();
		BigDecimal[][] a = new BigDecimal[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("a[%d][%d]=", i, j);
				a[i][j] = in.nextBigDecimal();
				System.out.println();
			}
		}
		return a;
	}

	public static void printMatrix(BigDecimal[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.printf("%f  ", a[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		BigDecimal[][] a = readMatrix();
		BigDecimal[][] b = readMatrix();
		System.out.println("a=");
		printMatrix(a);
		System.out.println("b=");
		printMatrix(b);
		System.out.println("Addition:");
		printMatrix(MatrixOperations.add(a, b));
		System.out.println("Multiplication");
		printMatrix(MatrixOperations.multiply(a, b));
		System.out.println("The two matrices are " + (MatrixOperations.isEqual(a, b) ? "equal." : "not equal."));
		System.out.println(MatrixOperations.isIdentityMatrix(a) ? "\"a\" is an identity matrix."
				: "\"a\" isn't an identity matrix.");
		System.out.println(MatrixOperations.isIdentityMatrix(b) ? "\"b\" is an identity matrix."
				: "\"b\" isn't an identity matrix.");
		System.out.println("\"a\" " + (MatrixOperations.isZeroMatrix(a) ? "is zero matrix." : "isn't zero matrix."));
		System.out.println("\"b\" " + (MatrixOperations.isZeroMatrix(b) ? "is zero matrix." : "isn't zero matrix."));
		System.out.println("The determinant of matrix \"a\" is " + MatrixOperations.determinant(a) + ".");
		System.out.println("The determinant of matrix \"b\" is " + MatrixOperations.determinant(b) + ".");
		System.out.println("The fill degree of the \"a\" matrix is "
				+ (MatrixOperations.fillDegree(a)).multiply(BigDecimal.TEN).multiply(BigDecimal.TEN) + "%.");
		System.out.println("The fill degree of the \"b\" matrix is "
				+ (MatrixOperations.fillDegree(b).multiply(BigDecimal.TEN).multiply(BigDecimal.TEN)) + "%.");
		System.out.println("Enter the scalar:");
		BigDecimal x = in.nextBigDecimal();
		System.out.println("Multiplication by scalar " + x + " with \"a\" is :");
		printMatrix(MatrixOperations.multiplyScalar(a, x));
		System.out.println("Multiplication by scalar " + x + " with \"b\" is ");
		printMatrix(MatrixOperations.multiplyScalar(b, x));
	}
}