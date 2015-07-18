package assignement1;

/*
 * 
 * Fibonacci in O(log n) 
 * 
 * 
 */

import java.util.Scanner;
public class Exercice2Twist2 {
	 public static void main(String[] args)
	   {
		Scanner userInput=new Scanner(System.in);
		System.out.println ("Which term of the Fibbonacci sequence do you wanna know ? ");
		int term=userInput.nextInt();
		
		if (term<=0) 
			System.out.println("Enter a pozitive number.");
		else 
			System.out.println("The "+term+"th of the Fibbonacci sequence is "+ fiboCalc(term));
		
		userInput.close();
	   }

	 public static int fiboCalc(int term){
		 
		return findMatrixPower(term)[0][0];
	 }
	 
	 
	 /***Recursive method of finding the Nth power of a matrix in O(log n) time ***/
	 
	 public static int[][] findMatrixPower(int term){
		 int M[][]={{1,1},{1,0}};
		 if (term==1) return M;
		 else{
			 int R[][]=findMatrixPower(term/2);
		     R=multiplyMatrices(R,R);
		     if (term%2==1)  R=multiplyMatrices(R,M);
		     return R;
		 }
		 			 
	 }
	 
	 public static int[][]  multiplyMatrices(int f[][],int f1[][]){
		 
		 int x=f[0][0]*f1[0][0]+f[0][1]*f1[1][0];
		 int y=f[0][0]*f1[0][1]+f[0][1]*f1[1][1];
		 int z=f[1][0]*f1[0][0]+f[1][1]*f1[1][0];
		 int w=f[1][0]*f1[0][1]+f[1][1]*f1[1][1];
		 f[0][0]=x;
		 f[0][1]=y;
		 f[1][0]=z;
		 f[1][1]=w;
		 return f; 
		 	 
	 }
}
