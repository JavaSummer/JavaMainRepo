import java.io.*;
import java.text.*;
import java.util.Scanner;

import org.omg.CORBA.INTERNAL;
/*
 * The file is printed like this:
 * 0 1 2 4 => 0*x^0 + 1*x^1 + 2*x^2 + 4*x^3
 * Coefficients are stored in an array so that array[0] is the coefficient for
 * term x^0, array[3] is the coefficient for term x^3
 * 
 */
class InputOutput {
	Functions Functions = new Functions();
	private Polynomials createPolynomialFromFile(String line) {
		String[] coeff = line.split(" ");
		int[] coeffOfPolynomial = new int[coeff.length];
		int copyOfLength = coeff.length;
		for (int i = 0; i < coeff.length; i++) {
			coeffOfPolynomial[copyOfLength-1] = Integer.parseInt(coeff[i]);
			copyOfLength--;
		}
		Polynomials pol1 = new Polynomials(coeffOfPolynomial);
		return pol1;
	}
	/*
	 *  This method assumes that the exponent of the first term is the biggest
	 *  Could have performed a getMax from the resulted array to get the biggest exponent instead
	 */

	private Polynomials createPolFromFileMathForm(String line){
		String copyOfLine = line;
		copyOfLine = copyOfLine.replace("x", "");
		copyOfLine = copyOfLine.replace("^", "");
		copyOfLine = copyOfLine.replace("+", "");
		copyOfLine = copyOfLine.replace("*", "");
		String[] coeff = copyOfLine.split(" ");
		int[] coeffOfPolynomial = new int[Integer.parseInt(coeff[1])+1]; // The exponent of the first term is the biggest
		for(int i=1; i<=coeff.length; i+=2){
			coeffOfPolynomial[Integer.parseInt(coeff[i])] = Integer.parseInt(coeff[i-1]);
		}
		Polynomials pol1 = new Polynomials(coeffOfPolynomial);
		return pol1;
	}

	private void printFile(PrintWriter output, Polynomials result) {
		for(int i: result.getAllCoefficients()){
			output.print(i + " ");
		}
		output.printf("%n");
	}

	private void printFile(PrintWriter output, int number) {
		output.print(number);
		output.printf("%n");
	}
	
	private void printFile(PrintWriter output, double number) {
		output.print(number);
		output.printf("%n");
	}
	/**
	 * 
	 * An utility that prints an array in math form like: 3*x^2 + 4*x;
	 */
	private void printInMathForm(PrintWriter output, Polynomials pol1){
		for(int i=0; i<pol1.getLength(); i++){
			String sign = new String();
			if(Math.signum(pol1.getCoefficients(i)) != -1) sign ="+";
			else sign = "";
			output.printf("%s%dx^%d ", sign, pol1.getCoefficients(i), i);
		}
		output.printf("%n");
	}
	/**
	 * 
	 * Read and Write on the file
	 */
	void fileProcessing(Polynomials pol1, Polynomials pol2) {
		File inputFile = new File("input.txt");
		File outputFile = new File("output.txt");
		int linesRead = 0;
		try {
			Scanner input = new Scanner(inputFile);
			PrintWriter output = new PrintWriter(outputFile);

			while (input.hasNextLine()) {
				String line = input.nextLine();
				linesRead++;
				// Read the coefficients in the next 2 lines
				if (linesRead == 1) {
					pol1 = createPolynomialFromFile(line);
				} else if (linesRead == 2) {
					pol2 = createPolynomialFromFile(line);
				}

				else {
					int number;
					Polynomials result = new Polynomials(Math.max(pol1.getLength(), pol2.getLength()));
					int evaluation;
					if (line.contains("ADD")) {
						result = Functions.addition(pol1, pol2);
						printFile(output, result);
					}
					if (line.contains("SUBTRACT")) {
						result = Functions.subtraction(pol1, pol2);
						printFile(output, result);
					}
					if (line.contains("MULTIPLY")) {
						result = Functions.multiplication(pol1, pol2);
						printFile(output, result);
					}
					if (line.contains("MUL_SCAL")) {
						number = Integer.parseInt(line.replaceAll("[\\D]", ""));
						result = Functions.scalarMultiplication(pol1, number);
						printFile(output, result);
					}
					if (line.contains("EVAL")) {
						number = Integer.parseInt(line.replaceAll("[\\D]", ""));
						evaluation = (int) Functions.evaluate(pol1, number);
						printFile(output, evaluation);
					}
					if (line.contains("DIVISION")) {
						Polynomials[] division = Functions.division(pol1, pol2);
						output.println("Division: ");
						output.printf("Quotient:%n");
						printFile(output, division[0]);
						output.printf("%nRemainder: %n");
						printFile(output, division[1]);
						output.printf("%n%n");
					}
					if (line.contains("ROOT")) {
						DecimalFormat rounding = new DecimalFormat("###.##");
						double root;
						root = Functions.rootApprox(pol2);
						//Rounding the result
						root = Double.parseDouble(rounding.format(root));
						printFile(output, root);
					}
					if(line.contains("MathForm")){
						readMathForm(pol1, pol2);
						printFile(output, pol2);
					}

				}

			}
			input.close();
			output.close();
		} catch (FileNotFoundException ex) {
			System.out.printf("Error: %s\n", ex);
		}
	}
	/**
	 * 
	 * Reads the polynomial from math form
	 */
	void readMathForm(Polynomials pol1, Polynomials pol2){
		File inputFile = new File("input.txt");
		int linesRead = 0;
		try {
			Scanner input = new Scanner(inputFile);

			while (input.hasNextLine()) {
				String line = input.nextLine();
				linesRead++;
				// Read the coefficients in the next 2 lines
				if (linesRead == 1) {
					pol1 = createPolFromFileMathForm(line);
				} else if (linesRead == 2) {
					pol2 = createPolFromFileMathForm(line);
				}

			}
			input.close();
		} catch (FileNotFoundException ex) {
			System.out.printf("Error: %s\n", ex);
		}
	}
}

