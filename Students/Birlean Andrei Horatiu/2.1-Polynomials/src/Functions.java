import java.util.*;
import java.math.*;

public class Functions 
{
  public Polynomial add(Polynomial p1,Polynomial p2)
  {
	  Polynomial result = new Polynomial();
	  if(p1.degree >= p2.degree)
	  {
		  result.degree = p1.degree;
		  result.coefficients = new int[result.degree];
		  for (int i = 0;i < p2.degree;i++)
		  {
			  result.coefficients[i] = p1.coefficients[i] + p2.coefficients[i];
		  }
		  
		  for(int i = p2.degree;i <= p1.degree ; i++)
		  {
			  result.coefficients[i] = p1.coefficients[i];
		  }
	  }
	  else 
	  {
		  result.degree = p2.degree;
		  result.coefficients = new int[result.degree];
		  for (int i = 0;i < p1.degree;i++)
		  {
			  result.coefficients[i] = p1.coefficients[i] + p2.coefficients[i];
		  }
		  
		  for(int i = p1.degree;i < p2.degree ; i++)
		  {
			  result.coefficients[i] = p2.coefficients[i];
		  }
	  }
	  
	  return result;
	  
  }// END add method
  
  
  public Polynomial subtract(Polynomial p1,Polynomial p2)
  {
	  Polynomial result = new Polynomial();
	 
	  if(p1.degree > p2.degree)
	  {
		  result.degree = p1.degree;
		  result.coefficients = new int[result.degree];
		  
		  for (int i = 0;i <= p2.degree;i++)
		  {
			  result.coefficients[i] = p1.coefficients[i] - p2.coefficients[i];
		  }
		  
		  for(int i = p2.degree;i <= p1.degree ; i++)
		  {
			  result.coefficients[i] = p1.coefficients[i];
		  }
	  }
	  else
	  {
		  result.degree = p2.degree;
		  result.coefficients = new int[result.degree];
		  
		  for (int i = 0;i < p1.degree;i++)
		  {
			  result.coefficients[i] = p1.coefficients[i] - p2.coefficients[i];
		  }
		  
		  for(int i = p1.degree;i < p2.degree ; i++)
		  {
			  result.coefficients[i] = p2.coefficients[i];
		  }
	  }
	  
	  return result;
  }//END subtract method
  
  
  public Polynomial multiply(Polynomial p1,Polynomial p2)
  {
	 Polynomial result = new Polynomial();
	 
	 result.degree = p1.degree + p2.degree;
	 result.coefficients = new int[result.degree];
	 for (int i = 0;i < result.degree;i++)
	 {
		 result.coefficients[i] = 0;
	 }
	 
	 for (int i = 0;i < p1.degree;i++)
	 {
		 for (int j = 0;j < p2.degree;j++)
		 {
			 result.coefficients[i + j] = result.coefficients[i + j] + p1.coefficients[i]*p2.coefficients[j];
		 }
	 }
	 
	 return result;
  }//END multiply
 
  
  public Polynomial multScal(Polynomial poly,int scal)
  {
	  Polynomial result = new Polynomial();
	  result.degree = poly.degree;
	  result.coefficients = new int[result.degree];
	  for (int i = 0;i < poly.degree;i++)
	  {
		  result.coefficients[i] = scal*poly.coefficients[i];
	  }
	  return result;
  }//END multScal
 
  
  public int evalN(Polynomial poly, int n)
  {
	  int result = 0;
	  
	  for (int i = 0;i < poly.degree;i++)
	  {
	    result = result + poly.coefficients[i]*(int)(Math.pow(n, i));  
	  }
	  return result;
  }//END evalN
  
}//END Functions class
