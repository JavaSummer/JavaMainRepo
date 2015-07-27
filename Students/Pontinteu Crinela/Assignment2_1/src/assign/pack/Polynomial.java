package assign.pack;

import java.util.*;

public class Polynomial {

	 int deg; // degree of polynomial
	 int coeff[]; // coefficients

	/**
	 * 
	 * It obtains the coefficients array from a string that repesents a line
	 * from the file (the file is sent as a parameter)
	 */
	public void createPoly(Scanner diskScanner) {

		String fileLine;
		int length, count;

		fileLine = diskScanner.nextLine();

		String strarray[] = fileLine.split(" ");
		int intarray[] = new int[strarray.length];
		length = intarray.length;

		for (count = 0; count < length; count++) {
			intarray[count] = Integer.parseInt(strarray[count]);
		}
	    coeff = new int [20];
		for (count = 0; count < length; count++)
			coeff[count] = intarray[length - count -1];
		deg = count - 1;

	}

	public void printPoly() {

		if (deg > 0) {
			System.out.print(coeff[deg] + "x^" + deg);
			for (int i = deg -1; i >= 0; i--) {
				if (coeff[i] != 0) {

					if ((coeff[i] > 0))
						System.out.print("+" + coeff[i] + "x^" + i);
					else
						System.out.print(coeff[i] + "x^" + i);

				}
			}
		} else
			System.out.println("The polynomial has the degree 0 !");

		System.out.println();
	}
	public void setDegree (int deg ){
		this.deg = deg;
	}
	
	public void setCoeff (int coeff[]){
		this.coeff = coeff;
	}
	
	

}