import java.math.BigDecimal;
import java.math.RoundingMode;

public class SystemOfEquations {

	public void replaceColumn(BigDecimal[][] originalMatrix, BigDecimal[][] changedMatrix, BigDecimal[] column,
			int columnIndex) {

		for (int i = 0; i < originalMatrix.length; i++) {
			for (int j = 0; j < originalMatrix[0].length; j++) {
				changedMatrix[i][j] = originalMatrix[i][j];
			}
		}
		for (int i = 0; i < originalMatrix.length; i++) {

			changedMatrix[i][columnIndex] = column[i];
		}
	}

	// I solved it as a Cramer system
	public BigDecimal[] solveEquationsSystem(BigDecimal[][] matrixOfTheSystem, BigDecimal[] freeTerms) {

		if (MatrixOperations.determinant(matrixOfTheSystem).compareTo(new BigDecimal(0)) == 0) {

			System.out.println("Error: the system cannot be solved with the available method");
			return null;
		} else {
			BigDecimal[] solutions = new BigDecimal[50];
			// for every unknown
			for (int i = 0; i < matrixOfTheSystem.length; i++) {

				BigDecimal matrixDet = MatrixOperations.determinant(matrixOfTheSystem);
				BigDecimal[][] matrixCorrespondingToTheSol = new BigDecimal[matrixOfTheSystem.length][matrixOfTheSystem.length];
				replaceColumn(matrixOfTheSystem, matrixCorrespondingToTheSol, freeTerms, i);
				BigDecimal solDeterminant = MatrixOperations.determinant(matrixCorrespondingToTheSol);
				solutions[i] = solDeterminant.divide(matrixDet, 2, RoundingMode.CEILING);
				// I determine the solution as the ratio between
				// 1.the determinant of the matrix formed by replacing the
				// column corresponding to the unknown into the system matrix
				// 2.the determinant of the system matrix
			}

			return solutions;
		}
	}

	public void printSolution(BigDecimal[] sol) {

		if (sol != null) {
			System.out.println("The solutions of the system are");
			int i = 0;
			while (i < sol.length && sol[i] != null) {
				System.out.println(sol[i] + " ");
				i++;
			}
		}
	}
}
