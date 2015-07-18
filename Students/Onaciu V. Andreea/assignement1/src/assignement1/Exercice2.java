package assignement1;

/*
 * 
 * Fibonacci even sum of terms under 4000000. 
 *
 */

public class Exercice2 {

	public static void main(String[] args){
		int b=1;
		int a=2;
		int sum=0;
		
		while (a<=4000000){
			if (a%2==0) 
				sum+=a;
		int c=a+b;
			b=a;
			a=c;
			
		}
		
		System.out.println("The sum is "+sum+".");
		
						
	}
	
}
