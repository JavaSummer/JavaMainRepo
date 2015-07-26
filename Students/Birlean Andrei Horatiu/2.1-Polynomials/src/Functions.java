import java.util.ArrayList;

public class Functions
{
  public static int[] add(ArrayList<Integer> m,ArrayList<Integer> n)
  {
	  int maxLength;
	  int k = 0;
	  if(m.size() > n.size())
	  {
		  maxLength = m.size();
	  }
	  else
	  {
		  maxLength = n.size();
	  }
	  
	  int result[] = new int[maxLength];
	  
	  if(m.size() > n.size())
	  {
		  for(int i = 0;i<n.size();i++)
		  {
			  result[k] = m.get(k) + n.get(k);
			  k++;
		  }
		  for(int j = k;j<m.size();j++)
		  {
			  result[j] = m.get(j);
		  }
	  }
	  else
	  {
		  for(int i = 0;i<m.size();i++)
		  {
			  result[k] = m.get(k) + n.get(k);
			  k++;
		  }
		  
		  for(int j = k;j<n.size(); j++)
		  {
			  result[j] = n.get(j);
		  }
	  }
	  System.out.println("The sum of the two polynomials is : ");
	  for (int i = 0;i<maxLength-1;i++)
	  {
		  System.out.print(result[i] + "X^" + i + "  " + "+ ");
	  }
	  System.out.print(result[maxLength - 1] + "X^" + (maxLength - 1));
	  System.out.println();
	  
	  return result;
	  
	  
  }//END add
  
  public static int[] subtract(ArrayList<Integer> m,ArrayList<Integer> n)
  {
	  int maxLength;
	  int k = 0;
	  if(m.size() > n.size())
	  {
		  maxLength = m.size();
	  }
	  else
	  {
		  maxLength = n.size();
	  }
	  
	  int result[] = new int[maxLength];
	  
	  if(m.size() > n.size())
	  {
		  for(int i = 0;i<n.size();i++)
		  {
			  result[k] = m.get(k) - n.get(k);
			  k++;
		  }
		  for(int j = k;j<m.size();j++)
		  {
			  result[j] = m.get(j);
		  }
	  }
	  else
	  {
		  for(int i = 0;i<m.size();i++)
		  {
			  result[k] = m.get(k) - n.get(k);
			  k++;
		  }
		  
		  for(int j = k;j<n.size(); j++)
		  {
			  result[j] = n.get(j);
		  }
	  }
	  System.out.println("The difference of the two polynomials is : ");
	  for (int i = 0;i<maxLength-1;i++)
	  {
		  System.out.print(result[i] + "X^" + i + "  " + "+ ");
	  }
	  System.out.print(result[maxLength - 1] + "X^" + (maxLength - 1));
	  System.out.println();
	  
	  return result; 
  }//END subtract
  
  public static int[] multiply(ArrayList<Integer> m,ArrayList<Integer> n)
  {
	  int result[] = new int[m.size() + n.size()];
	  for (int i = 0;i < m.size() + n.size();i++)
	  {
		  result[i] = 0;
	  }
	  for (int i = 0;i<m.size();i++)
	  {
		  for (int j = 0;j<n.size();j++)
		  {
			  result[i + j]=result[i + j] + m.get(i)*n.get(j);
		  }
	  }
	 System.out.println("The product of the polynomials is : ");
	 for (int i = 0;i<m.size() - 1 + n.size()-1;i++)
	  {
		  System.out.print(result[i] + "X^" + i + "  " + "+ ");
	  }
	  System.out.print(result[m.size() + n.size() - 2] + "X^" + (m.size() + n.size() - 2));
	  System.out.println();
	  return result;
	 
  }//END multiply
  
  public static int[] multScal(ArrayList<Integer> m ,int scalar)
  {
	  int result[] = new int[m.size()];
	  for (int i = 0;i < m.size();i++)
	  {
		  result[i] = scalar * m.get(i);
	  }
	  
	  System.out.println("The polynomial obtained after multiplication is : ");
	  System.out.println();
	  
	  for (int i = 0;i < m.size() - 1;i++)
	  {
		  System.out.print(result[i] + "X^" + i + " + ");
	  }
	  
	  System.out.print(result[m.size() - 1] + "X^" + (m.size() - 1));
	  
	  return result;
  }//End multScal
  
  public static int evalN(ArrayList<Integer> m,int n)
  {   
	  int result = 0;
	  for (int i = 0;i<m.size();i++)
	  {
		  result = result + m.get(i) *(int)Math.pow(n, i);
	  }
	  
	  System.out.println("The result of evalN is : " + result);
	  
	  return result;
  }//END evalN
  
  
}//END class  
