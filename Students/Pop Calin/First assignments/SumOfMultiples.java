package assignments;

import java.util.Scanner;

public class SumOfMultiples 
{
    public static void main(String[] args)
    {
    	Scanner keyboardNumber=new Scanner(System.in);
    	
    	System.out.print("Give your number:");
        int number = keyboardNumber.nextInt();
    	
        long sumOfMultiples3 = sumOfMultiples(number-1 , 3);
    	long sumOfMultiples5 = sumOfMultiples(number-1 , 5);
    	long sumOfMultiples15 = sumOfMultiples(number-1 , 15);
    	
    	long finalSum = (sumOfMultiples3 + sumOfMultiples5) - sumOfMultiples15;
    	
    	System.out.println("Sum of multiples of 3 and 5 lower than " + number + " is " + finalSum );
    	
    	System.out.println("\nAn overflow will occur for any number greater or egual to 6287188345L ,for a long variabile");
    	System.out.println("An overflow will occur for any number greater than "+Integer.MAX_VALUE +" for an integer variabile");
   
    	    	
    }     
   
        		
        		
   public static long sumOfMultiples( long number, int x)
   {
	  long sum;
	  sum = ( (number/x * (number/x + 1)) / 2) *x;
	  
	  return sum;
	   
   }
   
}