import java.math.*;

public class Launch {
	public static void main(String[] args){
		ReadMatrixes r = new ReadMatrixes();
		MatrixOperations op = new MatrixOperations();
		BigDecimal[][] finalM = new BigDecimal[5][5];
		r.input();
	
		
		finalM = op.add(r.m, r.n);
		r.printMatrix(finalM);
		System.out.print("\n");
		finalM = op.subtract(r.m, r.n);
		r.printMatrix(finalM);
		System.out.print("\n");
		finalM = op.multiply(r.m, r.n);
		r.printMatrix(finalM);
		System.out.print("\n");
		BigDecimal nr = new BigDecimal("2.0");
		finalM = op.multiplyScalar(r.m,nr);
		r.printMatrix(finalM);
		System.out.print("\n");
		if(op.areEqual(r.m, r.n))
			System.out.println("Are Equal");
		else
			System.out.println("Are not Equal");
		System.out.print("\n");
		BigDecimal c = op.determinant(r.m);
		System.out.println("Determinant is: " + c);
		System.out.print("\n");
		if(op.isIdentityMatrix(r.n))
			System.out.println("Is Identity matrix ");
		else
			System.out.println("Is not Identity matrix ");
		System.out.println("Filling Degree is: " + op.fillDegre(r.n) + "%");
		//r.printMatrix(finalM);
	}
}
