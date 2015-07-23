package myPackage;

import java.math.BigDecimal;

public class Matrix  {
	private static BigDecimal[][] m1;
	private static BigDecimal[][] m2;

	public static void main(String[] args) {
		try{
			MatrixOperations mo = new MatrixOperations();
			mo.Instantiate(m1);
			mo.Instantiate(m2);
			mo.Initialise(m1);
			mo.Initialise(m2);
			mo.addMatrix(m1, m2);
		}
		catch(Exception e)
		{
			System.err.println("An error has occured :");
			e.printStackTrace();
		}
		finally{
			System.err.println("Please reiterate the inputs as an unexpected error has occured");
		}
	}
}
