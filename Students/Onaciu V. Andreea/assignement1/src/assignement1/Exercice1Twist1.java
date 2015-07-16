package assignement1;
/*
 * 
 * Sum of multiplies of 3 or 5 below a number read from the keyboard.
 * 
 */

import java.util.Scanner;

public class Exercice1Twist1 {
	public static void main(String[] args){
	
	System.out.println("Input a number : ");	
	Scanner userInput=new Scanner(System.in);
	long number=userInput.nextLong()-1;
	
	long multiplesOf3=number/3;
	long multiplesOf5=number/5;
	long multiplesOf15=number/15;
	long sum3=multiplesOf3*(multiplesOf3+1)/2;
	long sum5=multiplesOf5*(multiplesOf5+1)/2;
	long sum15=multiplesOf15*(multiplesOf15+1)/2;
	long sum=3*sum3+5*sum5-15*sum15;
	
	System.out.println("The sum of the multiplies of 3 or 5 below "+(number+1)+" is "+ sum);
	
	/****TWIST 2*****/
	System.out.println("An overflow will occur for integer variables at Integer.MAX_VALUE="+Integer.MAX_VALUE);
	System.out.println("An overflow will occur for long variables at Long.MAX_VALUE="+Long.MAX_VALUE);
	userInput.close();
	
	}

}




