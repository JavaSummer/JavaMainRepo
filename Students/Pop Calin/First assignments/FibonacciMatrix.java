package assignments;

public class FibonacciMatrix 
{
	
	    public static void main(String[] args) 
	    {
			
				int limit=4000000;
			    int fibIndex = 0;
			    int sum = 0;
				while (fibonacci(fibIndex) < limit) 
				{
					int n = fibonacci(fibIndex);
					if (n % 2 == 0) sum+=n;
					fibIndex++;
				}
				
        System.out.println("The sum of Fibonacci even-valued terms lower that "+limit+ " is: " +sum);
		}
		
									
		public static int[][] matrix(int[][] n, int [][] m) 
		{
			    int a = n[0][0] * m[0][0] +  n[0][1] * m[1][0];
			    int b = n[0][0] * m[0][1] +  n[0][1] * m[1][1];
			    int c = n[1][0] * m[0][0] +  n[1][1] * m[1][0];
			    int d = n[1][0] * m[0][1] +  n[1][1] * m[1][1];
			    
			    int z[][]={ {0,0},{0,0} };
			    
			    z[0][0]=a;
			    z[0][1]=b;
			    z[1][0]=c;
			    z[1][1]=d;
			    
		                               
			    return z;
                   
		}
			
		public static int fibonacci(int fibIndex) 
		{
		
		        int[][] result = {{ 1,0 }, 
		        				  { 0,1 }};
		                                             
		        int[][] fibonacciMatrix =    {{ 1,1 }, 
  				                              { 1,0 }};
		        
		
		        while (fibIndex > 0) 
		        {
		            if (fibIndex % 2 == 1) 
		                   result = matrix(result, fibonacciMatrix);
		            
		            fibIndex = fibIndex / 2;
		            fibonacciMatrix = matrix(fibonacciMatrix, fibonacciMatrix);
	            }
		
		        return result[1][0];
		 }
}