class Functions {
	/**
	 * Reverse the sign of an array
	 */
	private int[] coeffReversedSign(int [] coefficients){
		int[] newCoeff = new int[coefficients.length];
		for(int i=0; i<coefficients.length; i++){
			newCoeff[i] = -coefficients[i];
		}
		return newCoeff;
	}
	/**
	 * Adds two different sized arrays
	 * The result is an array with the length equal to the max(array1.length, array2.length)
	 * Is considered that the smaller array have 0 after array2[length-1]
	 * 
	 */
	private int[] addDiffSizedArray(int[] array1, int[] array2){
		int[] result = new int[Math.max(array1.length, array2.length)];
		int i=0;
		if(array1.length > array2.length){
			for(i=0; i<array2.length; i++){
				result[i] = array1[i] + array2[i];
			}
			for(i=array2.length; i<array1.length; i++){
				result[i]=array1[i];
			}
		}
		else if(array1.length < array2.length){
			for(i=0; i<array1.length; i++){
				result[i] = array1[i] + array2[i];
			}
			for(i=array1.length; i<array1.length; i++){
				result[i]=array2[i];
			}
		}
		else{
			for(i=0;i<array1.length; i++){
				result[i] = array1[i] + array2[i];
			}
		}
		
		return result;
	}
	
	Polynomials addition(Polynomials p1, Polynomials p2) {
		Polynomials result = new Polynomials(addDiffSizedArray(p1.getAllCoefficients(), p2.getAllCoefficients()));
		return result;
	}

	Polynomials subtraction(Polynomials p1, Polynomials p2) {
		Polynomials result = new Polynomials(addDiffSizedArray(p1.getAllCoefficients(), coeffReversedSign(p2.getAllCoefficients())));
		return result;
	}

	Polynomials multiplication(Polynomials p1, Polynomials p2) {
		Polynomials result = new Polynomials(p1.getLength() + p2.getLength() - 1);
		Polynomials aux = new Polynomials(p1.getLength() + p2.getLength()-1);
		for (int i = 0; i < p1.getLength(); i++) {
			for (int j = 0; j < p2.getLength(); j++) {
				aux.setCoefficients(i + j, p1.getCoefficients(i) * p2.getCoefficients(j));
			}
			result = addition(result, aux);
			aux.setCoefficients(i, 0);
		}
		return result;
	}

	Polynomials scalarMultiplication(Polynomials p1, int scalar) {
		Polynomials result = new Polynomials(p1.getLength());
		for (int i = 0; i < p1.getLength(); i++) {
			result.setCoefficients(i, scalar * p1.getCoefficients(i));
		}
		return result;
	}

