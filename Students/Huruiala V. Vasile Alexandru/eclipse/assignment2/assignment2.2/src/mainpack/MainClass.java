package mainpack;

import java.math.BigDecimal;

public final class MainClass {

	public static void main(String[] args) {
		final int ar = 5;
		final int ac = 3;
		
		final int br = 3;
		final int bc = 4;
		
		final int cr = 3;
		final int cc = 3;
		
		final int dr = 3;
		final int dc = 3;
		
		BigDecimal[][] am = zeroMat(ar, ac);
		BigDecimal[][] bm = zeroMat(br, bc);
		BigDecimal[][] cm = zeroMat(cr, cc);
		BigDecimal[][] dm = zeroMat(dr, dc);
		
		for (int i = 0; i < ar; i++) {
			for (int j = 0; j < ac; j++) {
				am[i][j] = new BigDecimal(i + j);
			}
		}
		for (int i = 0; i < br; i++) {
			for (int j = 0; j < bc; j++) {
				bm[i][j] = new BigDecimal(i * br + j);
			}
		}
		for (int i = 0; i < cr; i++) {
			for (int j = 0; j < cc; j++) {
				cm[i][j] = new BigDecimal(i + br * j + (i + j) % 2);
			}
		}
		for (int i = 0; i < dr; i++) {
			for  (int j = 0; j < dc; j++) {
				if (i == j) {
					dm[i][j] = BigDecimal.ONE;
				}
			}

		}
		
		BigDecimal[] ftA = new BigDecimal[ar];
		BigDecimal[] ftB = new BigDecimal[br];
		BigDecimal[] ftC = new BigDecimal[cr];
		BigDecimal[] ftD = new BigDecimal[dr];
		
		for (int i = 0; i < ar; i++) {
			ftA[i] = new BigDecimal(i);
		}
		for (int i = 0; i < br; i++) {
			ftB[i] = new BigDecimal(i + 2);		
		}
		for (int i = 0; i < cr; i++) {
			ftC[i] = new BigDecimal(i * 2 + 1);
		}
		for (int i = 0; i < dr; i++) {
			ftD[i] = new BigDecimal(i * 3 - 5);
		}
		
		MatrixOperations mo = MatrixOperations.getInstance();		
		
		System.out.println("\n ///FIRST SET/// \n");
		testMat(mo, am, bm, ftA, ftB);
		System.out.println("\n ///SECOND SET/// \n");
		testMat(mo, cm, dm, ftC, ftD);
	}
	
	public static void testMat(MatrixOperations mo, BigDecimal[][] am, BigDecimal[][] bm, BigDecimal[] ftA, BigDecimal[] ftB) {
		System.out.println("A and B: ");
		printMatrix(am);
		printMatrix(bm);
		
		System.out.println("A + B");
		printMatrix(mo.add(am, bm));
		System.out.println("A - B");
		printMatrix(mo.subtract(am, bm));
		System.out.println("A * B");
		printMatrix(mo.multiply(am, bm));
		System.out.println("A * 3");
		printMatrix(mo.multiplyScalar(am, new BigDecimal(3)));
		System.out.println("b * 2.5");
		printMatrix(mo.multiplyScalar(bm, new BigDecimal(2.5D)));
		System.out.println("det A = " + mo.determinant(am) + " | det B = " + mo.determinant(bm));
		System.out.println("A = B is " + mo.areEqual(am, bm));
		System.out.println("A is 0 mat is " + mo.isZeroMatrix(am) + " | B is 0 mat is " + mo.isZeroMatrix(bm));
		System.out.println("A is 1 mat is " + mo.isIdentityMatrix(am) + " | B is 1 mat is " + mo.isIdentityMatrix(bm));
		System.out.println("A fill degree: " + mo.fillDegree(am) + " | B fill degree: " + mo.fillDegree(bm));
		
		System.out.println("A = ftA");
		printArray(ftA);
		System.out.println("sol is");
		printArray(mo.solveSystem(am, ftA));
		
		System.out.println("B = ftB");
		printArray(ftB);
		System.out.println("sol is");
		printArray(mo.solveSystem(bm, ftB));
	}
	
	public static BigDecimal[][] zeroMat(int rowSize, int colSize) {
		if (rowSize <= 0 || colSize <= 0) {
			return null;
		}
		
		BigDecimal[][] result = new BigDecimal[rowSize][colSize];
		
		for (int row = 0; row < rowSize; row++) {
			for (int col = 0; col < colSize; col++) {
				result[row][col] = BigDecimal.ZERO;
			}
		}
		
		return result;
	}
	
	public static void printArray(BigDecimal[] arr) {
		if (arr == null) {
			System.out.println("null array found");
			return;
		}
		
		int els = arr.length;
		for (int i = 0; i < els; i++) {
			System.out.print(arr[i].doubleValue() + " ");
		}
		System.out.println();
	}
	
	public static void printMatrix(BigDecimal[][] matrix) {
		if (matrix == null) {
			System.out.println("null matrix found");
			return;
		}
		int rows = matrix.length;
		int cols = matrix[0].length;
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(matrix[i][j].doubleValue() + "  ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
