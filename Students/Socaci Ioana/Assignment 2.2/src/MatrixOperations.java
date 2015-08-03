import java.math.BigDecimal;

class MatrixOperations {
	public static void main(String[] args) {

		// perform all the operations on six matrices that I will define

		// square matrices
		BigDecimal[][] matrix1 = new BigDecimal[][] { { new BigDecimal("2"), new BigDecimal("3") },
				{ new BigDecimal("4"), new BigDecimal("5") } };
		BigDecimal[][] matrix2 = new BigDecimal[][] {
				{ new BigDecimal("2"), new BigDecimal("2"), new BigDecimal("2"), new BigDecimal("2") },
				{ new BigDecimal("2"), new BigDecimal("2"), new BigDecimal("2"), new BigDecimal("2") },
				{ new BigDecimal("2"), new BigDecimal("2"), new BigDecimal("2"), new BigDecimal("2") },
				{ new BigDecimal("2"), new BigDecimal("2"), new BigDecimal("2"), new BigDecimal("2") } };
		// non-square matrix
		BigDecimal[][] matrix3 = new BigDecimal[][] { { new BigDecimal("2"), new BigDecimal("2") },
				{ new BigDecimal("2"), new BigDecimal("2") }, { new BigDecimal("2"), new BigDecimal("2") },
				{ new BigDecimal("2"), new BigDecimal("2") }, { new BigDecimal("2"), new BigDecimal("2") } };

		// identity matrix
		BigDecimal[][] matrix4 = new BigDecimal[][] { { new BigDecimal("1"), new BigDecimal("0") },
				{ new BigDecimal("0"), new BigDecimal("1") } };

		// zero matrix
		BigDecimal[][] matrix5 = new BigDecimal[][] { { new BigDecimal("0"), new BigDecimal("0") },
				{ new BigDecimal("0"), new BigDecimal("0") } };

		// matrix equal with matrix1
		BigDecimal[][] matrix6 = new BigDecimal[][] { { new BigDecimal("2"), new BigDecimal("3") },
				{ new BigDecimal("4"), new BigDecimal("5") } };

		System.out.println("Determinant of matrix1: " + " " + Functions.determinant(matrix1));
		System.out.println("Determinant of matrix3: ");
		System.out.println(Functions.determinant(matrix3));
		System.out.println("Verify if matrix4 is identity matrix: " + Functions.isIdentityMatrix(matrix4));
		System.out.println("Verify if matrix4 is zero matrix: " + Functions.isZeroMatrix(matrix4));
		System.out.println("Verify if matrix5 is zero matrix: " + Functions.isZeroMatrix(matrix5));
		System.out.println("Verify if matrix6 is equal to matrix1: " + Functions.areEqual(matrix1, matrix6));
		System.out.println("Add matrix1 with matrix6: ");
		Functions.printMatrix(Functions.add(matrix1, matrix6));
		System.out.println("Subtract matrix1 with matrix2: ");
		if (Functions.subtract(matrix1, matrix2) != null)
			Functions.printMatrix(Functions.subtract(matrix1, matrix2));
		else
			System.out.println("");
		System.out.println("Subtract matrix6 with matrix4: ");
		if (Functions.subtract(matrix6, matrix4) != null)
			Functions.printMatrix(Functions.subtract(matrix6, matrix4));
		else
			System.out.println("");
		System.out.println("Multiply matrix6 with matrix6: ");
		if (Functions.multiplication(matrix6, matrix6) != null)
			Functions.printMatrix(Functions.multiplication(matrix6, matrix6));
		else
			System.out.println("");
		System.out.println("Multiplication with 10 of matrix6: ");
		Functions.printMatrix(Functions.multiplyWithScalar(matrix6, new BigDecimal("10")));
		System.out.println("Fill degree of matrix4(Identity matrix): " + Functions.fillDegree(matrix4) + "%");
	}

}
