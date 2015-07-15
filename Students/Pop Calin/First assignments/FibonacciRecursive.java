package assignments;

public class FibonacciRecursive 
{
	
   public static void main(final String[] args) 
   {
	   
		int sum = 0;
		int firstNumber = 1;
		int secondNumber = 1;
		int nextNumber = 0;
		
		  do 
		  {
				   if ( nextNumber % 2 == 0) 
						sum+= nextNumber;
					
				   nextNumber = firstNumber + secondNumber;
				   firstNumber = secondNumber;
				   secondNumber = nextNumber;
		  }
		  while (nextNumber <=  4000000);
				
		  System.out.println("The sum of Fibonacci even-valued terms lower that 4.000.000 is :" +sum);
			
   }
}










	
