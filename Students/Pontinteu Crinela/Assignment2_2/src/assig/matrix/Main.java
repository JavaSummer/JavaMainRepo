package assig.matrix;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner diskScanner = new Scanner(new File("matrix.txt"));
		BigDecimal a[][];
		BigDecimal b[][];
		System.out.println("The matrix a is:");
		a = createMatrix(diskScanner);
		printMatrix(a);
		diskScanner.nextLine();
		diskScanner.nextLine();
		System.out.println();
		System.out.println("The matrix b is: ");
		b = createMatrix(diskScanner);
		printMatrix(b);
		System.out.println();

		BigDecimal c[][];
		MatrixOperations singleMatrixOperationsObject = MatrixOperations.getInstance();
		System.out.println("a+b: ");
		c = singleMatrixOperationsObject.add(a, b);
		if (c != null) {
			printMatrix(c);
		}
		System.out.println();

		System.out.println("a-b: ");
		c = singleMatrixOperationsObject.subtract(a, b);
		if (c != null) {
			printMatrix(c);
		}
		System.out.println();

		System.out.println("a*b: ");
		c = singleMatrixOperationsObject.multiply(a, b);
		if (c != null) {
			printMatrix(c);
		}
		System.out.println();

		diskScanner.nextLine();
		BigDecimal d = new BigDecimal("0");
		d = diskScanner.nextBigDecimal();
		System.out.println("a*" + d + ":");
		c = singleMatrixOperationsObject.multiplyScalar(a, d);
		printMatrix(c);
		System.out.println();

		System.out.println("The determinant of a: ");
		d = singleMatrixOperationsObject.determinant(a);
		String str = d.toPlainString();
		System.out.println(str);
		System.out.println();

		System.out.print("The matrices a and b ");
		System.out.println(singleMatrixOperationsObject.areEqual(a, b) ? "ARE equal" : "ARE NOT equal");
		System.out.println();

		System.out.print("The matrix a ");
		System.out.println(
				singleMatrixOperationsObject.isZeroMatrix(a) ? "IS the zero matrix" : "IS NOT the zero matrix");
		System.out.println();

		System.out.print("The matrix a ");
		System.out.println(singleMatrixOperationsObject.isIdentityMatrix(a) ? "IS the identity matrix"
				: "IS NOT the identity matrix");
		System.out.println();

		System.out.print("The fill degree of the matrix a is:");
		d = singleMatrixOperationsObject.fillDegree(a);
		str = d.toPlainString();
		System.out.println(str);

	}

	public static BigDecimal[][] createMatrix(Scanner diskScanner) {
		int rows = diskScanner.nextInt();
		int cols = diskScanner.nextInt();
		BigDecimal a[][] = new BigDecimal[rows][cols];
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < cols; j++)
				a[i][j] = diskScanner.nextBigDecimal();
		return a;
	}

	public static void printMatrix(BigDecimal[][] a) {
		int rows = a.length;
		int cols = a[0].length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				String str = a[i][j].toPlainString();
				System.out.print(str + " ");
			}
			System.out.println();

		}
	}

}
