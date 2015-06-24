package Package;

import java.util.Scanner;

/**
 * 
 * @author Vlad Dolieanu
 *
 */
public final class Main {
	
	/**
	 * Hiding the constructor.
	 */
	private Main() {		
	}
	
	/**
	 * 
	 * @param args - Arguments from the command line(not used).
	 */
	public static void main(final String[] args) {

		int sum = 0;
		int val;
		int sumFirst, countFirst;
		int sumSecond, countSecond;
		int sumProd, countProd;
		final int firstNumber = 3;
		final int secondNumber = 5;
		final int prodNumber = firstNumber * secondNumber;
		Scanner in = new Scanner(System.in);
		
		val = in.nextInt();
		
		//We add the arithmetic progression of 3, 6, 9, ... to the sum
		if (val % firstNumber != 0) {
			sumFirst = firstNumber + (val - (val % firstNumber));
			countFirst = val / firstNumber;
		} else {
			sumFirst = val;
			countFirst = (val / firstNumber) - 1;
		}
		
		sum += (sumFirst * countFirst) / 2;
		
		//We add the arithmetic progression of 5, 10, 15, ... to the sum
		if (val % secondNumber != 0) {
			sumSecond = secondNumber + (val - (val % secondNumber));
			countSecond = val / secondNumber;
		} else {
			sumSecond = val;
			countSecond = (val / secondNumber) - 1;
		}
		
		sum += (sumSecond * countSecond) / 2;
		
		//We subtract the arithmetic progression of the product of 3 and 5
		//as to avoid counting those numbers twice
		if (val % prodNumber != 0) {
			sumProd = prodNumber + (val - (val % prodNumber));
			countProd = val / prodNumber;
		} else {
			sumProd = val;
			countProd = (val / prodNumber) - 1;
		}
		
		sum -= (sumProd * countProd) / 2;
	
		
		System.out.println(sum);
		in.close();
	}

}
