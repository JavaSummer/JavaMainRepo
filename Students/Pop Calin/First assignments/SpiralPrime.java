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
		
		
		while (nrPrime == 0 || (double)(nrPrime+1) / (nrLine + nrCol) >= 0.1)
		{ 

			currnetNumber+=nrCol; 
			nrCol++;
			
		
			
	//we are interested only in the elements in the corner of the matrix
    //we add elements to the corner of the matrix and we only check if they are prime if the matrix is a square matrix
			
			currnetNumber+=nrLine; 
			nrLine++;
			if (  prime(currnetNumber)) nrPrime++;
	
			
			if (nrPrime != 0 && (double)(nrPrime+1) / (nrLine + nrCol) < 0.1) break;
			
   //We added a row and a column, so the mtrix has an even number of rows and columns
   //1 is no longer the center of the matrix so this means the main diagonal has changed
			
			currnetNumber+=nrCol; 
			nrCol++;
			
	
			currnetNumber += nrLine; 
			nrLine++;
			if (  prime(currnetNumber)) nrPrime++;
			
	 
		  	
		}
		System.out.println(nrCol+" "+(double)(nrPrime+1) / (nrLine + nrCol));
		
	}

}