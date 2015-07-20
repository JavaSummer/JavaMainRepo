package assignments;



public class SpiralPrime 
{
	
	public static Boolean prime(int number)
	{
		if (number<=1) 
			return false;

		for (int counter=2 ; counter<=Math.sqrt(number); counter ++)
			if (number % counter ==0)
				return false;
		
		return true;
	}
	
	public static void main(String[] args)
	{
		int nrLine = 1; 
		int nrCol = 1;
		int nrPrime = 0;  
		int currnetNumber = 1; 
		double ratio=100;
		
		
		while(nrPrime==0 || ratio > 0.1)
		{ 

			currnetNumber+=nrCol; 
			nrCol++;
		        if (  prime(currnetNumber) && currnetNumber!=2 ) nrPrime++;
		
	
			currnetNumber+=nrLine; 
			nrLine++;
			if (  prime(currnetNumber)) nrPrime++;
 
			
			currnetNumber+=nrCol; 
			nrCol++;
			if (  prime(currnetNumber)) nrPrime++;
			
	
			currnetNumber += nrLine; 
			nrLine++;
			if (  prime(currnetNumber)) nrPrime++;
			
			
	                ratio=(double) nrPrime / (nrCol+nrLine-1); 
		  	
		}
		System.out.println(nrCol+" "+ratio);
		
	}

}
