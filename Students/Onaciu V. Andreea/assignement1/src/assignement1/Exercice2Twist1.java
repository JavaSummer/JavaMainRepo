package assignement1;
/*
 * 
 *Fibonacci calculator in O(n) time.
 * 
 */

import java.util.Scanner;

public class Exercice2Twist1 {
	
	
   public static void main(String[] args)
   {
	Scanner userInput=new Scanner(System.in);
	int term=userInput.nextInt();
	
	System.out.println ("Which term of the Fibbonacci sequence do you wanna know ? ");
	
	if (term<=0) 
		System.out.println("Enter a pozitive number.");
	else 
		System.out.println("The "+term+"th of the Fibbonacci sequence is "+ fiboCalc(term));
	
	userInput.close();
   }
   
   public static int fiboCalc(int term){
	   
	   int a=1;
	   int b=2;
	   int c=0;
	   if (term==1) return a;
	   else if (term==2) return b;
	   else {
		   while (term>2){
			   c=a+b;
			   a=b;
			   b=c;
			   term--;
		   }
		   return c;
	   }
   }
   
 
   }

