package assignments;

public class LargestPalindrom 
{
	
	
		public static void main(String[] args)
		{
			
			largestPalindrom(999,100);
			largestPalindrom(9999,1000);
		}	
				
		
		public static boolean palindrom(int number)
		{
			int numberPalindrom = 0;
			int numberOriginal = number;
			
			while (numberOriginal>0)
			{
				numberPalindrom = 10 * numberPalindrom + numberOriginal % 10;
				numberOriginal /= 10;
			}
			
			if (number == numberPalindrom)
				  return true;
			else
				  return false;
		}
		
		public static void largestPalindrom(int sup, int inf)
		{

			int maxI = 0;
			int maxJ= 0;
			int maxPalindrom = 0;
			
			for (int i=sup;i>=inf;i--)
				for (int j=sup;j>=inf;j--)
				{
					if (palindrom(i*j) == true  && (i*j)> maxPalindrom)
					{
						maxPalindrom=(i*j);
						maxI=i;
						maxJ=j;
					}
				}
			System.out.println("Largest palindrome : "+ maxI +" * "+ maxJ +" = "+maxPalindrom);

		}
}