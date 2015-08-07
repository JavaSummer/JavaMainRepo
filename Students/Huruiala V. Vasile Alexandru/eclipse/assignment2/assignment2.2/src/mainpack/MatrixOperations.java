package mainpack;

import java.math.BigDecimal;

/**
 * 
 * @author alexh
 *
 */
public final class MatrixOperations {
	/** Singleton instance. */
	private static MatrixOperations instance = null;
	/**
	 * Default Constructor.
	 */
	private MatrixOperations() {
	}
	/**
	 * @return {@link MatrixOperations}
	 */
	public static MatrixOperations getInstance() {
		if (instance == null) {
			synchronized (MatrixOperations.class) {
				instance = new MatrixOperations();
			}
		}
		return instance;
	}
	
	/**
	 * Sums the two matrices.
	 * @param augend BigDecimal[][]
	 * @param addened BigDecimal[][]
	 * @return BigDecimal[][]
	 */
	public BigDecimal[][] add(final BigDecimal[][] augend, final BigDecimal[][] addened) {
		int augendRows = augend.length;
		int addenedRows = addened.length;
		if (augendRows <= 0 || addenedRows <= 0 || augendRows != addenedRows) {
			return null;
		}
		
		int augendCols = augend[0].length;
		int addenedCols = addened[0].length;
		if (augendCols <= 0 || addenedCols <= 0 || augendCols != addenedCols) {
			return null;
		}
		
		BigDecimal[][] sum = new BigDecimal[augendRows][augendCols];
		
		for (int row = 0; row < augendRows; row++) {
			for (int col = 0; col < augendCols; col++) {
				sum[row][col] = augend[row][col].add(addened[row][col]);
			}
		}
		
		return sum;
	}
	
	/**
	 * Subtracts subtrahend form minuend.
	 * @param minuend BigDecimal[][]
	 * @param subtrahend BigDecimal[][]
	 * @return BigDecimal[][]
	 */
	public BigDecimal[][] subtract(final BigDecimal[][] minuend, final BigDecimal[][] subtrahend) {
		int minuendRows = minuend.length;
		int subtrahendRows = subtrahend.length;
		if (minuendRows <= 0 || subtrahendRows <= 0 || minuendRows != subtrahendRows) {
			return null;
		}
		
		int minuendCols = minuend[0].length;
		int subtrahendCols = subtrahend[0].length;
		if (minuendCols <= 0 || subtrahendCols <= 0 || minuendCols != subtrahendCols) {
			return null;
		}
		
		BigDecimal[][] difference = new BigDecimal[minuendRows][minuendCols];
		
		for (int row = 0; row < minuendRows; row++) {
			for (int col = 0; col < minuendCols; col++) {
				difference[row][col] = minuend[row][col].subtract(subtrahend[row][col]);
			}
		}
		
		return difference;
	}
	
	/**
	 * Multiplies the two matrices.
	 * @param multiplicand BigDecimal[][]
	 * @param multiplier BigDecimal[][]
	 * @return BigDecimal[][]
	 */
	public BigDecimal[][] multiply(final BigDecimal[][] multiplicand, final BigDecimal[][] multiplier) {
		int multiplicandRows = multiplicand.length;
		int multiplierRows = multiplier.length;
		if (multiplicandRows <= 0 || multiplierRows <= 0) {
			return null;
		}
		
		int multiplicandCols = multiplicand[0].length;
		int multiplierCols = multiplier[0].length;
		if (multiplicandCols <= 0 || multiplierCols <= 0) {
			return null;
		}
		
		if (multiplicandCols != multiplierRows) {
			return null;
		}
		
		return strassen(multiplicand, multiplier);
	}
	
	/**
	 * Strassen algorithm.
	 * @param a BigDecimal[][]
	 * @param b BigDecimal[][]
	 * @return BigDecimal[][]
	 */
	private BigDecimal[][] strassen(final BigDecimal[][] a, final BigDecimal[][] b) {
		//Get a and b to the type 2^n x 2^n
		//Maximum of any of their dimension
		int aRows = a.length;
		int aCols = a[0].length;
		int bRows = b.length;
		int bCols = b[0].length;
		int maxSize = Math.max(Math.max(aRows, aCols), Math.max(bRows, bCols));
		//Calculate the smallest power of two greater than maxSize
		int nextExponent = (int) Math.ceil(Math.log(maxSize) / Math.log(2));
		int nextSize = (int) Math.pow(2, nextExponent);
		//Create the new matrices of the specified size
		BigDecimal[][] expandedA = new BigDecimal[nextSize][nextSize];
		BigDecimal[][] expandedB = new BigDecimal[nextSize][nextSize];
		//Blit a and b into the new matrices
		//The missing rows and columns will be filled with 0
		for (int row = 0; row < nextSize; row++) {
			for (int col = 0; col < nextSize; col++) {
				if (row < aRows && col < aCols) {
					expandedA[row][col] = a[row][col];
				} else {
					expandedA[row][col] = BigDecimal.ZERO;
				}
			}
		}
		for (int row = 0; row < nextSize; row++) {
			for (int col = 0; col < nextSize; col++) {
				if (row < bRows && col < bCols) {
					expandedB[row][col] = b[row][col];
				} else {
					expandedB[row][col] = BigDecimal.ZERO;
				}
			}
		}
		
		BigDecimal[][] rawMatrix =  strassenRec(expandedA, expandedB);
		
		BigDecimal[][] trimmedMatrix = new BigDecimal[aRows][bCols];
		
		for (int row = 0; row < aRows; row++) {
			for (int col = 0; col < bCols; col++) {
				trimmedMatrix[row][col] = rawMatrix[row][col];
			}
		}
		
		return trimmedMatrix;
	}
	
