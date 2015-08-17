import java.math.BigDecimal;
import java.util.Scanner;

/*
 * Class responsible with matrix operations
 */
public class MatrixOperations{
	private static MatrixOperations instance = null;
	protected MatrixOperations(){
		
	}
	public static MatrixOperations getInstance(){
		if(instance == null){
			instance = new MatrixOperations();
		}
		return instance;
	}
	/*
	 * Create a new matrix
	 * m - Integer - nr of rows
	 * n - Integer - nr of columns
	 */
	public BigDecimal[][] createMatrix(int m, int n, Scanner in){
		BigDecimal[][] matrix = new BigDecimal[m][n];
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				System.out.println("Value of " + i + j+ ":");
				int value = in.nextInt();
				matrix[i][j] = new BigDecimal(String.valueOf(value));
				
				}
			}
		return matrix;
		
	}
	
	
	/*
	 * Add two matrices
	 * first - BigDecimal[][]
	 * second - BigDecimal[][]
	 */
	public BigDecimal[][] add(BigDecimal[][] first, BigDecimal[][] second){
		if(first[0].length != second[0].length || first[1].length != second[1].length){
			System.out.println("Cannot add two matrices with different grade");
		}
		int m = first[0].length;
		int n = second[1].length;
		BigDecimal[][] sum = new BigDecimal[m][n];
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				sum[i][j] = first[i][j].add(second[i][j]);

			}
		}
		return sum;
	}
	
	/*
	 * Subtract two matrices
	 * first - BigDecimal[][]
	 * second
	 */
	public BigDecimal[][] subtract(BigDecimal[][] first, BigDecimal[][] second){
		int m = first[0].length;
		int n = second[1].length;
		BigDecimal[][] sub = new BigDecimal[m][n];
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				sub[i][j] = first[i][j].subtract(second[i][j]);
			}
		}
		return sub;
	}
	/*
	 * Multiplication of two matrices
	 * first - BigDecimal[][]
	 * second - BigDecimal[][]
	 */
	public BigDecimal[][] multiply(BigDecimal[][] first, BigDecimal[][] second){
		int m = first[0].length;
		int n = first[1].length;
		int p = second[0].length;
		int q = second[1].length;
		BigDecimal[][] multiply = new BigDecimal[m][q];
		BigDecimal sum = new BigDecimal(0);
		for (int i=0; i<m; i++){
			for(int j=0; j<q; j++){
				for(int k=0; k<p; k++){
					sum = sum.add(first[i][k].multiply(second[k][j]));
				}
				multiply[i][j] = sum;
				sum=new BigDecimal(0);
			}
		}
		return multiply;
	}
	
	/*
	 * Multiply a matrix with a scalar
	 * matrix - BigDecimal[][]
	 * value - BigDecimal
	 * return the result - BigDecimal[][]
	 */
	public BigDecimal[][] multiplyWithScalar(BigDecimal[][] matrix, BigDecimal value){
		int m = matrix[0].length;
		int n = matrix[1].length;
		BigDecimal[][] mul = new BigDecimal[m][n];
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				mul[i][j] = matrix[i][j].multiply(value);
				}
		}
		return mul;
		}
	
	/*
	 * Compare if two matrices are equal
	 * first - BigDecimal[][]
	 * second - BigDecimal[][]
	 * return a boolean value
	 */
	public boolean isEqual(BigDecimal[][] first, BigDecimal[][] second){
		int m = first[0].length;
		int n = first[1].length;
		boolean equal = true;
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				if(first[i][j].compareTo(second[i][j]) != 0){
					equal = false;
					break;
				}
			}
		}
		if(equal == true){
			return true;
		}
		else{
			return false;
		}
		}
	
	/*
	 * Verify if a matrix has all elements equal to zero
	 * matrix - BigDecimal[][]
	 * return a boolean value
	 */
	public boolean isZero(BigDecimal[][] matrix){
		int m = matrix[0].length;
		int n = matrix[1].length;
		boolean isZero = true;
		BigDecimal value = new BigDecimal(0);
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				if(matrix[i][j].compareTo(value) != 0 ){
					isZero = false;
					break;
				}
			}
		}
		return isZero;
	}
	
	/*
	 * Verify if a matrix is the identity matrix
	 * matrix - BigDecimal[][]
	 * return a boolean value
	 */
	public boolean isIdentityMatrix(BigDecimal[][] matrix){
		boolean result = true;
		int m = matrix[0].length;
		int n = matrix[1].length;
		BigDecimal one = new BigDecimal(1);
		BigDecimal zero = new BigDecimal(0);
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				if (i == j){
					if(matrix[i][j].compareTo(one) != 0){
						result = false;
						break;
					}
				}
				else {
					if(matrix[i][j].compareTo(zero) != 0){
					result = false;
					break;
					}
				 }
				
			}
		}
		return result;
	}
	
	/*
	 * Compute the determinant of a matrix
	 * matrix - BigDecimal[][]
	 * return the determinant - BigDecimal
	 */
	public BigDecimal determinant(BigDecimal[][] matrix){
	BigDecimal sum = new BigDecimal(0);
	BigDecimal s;
	if(matrix.length == 1){
		sum = matrix[0][0];
	}
	for(int i=0; i<matrix.length; i++){
		BigDecimal[][] smaller = new BigDecimal[matrix.length-1][matrix.length-1];
		for(int j=1; j<matrix.length; j++){
			for(int k=0; k<matrix.length; k++){
				if(k<i){
					smaller[j-1][k] = matrix[j][k];
				}
				else if(k>i){
					smaller[j-1][k-1] = matrix[j][k];
				}
			}
		}
		if(i%2 == 0){
			s = new BigDecimal(1);
		}
		else{
			s=new BigDecimal(-1);
		}
		sum = sum.add(s.multiply(matrix[0][i].multiply(determinant(smaller))));
	}
	return sum;
	}
	
	/*
	 * Compute the nr of non-zero elements of a matrix
	 * matrix - BigDecimal[][]
	 * return nr - BigDecimal
	 */
	public BigDecimal fillDegree(BigDecimal[][] matrix){
		BigDecimal nr = new BigDecimal(0);
		BigDecimal zero = new BigDecimal(0);
		BigDecimal one = new BigDecimal(1);
		for(int i=0; i<matrix[0].length; i++){
			for(int j=0; j<matrix[1].length; j++){
				if(matrix[i][j].compareTo(zero) != 0){
					nr.add(one);
				}
			}
		}
		return nr;
	}
}
