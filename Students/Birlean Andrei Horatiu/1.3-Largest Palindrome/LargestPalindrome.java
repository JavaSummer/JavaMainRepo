
public class LargestPalindrome 
{
    public static void main(String[] args)
    {
    	int i,j;
    	int number_of_palindromes = 0;
    	int max = Integer.MIN_VALUE;
    	for (i=999;i>=100;i--)
    	{
    		for(j=999;j>=100;j--)
    		{
    			if (isPalindrome(i*j)==true)
    			{
    				number_of_palindromes++;
    				if (i*j>max)
    				{
    					max = i*j;
    				}
    			}
    			
    	    }
    	}	
    	System.out.println("The number of palindromes is : " + number_of_palindromes);
    	System.out.println("The largest palindrome is : " + max);
    }	
    
    
    public static boolean isPalindrome(int n)
    { 
    	int aux = n;
    	
    	int reverse = 0;
    	
    	while (aux>0)
    	{
    		reverse = reverse*10 + (aux%10);
    		aux = aux/10;
    	}
    	
    	if (reverse == n)
    	{
    		return true;
    	}	
    	else
    	{
    		return false;
    	}
    }
}
