package matrix;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner inputs = new Scanner(System.in);
		BigDecimal[][] result;

		// First matrix
		System.out.println("Enter the matrix dimension of the first matrix:");
		System.out.println("Number of rows:");
		int rowsA = inputs.nextInt();
		System.out.println("Number of columns:");
		int colsA = inputs.nextInt();
		BigDecimal[][] a = new BigDecimal[rowsA][colsA];
		System.out.println("Enter the elements of the first matrix:");
		for (int i = 0; i < rowsA; i++) {
			for (int j = 0; j < colsA; j++) {
				a[i][j] = inputs.nextBigDecimal();
			}
		}

		// Second matrix
		System.out.println("Enter the matrix dimension of the second matrix:");
		System.out.println("Number of rows:");
		int rowsB = inputs.nextInt();
		System.out.println("Number of columns:");
		int colsB = inputs.nextInt();
		BigDecimal[][] b = new BigDecimal[rowsB][colsB];
		System.out.println("Enter the elements of the second matrix:");
		for (int i = 0; i < rowsB; i++) {
			for (int j = 0; j < colsB; j++) {
				b[i][j] = inputs.nextBigDecimal();
			}
		}

		System.out.println("Your input (A):");
		for (int i = 0; i < rowsA; i++) {
			for (int j = 0; j < colsA; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("Your input (B):");
		for (int i = 0; i < rowsB; i++) {
			for (int j = 0; j < colsB; j++) {
				System.out.print(b[i][j] + "\t");
			}
			System.out.println();
		}

		int choice = 0;
		System.out.println("Choose an operation:");
		System.out.println("0. EXIT;");
		System.out.println("1. add: adds two matrices together;");
		System.out.println("2. subtract: subtracts the second matrix from the first;");
		System.out.println("3. multiply: multiplies the two matrices;");
		System.out.println("4. multiplyScalar: multiplies a matrix with a scalar;");
		System.out.println("5. determinant: calculates the determinant of a matrix;");
		System.out.println("6. areEqual: checks if two matrices are identical;");
		System.out.println("7. isZeroMatrix: checks if a matrix contains only 0s;");
		System.out.println("8. isIdentityMatrix: checks if a matrix is an identity matrix;");
		System.out.println("9. fillDegree: computes the % of the matrix which is filled (elements != 0);");
		System.out.println("Your choice:");
		choice = inputs.nextInt();
		while (choice != 0) {
			switch (choice) {
			case 1:
				if ((rowsA == rowsB) && (colsA == colsB)) {
					result = new BigDecimal[rowsA][colsA];
					System.out.println("a + b :");
					result = MatrixOperations.add(a, b);
					for (int i = 0; i < rowsA; i++) {
						for (int j = 0; j < colsA; j++) {
							System.out.print(result[i][j] + "\t");
						}
						System.out.println();
					}
				} else {
					System.out.println("The matrices cannot be added!");
				}
				break;
			case 2:
				if ((rowsA == rowsB) && (colsA == colsB)) {
					result = new BigDecimal[rowsA][colsA];
					System.out.println("a - b :");
					result = MatrixOperations.subtract(a, b);
					for (int i = 0; i < rowsA; i++) {
						for (int j = 0; j < rowsB; j++) {
							System.out.print(result[i][j] + "\t");
						}
						System.out.println();
					}
				} else {
					System.out.println("Cannot subtract!");
				}
				break;
			case 3:
				if (colsA == rowsB) {
					result = new BigDecimal[rowsA][colsB];
					System.out.println("a * b :");
					result = MatrixOperations.multiply(a, b);
					for (int i = 0; i < rowsA; i++) {
						for (int j = 0; j < colsB; j++) {
							System.out.print(result[i][j] + "\t");
						}
						System.out.println();
					}
				} else {
					System.out.println("Cannot multiply");
				}
				break;

			case 4:
				System.out.println("scalar * a = ");
				System.out.println("Enter a scalar:");
				BigDecimal scalar = inputs.nextBigDecimal();
				result = MatrixOperations.multiplyScalar(a, scalar);
				for (int i = 0; i < rowsA; i++) {
					for (int j = 0; j < colsA; j++) {
						System.out.print(result[i][j] + "\t");
					}
					System.out.println();
				}
				break;
			case 5:
				if ((rowsA == rowsB)) {
					System.out.println("|a| :");
					BigDecimal determinant = MatrixOperations.determinant(a);
					System.out.println(determinant);
				} else {
					System.out.println("Cannot compute the determinant.");
				}
				break;
			case 6:
				if ((rowsA == rowsB) && (colsA == colsB)) {
					System.out.println("a = b :");
					if (MatrixOperations.areEqual(a, b)) {
						System.out.println("Equal, they are!");
					} else {
						System.out.println("They are equal not!");
					}
				} else {
					System.out.println("Verify, cannot!");
				}
				break;
			case 7:
				System.out.println("a = 0 :");
				if (MatrixOperations.isZeroMatrix(a)) {
					System.out.println("Is ZERO.");
				} else {
					System.out.println("NOT ZERO.");
				}
				break;
			case 8:
				if ((rowsA == rowsB)) {
					System.out.println("a - identity matrix :");
					if (MatrixOperations.isIdentityMatrix(a)) {
						System.out.println("Identity matrix.");
					} else {
						System.out.println("Not the identity matrix.");
					}
				} else {
					System.out.println("Cannot verify.");
				}
				break;
			case 9:
				System.out.println("Fill Degree :");
				BigDecimal percent = new BigDecimal(a.length);
				percent = MatrixOperations.fillDegree(a);
				System.out.println(percent + "%");
				break;
			default:
				System.out.println("Invalid symbol!");
				break;
			}
			System.out.print("Your choice: ");
			choice = inputs.nextInt();
		}
		inputs.close();
	}
}