import java.math.BigDecimal;
import java.util.*;

public class MatrixOperations 
{
  public static void main(String[] args)
  {
	  int m,n;
	  System.out.println("Input the dimensions of the first matrix : ");
	  Scanner input = new Scanner(System.in);
	  m = input.nextInt();
	  n = input.nextInt();
	  BigDecimal matrixOne[][] = new BigDecimal[m][n];
	  for(int i = 0;i < m;i++)
	  {
		  for(int j = 0;j < n;j++)
		  {
			  System.out.println("a[" + i + ',' + j + "]=");
			  matrixOne[i][j] = BigDecimal.valueOf(input.nextDouble());
		  }
	  }
	  
	  System.out.println("Input the dimensions of the second matrix : ");
	  
	  
	  m = input.nextInt();
	  n = input.nextInt();
	  
	  BigDecimal matrixTwo[][] = new BigDecimal[m][n];
	  
	  for(int i = 0;i < m;i++)
	  {
		  for(int j = 0;j < n;j++)
		  {
			  System.out.println("a[" + i + ',' + j + "]=");
			  matrixTwo[i][j] = BigDecimal.valueOf(input.nextDouble());
		  }
	  }
	  
	  
	  //ADD
	  System.out.println("The sum of the two matrices is : ");
	  MatrixOperations.printMatrix(MatrixOperations.add(matrixOne, matrixTwo));
	  
	  //SUBTRACT
	  System.out.println("The difference of the two matrices is : ");
	  MatrixOperations.printMatrix(MatrixOperations.subtract(matrixOne, matrixTwo));
	  
	  //MULTIPLY
	  System.out.println("The product of the matrices is : ");
	  MatrixOperations.printMatrix(MatrixOperations.multiply(matrixOne, matrixTwo));
	  
	  //MULTIPLY WITH SCALAR
	  BigDecimal scal;
	  System.out.println("Input the scalar : ");
	  scal = BigDecimal.valueOf(input.nextDouble());
	  System.out.println("The matrix obtained after scalar multiplications is : ");
	  MatrixOperations.printMatrix(MatrixOperations.multiplyScalar(matrixOne, scal));
	  
	  //ARE EQUAL
	  if(MatrixOperations.areEqual(matrixOne, matrixTwo) == true)
	  {
		  System.out.println("The matrices are equal");
	  }
	  else
	  {
		  System.out.println("The matrices are not equal");
	  }
	  
	  //IS ZERO MATRIX
	  if(MatrixOperations.isZeroMatrix(matrixOne) == true)
	  {
		  System.out.println("Matrix one is zero matrix");
	  }
	  else
	  {
		  System.out.println("Matrix one is not zero matrix");
	  }
	  
	  //IS IDENTITY MATRIX
	  if(MatrixOperations.isIdentityMatrix(matrixOne) == true)
	  {
		  System.out.println("Matrix one is identity matrix");
	  }
	  else
	  {
		  System.out.println("Matrix one is not identity matrix");
	  }
	  
	  //FILL DEGREE
	  System.out.println("The fill degree of the first matrix is : " + MatrixOperations.fillDegree(matrixOne));
	  
	  //DETERMINANT
	  if(matrixOne.length != matrixOne[0].length)
	  {
		  System.out.println("The matrix is not square so the determinant can`t be calculated");
	  }
	  else
	  {
	  System.out.println("The determinant of the first matrix is : " + MatrixOperations.det(matrixOne));
	  }
	  
	  input.close();
}// END main
  
  private static BigDecimal[][] add(BigDecimal[][] m,BigDecimal[][] n)
  {
	   
	 if ((m.length != n.length) || (m[0].length != n[0].length))
	 {
		 System.out.println("The matrices cannot be added");
		 return null;
	 }
	 else
	 {
		 BigDecimal result[][] = new BigDecimal[m.length][m[0].length];
		 for(int i = 0;i<m.length;i++)
		 {
			 for(int j = 0;j<m[0].length;j++)
			 {
				 result[i][j]=m[i][j].add(n[i][j]);
			 }
		 }
		 return result;
	 }
  }//END add
  
  private static BigDecimal[][] subtract(BigDecimal[][] m,BigDecimal[][] n)
  {
	  if ((m.length != n.length) || (m[0].length != n[0].length))
		 {
			 System.out.println("The matrices cannot be subtracted");
			 return null;
		 }
		 else
		 {
			 BigDecimal result[][] = new BigDecimal[m.length][m[0].length];
			 for(int i = 0;i<m.length;i++)
			 {
				 for(int j = 0;j<m[0].length;j++)
				 {
					 result[i][j]=m[i][j].subtract(n[i][j]);
				 }
			 }
			 return result;
		 }
  } //END subtract
  
