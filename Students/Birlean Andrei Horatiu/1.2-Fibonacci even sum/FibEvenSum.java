import java.util.Scanner;

public class FibEvenSum
{
   
   
   public static void main(String[] args)
   {    
	   Scanner keyboard = new Scanner(System.in);
	   
	   System.out.println("Input the number of terms : ");
	   
	   int n = keyboard.nextInt();
	   
	   if (n<=0) 
	   { 
		   throw new  IllegalArgumentException("The number of terms is too small!");
	   }
	   
	   int sum = 0,i = 1;
	   int result[][] = {{1,1},
			             {1,0}};
	   
	   int fibMatrix[][] = {{1,1},
			                {1,0}};
	   
	   while (i<=n)
	   { 
		   
		   if (result[1][0]%2 == 0)
		   {   
			   
			   sum+=result[1][0];
		   }
		   
		   result = multiplyMatrix(result,fibMatrix);
		   
		   
		   i++;
	   }
	   
	   System.out.println("The Fibonacci even sum is : " + sum);
	  
	   
	   
   }
   
   public static int[][] multiplyMatrix(int m[][],int n[][])
   {
	   int a = m[0][0] * n[0][0] + m[0][1] * n[1][0];
	   int b = m[0][0] * n[0][1] + m[0][1] * n[1][1];
	   int c = m[1][0] * n[0][0] + m[1][1] * n[1][0];
	   int d = m[1][0] * n[0][1] + m[1][1] * n[1][1];
	   
	   int aux[][] = {{a,b},{c,d}};
	   
	   return aux;
   }
    
}
