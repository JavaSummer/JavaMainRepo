package assignement1;

/*
 * 
 * Computing the biggest palindrom number obtain as a product of 2 4 digits numbers.
 * 
 */

public class Exercice3Twist {
	public static void main(String[] args){
		int max=0;
		for (int i=9999; i>=1000; i--)           
	    for (int j=i; j>=1000; j--){
	    	 int number=i*j;
	         if (checkPalindrom(number) && max<number){  
   	 	   	 max=number; 
   	 	   	 }
            }
	 System.out.println("The biggest palindrom number of 4 digits product numbers is "+max);
	}
	public static boolean checkPalindrom(int number){
		int check=number;
		int reverse=0;
		while (check>0){
			reverse= reverse*10+check%10;
			check=check/10;			
		}
		if (number==reverse) return true;
		else return false;
		
	}

}