	double evaluate(Polynomials p1, double value) {
		double result = 0;
		if(value == 0) return p1.getCoefficients(0);
		for (int i = 0; i < p1.getLength(); i++) {
			result += p1.getCoefficients(i) * Math.pow(value, i);
		}
		return result;
	}
	/**
	 * 
	 * Division of polynomials using long division
	 * Returns an array of polynomials
	 * The first one is the quotient
	 * The second one is the remainder
	 */
	Polynomials[] division(Polynomials p1, Polynomials p2) {
		
		Polynomials[] division = new Polynomials[2];
		division[0] = new Polynomials(p1.getLength() - p2.getLength()+1); // Quotient
		division[1] = new Polynomials(p2.getLength()-1); // Remainder
		
		Polynomials divider = new Polynomials();
		divider.setToPol(p2);
		Polynomials copyOfDivident = new Polynomials();
		copyOfDivident.setToPol(p1);
		
		Polynomials auxPol = new Polynomials(new int[] { 0, 1 });
		int copyOfLength1 = p1.getLength();
		int copyOfLength2 = p2.getLength();
		
		if(p1.getLength()>0){
			while(copyOfDivident.getLength()>=p2.getLength()){
				for (int i = 0; i < copyOfLength1 - copyOfLength2; i++) {
					divider = multiplication(divider, auxPol);
				}
				division[0].setCoefficients(copyOfDivident.getLength() - p2.getLength(), copyOfDivident.getCoefficients(copyOfDivident.getLength()-1) / divider.getCoefficients(divider.getLength()-1));
				divider = scalarMultiplication(divider, division[0].getCoefficients(copyOfDivident.getLength() - p2.getLength()));
				copyOfDivident = subtraction(copyOfDivident, divider);
				copyOfDivident.setLength(copyOfLength1-1);
				divider.setToPol(p2);
				copyOfLength1--;
			}
		}
		division[1] = subtraction(p1, multiplication(division[0], divider));
		return division;
	}
	/**
	 * Root Approximation using bisection
	 * 
	 */
	double rootApprox(Polynomials p1) {
		double root=0;
		// The initial interval
		double a = Integer.MIN_VALUE;
		double b = Integer.MAX_VALUE;
		//Set a and b
//		if(!(a<b && (evaluate(p1, a)) * evaluate(p1,b) <= 0)){
//			a++;
//			b--;
//		}
		if(evaluate(p1,a)>0){
			a++;
		}
		if(evaluate(p1,b)<0){
			b--;
		}
		double midpoint=0;
		int i = 0;
		// i<=42 for a given tolerance of 0.001
		// Calculated given the biggest interval [b;a]
		while (i <= 42) {
			i++;
			midpoint = (a + b) / 2;
			if (evaluate(p1, midpoint) == 0){
				return midpoint;
				}
			else if (Math.signum(evaluate(p1, midpoint)) == Math.signum(evaluate(p1, a))) {
				a = midpoint;
			} 
			else {
				b = midpoint;
			}
			if(i==42){
				root = midpoint;
			}
		}
		return root;
	}
}

class Polynomials {
	private int[] coefficients;
	private int length;

	Polynomials(int[] data) {
		this.coefficients = data;
		this.length = data.length;
	}

	Polynomials(int length) {
		coefficients = new int[length];
		this.length = length;
	}

	Polynomials() {

	}

	int getLength() {
		return this.length;
	}

	void setLength(int length) {
		this.length = length;
	}

	int[] getAllCoefficients() {
		return this.coefficients;
	}

	void setAllCoefficients(int[] coefficients) {
		this.coefficients = coefficients;
	}

	int getCoefficients(int index) {
		if(index<this.length)
		{
			return this.coefficients[index];
		}
		else{
			return 0;
		}
	}

	void setCoefficients(int index, int data) {
		this.coefficients[index] = data;
	}
	
	void setToPol(Polynomials pol2){
		this.coefficients = pol2.getAllCoefficients();
		this.length = pol2.getLength();
	}
}

public class PolynomialsOperations {

	public static void main(String[] args) {
		InputOutput start = new InputOutput();
		Polynomials pol1 = new Polynomials();
		Polynomials pol2 = new Polynomials();
		start.fileProcessing(pol1, pol2);

	}

}