	/**
	 * Recursive divide and conquer part of the algorithm.
	 * @param a BigDecimal[][]
	 * @param b BigDecimal[][]
	 * @return BigDecimal[][]
	 */
	private BigDecimal[][] strassenRec(final BigDecimal[][] a, final BigDecimal[][] b) {
		int size = a.length;
		BigDecimal[][] c = new BigDecimal[size][size];

		if (size == 2) {
			//The submatrices are numbers
			//There are 7 multiplications instead of 8
			BigDecimal m1 = (a[0][0].add(a[1][1])).multiply(b[0][0].add(b[1][1]));
			BigDecimal m2 = (a[1][0].add(a[1][1])).multiply(b[0][0]);
			BigDecimal m3 = a[0][0].multiply(b[0][1].subtract(b[1][1]));
			BigDecimal m4 = a[1][1].multiply(b[1][0].subtract(b[0][0]));
			BigDecimal m5 = (a[0][0].add(a[0][1])).multiply(b[1][1]);
			BigDecimal m6 = (a[1][0].subtract(a[0][0])).multiply(b[0][0].add(b[0][1]));
			BigDecimal m7 = (a[0][1].subtract(a[1][1])).multiply(b[1][0].add(b[1][1]));
			//Assemble the matrix back
			c[0][0] = m1.add(m4.add(m7.subtract(m5)));
			c[0][1] = m3.add(m5);
			c[1][0] = m2.add(m4);
			c[1][1] = m1.add(m3.add(m6.subtract(m2)));
			
			return c;
		} else {
			//Split the matrices into 4 equal block matrices
			int newSize = size / 2;
			
			BigDecimal[][] a00 = new BigDecimal[newSize][newSize];
			BigDecimal[][] a01 = new BigDecimal[newSize][newSize];
			BigDecimal[][] a10 = new BigDecimal[newSize][newSize];
			BigDecimal[][] a11 = new BigDecimal[newSize][newSize];
			
			BigDecimal[][] b00 = new BigDecimal[newSize][newSize];
			BigDecimal[][] b01 = new BigDecimal[newSize][newSize];
			BigDecimal[][] b10 = new BigDecimal[newSize][newSize];
			BigDecimal[][] b11 = new BigDecimal[newSize][newSize];
			
			for (int row = 0; row < newSize; row++) {
				for (int col = 0; col < newSize; col++) {
					a00[row][col] = a[row][col];
					a01[row][col] = a[row][newSize + col];
					a10[row][col] = a[newSize + row][col];
					a11[row][col] = a[newSize + row][newSize + col];
					
					b00[row][col] = b[row][col];
					b01[row][col] = b[row][newSize + col];
					b10[row][col] = b[newSize + row][col];
					b11[row][col] = b[newSize + row][newSize + col];
				}
			}
			//Divide and conquer part
			BigDecimal[][] m1 = this.copyMat(this.strassenRec(this.add(a00, a11), this.add(b00, b11)));
			BigDecimal[][] m2 = this.copyMat(this.strassenRec(this.add(a10, a11), b00));
			BigDecimal[][] m3 = this.copyMat(this.strassenRec(a00, this.subtract(b01, b11)));
			BigDecimal[][] m4 = this.copyMat(this.strassenRec(a11, this.subtract(b10, b00)));
			BigDecimal[][] m5 = this.copyMat(this.strassenRec(this.add(a00, a01), b11));
			BigDecimal[][] m6 = this.copyMat(this.strassenRec(this.subtract(a10, a00), this.add(b00, b01)));
			BigDecimal[][] m7 = this.copyMat(this.strassenRec(this.subtract(a01, a11), this.add(b10, b11)));
			
			BigDecimal[][] c00 = this.copyMat(this.add(m1, this.add(m4, this.subtract(m7, m5))));
			BigDecimal[][] c01 = this.copyMat(this.add(m3, m5));
			BigDecimal[][] c10 = this.copyMat(this.add(m2, m4));
			BigDecimal[][] c11 = this.copyMat(this.add(m1, this.add(m3, this.subtract(m6, m2))));
			//Assemble the matrix back
			for (int row = 0; row < newSize; row++){
				for (int col = 0; col < newSize; col++) {
					c[row][col] = c00[row][col];
				}
			}
			for (int row = 0; row < newSize; row++){
				for (int col = 0; col < newSize; col++) {
					c[row][newSize + col] = c01[row][col];
				}
			}
			for (int row = 0; row < newSize; row++){
				for (int col = 0; col < newSize; col++) {
					c[newSize + row][col] = c10[row][col];
				}
			}
			for (int row = 0; row < newSize; row++){
				for (int col = 0; col < newSize; col++) {
					c[newSize + row][newSize + col] = c11[row][col];
				}
			}
			
			return c;
		}
	}
	
