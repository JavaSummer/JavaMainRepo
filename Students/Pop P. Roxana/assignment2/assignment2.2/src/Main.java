import java.math.BigDecimal;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MatrixOperations obj = MatrixOperations.getInstance();

		BigDecimal a[][] = { { new BigDecimal(1), new BigDecimal(5) }, { new BigDecimal(0), new BigDecimal(11) } };
		BigDecimal b[][] = { { new BigDecimal(0), new BigDecimal(1) },{ new BigDecimal(1), new BigDecimal(5)} };
				
		 //add
		 BigDecimal [][] result= MatrixOperations.add(a, b);
		 System.out.println("\nADD");
		 MatrixOperations.printMatrix(result);
		 
		 //add
		 result= MatrixOperations.subtract(a, b);
		 System.out.println("\nSubtract");
		 MatrixOperations.printMatrix(result);
		 
		 //multiply
		 result= MatrixOperations.multiply(a, b);
		 System.out.println("\nMULTIPLY");
		 MatrixOperations.printMatrix(result);
		 
		 //multiply with a scalar
		 result= MatrixOperations.multiplyScalar(a, new BigDecimal(10));
		 System.out.println("\nMULTIPLY");
		 MatrixOperations.printMatrix(result);
		 
		 //determinant
		 BigDecimal det= MatrixOperations.determinant(a);
		 System.out.println("\nDETERMINANT");
		 System.out.println(det);
		 
		 //are equal
		 boolean areEq= MatrixOperations.areEqual(a, b);
		 System.out.println("\nARE EQUAL");
		 System.out.println((areEq)?"The two matrices are equal":"The two matrices are not equal");

		 //is identity matrix
		 boolean isIdA= MatrixOperations.isIdentityMatrix(a);
		 System.out.println("\nIS IDENTITY MATRIX");
		 System.out.println((isIdA)?"The matrix a is the identity matrix":"The matrix a is not the identity matrix");
		 boolean isIdB= MatrixOperations.isIdentityMatrix(b);
		 System.out.println((isIdB)?"The matrix b is the identity matrix":"The matrix b is not the identity matrix");
		 
		 //is identity matrix
		 boolean isZeroA= MatrixOperations.isZeroMatrix(a);
		 System.out.println("\nIS ZERO MATRIX");
		 System.out.println((isZeroA)?"The matrix a is all 0":"The matrix a is not all 0");
		 boolean isZeroB= MatrixOperations.isZeroMatrix(b);
		 System.out.println((isZeroB)?"The matrix b is all 0":"The matrix b is not all 0");
		 
		 
		 //fill degree
	     System.out.println("The fill degree of matrix a is: " + MatrixOperations.fillDegree(a));
	     System.out.println("The fill degree of matrix b is: " + MatrixOperations.fillDegree(b));

	}

}
