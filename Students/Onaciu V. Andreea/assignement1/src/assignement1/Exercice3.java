package assignement1;

/*
 * 
 *  Computing the biggest palindrom number obtain as a product of 2 3 digits numbers.
 * 
 */

public class Exercice3 {
	public static void main(String[] args){

		int max=0;
		    for (int i=999; i>=100; i--)           
		    for (int j=i; j>=100; j--){
		    	 int number=i*j;
		         if (checkPalindrom(number) && max<number){  
	   	 	   	 max=number; 
	   	 	   	 }
	            }
	 System.out.println("The biggest palindrom number of 3 digits product numbers is "+max);
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
