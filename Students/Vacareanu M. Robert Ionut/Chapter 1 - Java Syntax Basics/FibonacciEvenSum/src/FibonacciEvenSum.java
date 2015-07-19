import java.lang.Math;
public class FibonacciEvenSum {
	static void evenSum(){
		int x=1, y=2, sum=0;
		while(y<4000000){
			if(y%2 == 0) sum+=y;
			y+=x;
			x=y-x;
		}
		System.out.println("The sum is " + sum);
	}
	// O(n) Fibonacci Calculator
	static int fibonacciCalculator(int term){
		int y=0, x=1, aux;
		for(int i=1; i<term; i++){
			aux = y;
			y=x;
			x=x+aux;
		}
		return x;
	}
	/*
	 * 
	 * O(logn) Fibonacci Calculator
	 *
	 */
	// [2][2] Matrices multiplication
	static int[][] twoMatrixMultiplication(int matrix1[][], int matrix2[][]){
		int[][] result = new int[2][2];
		result[0][0]=matrix1[0][0] * matrix2[0][0] + matrix1[0][1] * matrix2[1][0];
		result[0][1]=matrix1[0][0] * matrix2[0][1] + matrix1[0][1] * matrix2[1][1];
		result[1][0]=matrix1[1][0] * matrix2[0][0] + matrix1[1][1] * matrix2[1][0];
		result[1][1]=matrix1[1][0] * matrix2[0][1] + matrix1[1][1] * matrix2[1][1];
		return result;
	}
	
	// Write the number as a sum of 2's powers
	static int[] decompusitionInSumOfTwo(int fibonacciTerm){
		int[] result = new int[8];
		int k=7;
		for(int i=7; i>=0; i--){
			if(fibonacciTerm - Math.pow(2,i)>=0){
				result[k] = 1;
				fibonacciTerm = (int) (fibonacciTerm - Math.pow(2, i));
			}
			k--;
		}
		return result;
	}
	
	static int fastFibonacciCalculator(int term){
		int[][] partialResult = {{1,0}, {0,1}};
		int[] decomposition = decompusitionInSumOfTwo(term);
		for(int i=7; i>=0; i--){
			int[][] auxResult = {{1,1}, {1,0}};
			if(decomposition[i] == 1){
				for(int j=0; j<i; j++){
					auxResult = twoMatrixMultiplication(auxResult, auxResult);
				}
				partialResult = twoMatrixMultiplication(partialResult, auxResult);
				//System.out.println(partialResult[1][0]);
			}
		}
		return partialResult[1][0];
	}
	
	public static void main(String[] args){
		evenSum();
		System.out.println(fastFibonacciCalculator(46));
}
}