  private static BigDecimal[][] multiply(BigDecimal[][] m,BigDecimal[][] n)
  {
	  if(m[0].length != n.length)
	  {
		  System.out.println("Cannot multiply matrices");
		  return  null;
	  }
	  else
	  {
		  BigDecimal result[][] = new BigDecimal[m.length][n[0].length];
		  BigDecimal sum;
		  sum = BigDecimal.valueOf(0);
		  for (int i = 0;i<m.length;i++)
		  {
			  for(int j = 0;j<m[0].length;j++)
			  {
				  for(int k = 0;k<n[0].length;k++)
				  {
					  sum = sum.add(m[i][k].multiply(n[k][j]));
				  }
				  result[i][j] = sum;
				  sum = BigDecimal.valueOf(0);
				  
			  }
			  
		  }
		 return result; 
	  }
  }//END multiply
  
  private static BigDecimal[][] multiplyScalar(BigDecimal[][] m,BigDecimal scalar)
  {   
	  BigDecimal result[][] = new BigDecimal[m.length][m[0].length];
	  for(int i = 0;i<m.length;i++)
	  {
		  for(int j = 0;j<m[0].length;j++)
		  {
			 result[i][j] = m[i][j].multiply(scalar); 
		  }
	  }
	  return result;
  }//END multiplyScalar
  
  
  
  private static boolean areEqual(BigDecimal[][] m,BigDecimal[][] n)
  {
	  boolean ok = true;
	  if((m.length != n.length) || (m[0].length != n[0].length))
	  {
		  ok = false;
	  }
	  else
	  {   
		  
		  for(int i = 0;i < m.length;i++)
		  {   
			  if (ok == false )
			  {
				  break;
			  }
			  for (int j = 0;j<m[0].length;j++)
			  {
				  if (m[i][j].compareTo(n[i][j]) != 0)
				  {
					  ok = false;
				  }
			  }
		  }
		  
	  }
	  return ok;
  }//END areEqual
  
  private static boolean isZeroMatrix(BigDecimal[][] m)
  {
	  boolean ok = true;
	  for (int i = 0;i < m.length;i++)
	  {   
		  if(ok == false)
		  {
			  break;
		  }
	
		  for (int j = 0;j < m[0].length;j++)
		  {
			  if (m[i][j].compareTo(BigDecimal.ZERO) != 0)
			  {
				  ok = false;
			  }
		  }
	  }
	  return ok;
  }//END isZeroMatrix
  
  private static boolean isIdentityMatrix(BigDecimal[][] m)
  {
	  boolean ok = true;
	  
	  
	  for(int i = 0;i<m.length;i++)
	  {   
		  if(ok == false)
		  {
			  break;
		  }
		  
		  for(int j = 0;j<m[0].length;j++)
		  {
			  if(i == j)
			  {
				  if(m[i][j].compareTo(BigDecimal.ONE) != 0)
				  {
					  ok = false;
				  }
			  }
			  else
			  {
				  if(m[i][j].compareTo(BigDecimal.ZERO) != 0)
				  {
					  ok = false;
				  }
			  }
		  }	 
	  }
	  
	  return ok;
  }// END isIdentityMatrix
  
  private static BigDecimal fillDegree(BigDecimal[][] m)
  {
	  
	  int nrOfNonZeroes = 0;
	 
	  BigDecimal fillRate;
	  for (int i = 0;i<m.length;i++)
	  {
		  for (int j = 0;j<m[0].length;j++)
		  {
			  if (m[i][j].compareTo(BigDecimal.valueOf(0)) != 0)
			  {
				  nrOfNonZeroes++;
			  }
		  }
	  }
	 
	 int nrOfElements = m.length*m[0].length;
     fillRate = BigDecimal.valueOf(nrOfNonZeroes);
     fillRate = fillRate.divide(BigDecimal.valueOf(nrOfElements));
     
     return fillRate;
     
  }//END fillDegree;
  
  private static BigDecimal det(BigDecimal[][] m) {
      int n = m.length;
      if (n == 1) {
          return m[0][0];
      } 
      else 
      {
          BigDecimal det = BigDecimal.ZERO;
          for (int j = 0; j < n; j++) 
          {
              det = det.add(m[0][j].multiply(BigDecimal.valueOf(Math.pow(-1, j))).multiply(det(minor(m,0,j))));
          }
          return det;
      }
  }

  
  private static BigDecimal[][] minor(final BigDecimal[][] m, final int i, final int j) {
      int n = m.length;
      BigDecimal[][] minor = new BigDecimal[n-1][n-1];
      // index for minor matrix position:
      int r = 0, s = 0;
      for (int k = 0; k < n; k++) {
          BigDecimal[] row = m[k];
          if (k != i) {
              for (int l = 0; l < row.length; l++) {
                  if (l != j) {
                      minor[r][s++] = row[l];
                  }
              }
              r++;
              s = 0;
          }
      }
      return minor;
  }//END det
  
  private static void printMatrix(BigDecimal [][] m)
  {  
	  if (m != null)
	  {		  
	  for(int i = 0;i<m.length;i++)
	  {
		  for (int j = 0;j<m[0].length;j++)
		  {
			  System.out.print("|" + m[i][j] + "|");
		  }
		System.out.println(); 
	  }
	  }
  }// END printMatrix
  
}//END class