	/**
	 * Returns a copy of the matrix by referencing all the objects to a new array.
	 * @param matrix BigDecimal[][]
	 * @return BigDecimal[][]
	 */
	private BigDecimal[][] copyMat(final BigDecimal[][] matrix) {
		int rows = matrix.length;
		if (rows <= 0) {
			return null;
		}
		int cols = matrix[0].length;
		if (cols <= 0) {
			return null;
		}
		
		BigDecimal[][] newMat = new BigDecimal[rows][cols];
		
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				newMat[row][col] = matrix[row][col];
			}
		}
		
		return newMat;
	}
	
	/**
	 * Multiplies the matrix with the scalar.
	 * @param multiplicand BigDecimal[][]
	 * @param scalar BigDecimal
	 * @return BigDecimal[][]
	 */
	public BigDecimal[][] multiplyScalar(final BigDecimal[][] multiplicand, final BigDecimal scalar) {
		int multiplicandRows = multiplicand.length;
		if (multiplicandRows <= 0) {
			return null;
		}
		
		int multiplicandCols = multiplicand[0].length;
		if (multiplicandCols <= 0) {
			return null;
		}
		
		BigDecimal[][] product = new BigDecimal[multiplicandRows][multiplicandCols];
		
		for (int row = 0; row < multiplicandRows; row++) {
			for (int col = 0; col < multiplicandCols; col++) {
				product[row][col] = multiplicand[row][col].multiply(scalar);
			}
		}
		
		return product;
	}
	
	/**
	 * Returns the determinant of the matrix or null if it is not a square matrix.
	 * @param matrix BigDecimal[][]
	 * @return BigDecimal
	 */
	public BigDecimal determinant(final BigDecimal[][] matrix) {
		int matrixRows = matrix.length;
		if (matrixRows <= 0) {
			return null;
		}
		
		int matrixCols = matrix[0].length;
		if (matrixCols <= 0 || matrixRows != matrixCols) {
			return null;
		}
		
		return determinantRec(matrix);
	}
	
	/**
	 * Recursive version of the row expansion.
	 * @param matrix BigDecimal[][]
	 * @return BigDecimal
	 */
	private BigDecimal determinantRec(final BigDecimal[][] matrix) {
		int size = matrix.length;
		
		if (size == 1) {
			return matrix[0][0];
		} else {
			BigDecimal det = new BigDecimal(0);
			
			for (int row = 0; row < size; row++) {
				//Build the smaller matrix
				BigDecimal[][] detComponent = new BigDecimal[size - 1][size - 1];
				int noGapRow = 0;
				for (int sRow = 0; sRow < size; sRow++) {
					if (sRow != row) {
						for (int sCol = 1; sCol < size; sCol++) {
							detComponent[noGapRow][sCol - 1] = matrix[sRow][sCol];
						}
						noGapRow++;
					}
				}
				
				if (row % 2 == 0) {
					det = det.add(matrix[row][0].multiply(determinantRec(detComponent)));
				} else {
					det = det.add((matrix[row][0].negate()).multiply(determinantRec(detComponent)));
				}
				
			}
			return det;
		}
	}
	
	/**
	 * Tests if the two matrices are equal.
	 * @param matrix1 BigDecimal[][]
	 * @param matrix2 BigDecimal[][]
	 * @return boolean
	 */
	public boolean areEqual(final BigDecimal[][] matrix1, final BigDecimal[][] matrix2) {
		int matrix1Rows = matrix1.length;
		int matrix2Rows = matrix2.length;
		if (matrix1Rows <= 0 || matrix2Rows <= 0 || matrix1Rows != matrix2Rows) {
			return false;
		}
		
		int matrix1Cols = matrix1[0].length;
		int matrix2Cols = matrix2[0].length;
		if (matrix1Cols <= 0 || matrix2Cols <= 0 || matrix1Cols != matrix2Cols) {
			return false;
		}
		
		
		boolean ineqNotFound = true;
		
		for (int row = 0; row < matrix1Rows; row++) {
			for (int col = 0; col < matrix1Cols; col++) {
				if (!matrix1[row][col].equals(matrix2[row][col])) {
					ineqNotFound = false;
				}
			}
		}
		
		return ineqNotFound;
	}
	
	/**
	 * Tests if the matrix only contains zeroes.
	 * @param matrix BigDecimal[][]
	 * @return boolean
	 */
	public boolean isZeroMatrix(final BigDecimal[][] matrix) {
		int matrixRows = matrix.length;
		if (matrixRows <= 0) {
			return false;
		}
		
		int matrixCols = matrix[0].length;
		if (matrixCols <= 0) {
			return false;
		}
		
		boolean nonZeroNotDetected = true;
		
		for (int row = 0; row < matrixRows && nonZeroNotDetected; row++) {
			for (int col = 0; col < matrixCols && nonZeroNotDetected; col++) {
				if (!matrix[row][col].equals(BigDecimal.ZERO)) {
					nonZeroNotDetected = false;
				}
			}
		}
		
		return nonZeroNotDetected;
	}
	
	/**
	 * Tests if the matrix is the identity matrix.
	 * @param matrix BigDecimal[][]
	 * @return BigDecimal[][]
	 */
	public boolean isIdentityMatrix(final BigDecimal[][] matrix) {
		int matrixRows = matrix.length;
		if (matrixRows <= 0) {
			return false;
		}
		
		int matrixCols = matrix[0].length;
		if (matrixCols <= 0 || matrixRows != matrixCols) {
			return false;
		}
		
		boolean nonOneDiagOrnonZero = true;
		
		for (int row = 0; row < matrixRows && nonOneDiagOrnonZero; row++) {
			for (int col = 0; col < matrixCols && nonOneDiagOrnonZero; col++) {
				if (row == col) {
					if (!matrix[row][col].equals(BigDecimal.ONE)) {
						nonOneDiagOrnonZero = false;
					}
				} else {
					if (!matrix[row][col].equals(BigDecimal.ZERO)) {
						nonOneDiagOrnonZero = false;
					}
				}
			}
		}
		
		
		return nonOneDiagOrnonZero;
	}
	
	/**
	 * Calculates the ratio between non zero elements and the number of elements.
	 * @param matrix BigDecimal[][]
	 * @return BigDecimal
	 */
	public BigDecimal fillDegree(final BigDecimal[][] matrix) {
		int matrixRows = matrix.length;
		if (matrixRows <= 0) {
			return null;
		}
		
		int matrixCols = matrix[0].length;
		if (matrixCols <= 0) {
			return null;
		}
		
		int nonZeroes = 0;
		for (int row = 0; row < matrixRows; row++) {
			for (int col = 0; col < matrixCols; col++) {
				if (!matrix[row][col].equals(BigDecimal.ZERO)) {
					nonZeroes++;
				}
			}
		}
		
		return new BigDecimal((double) nonZeroes / (matrixRows * matrixCols));
	}
	
	/**
	 * Takes the system of equations and returns the solution or null if it there isn't a unique one.
	 * @param ecuationCoefficients BigDecimal[][]
	 * @param freeTerm BigDecimal[]
	 * @return BigDecimal[]
	 */
	public BigDecimal[] solveSystem(BigDecimal[][] ecuationCoefficients, BigDecimal[] freeTerm) {
		int ecRows = ecuationCoefficients.length;
		int ftSize = freeTerm.length;
		if (ecRows <= 0 || ftSize <= 0 || ecRows != ftSize) {
			return null;
		}
		
		int ecCols = ecuationCoefficients[0].length;
		if (ecCols <= 0 || ecRows != ecCols) {
			return null;
		}
		
		//If the characteristic determinant of the system is zero, there are no solutions
		BigDecimal detChar = this.determinant(ecuationCoefficients);
		if (detChar == null || detChar.equals(BigDecimal.ZERO)) {
			return null;
		}
		
		BigDecimal[] solution = new BigDecimal[ftSize];
		
		for (int index = 0; index < ftSize; index++) {
			BigDecimal[][] matrixSwappedCol = copyMat(ecuationCoefficients);
			//Swap the index'th column with the free term matrix
			for (int row = 0; row < ecCols; row++) {
				matrixSwappedCol[row][index] = freeTerm[row];
			}
			BigDecimal det = this.determinant(matrixSwappedCol);
			//The solution for the index'th variable is the
			//determinant of the matrix with the swapped column
			//divided by the characteristic determinant
			solution[index] = det.divide(detChar);
		}
		
		return solution;
	}

}
