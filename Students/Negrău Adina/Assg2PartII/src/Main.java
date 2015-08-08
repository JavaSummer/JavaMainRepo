import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m, n, c, d;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number of the rows of the matrix: ");
		m = in.nextInt();
		System.out.println("Enter the number of the columns of the matrix: ");
		n = in.nextInt();
		MatrixOperations instance = new MatrixOperations();
	
		System.out.println("Enter the elements of the first matrix:");
		BigDecimal[][] first = instance.createMatrix(m,n,in);
		
		System.out.println("Enter the elements of the second matrix:");
		BigDecimal[][] second = instance.createMatrix(m,n,in);
		
		System.out.println("Enter the value to be multiplied with:");
		int x = in.nextInt();
		BigDecimal value = new BigDecimal(x); 
		//instance.add(first, second);
		//instance.subtract(first, second);
		//instance.multiplyWithScalar(first, value);
		//instance.multiply(first, second);
		//System.out.println(instance.isEqual(first, second));
		//System.out.println(instance.isZero(first));
		//System.out.println(instance.isIdentityMatrix(first));
		//System.out.println(instance.determinant(first));
		System.out.println(instance.fillDegree(first));
	}
	}

