package polipack;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * @author Marius Bologa
 *
 */
public final class InputOutput {
	/**
	 * 
	 * @param args
	 *            Command line arguments not used.
	 */
	public static void main(final String[] args) {
		Polynomials a = new Polynomials(0, 0);
		Polynomials b = new Polynomials(0, 0);
		Polynomials aux1 = new Polynomials(0, 0);
		Polynomials aux2 = new Polynomials(0, 0);
		try {
			Scanner sc = new Scanner(new File("pol.txt"));
			String line = sc.nextLine();
			String[] numbers = line.split(" ");
			int[] coeffA = new int[numbers.length];
			for (int i = 0; i < numbers.length; i++) {
				coeffA[i] = Integer.parseInt(numbers[i]);
			}
			String line1 = sc.nextLine();
			String[] numbers1 = line1.split(" ");
			int[] coeffB = new int[numbers1.length];
			for (int j = 0; j < numbers1.length; j++) {
				coeffB[j] = Integer.parseInt(numbers1[j]);
			}
			try {
				PrintWriter output = new PrintWriter(new File("output.txt"));
				int length1 = numbers.length - 1;
				int length2 = numbers1.length - 1;
				output.println("First polynomial:");
				for (int i = 0; i < numbers.length; i++) {
					Polynomials auxA = new Polynomials(coeffA[i], length1);
					length1--;
					a = Operations.addition(auxA, aux1);
					aux1 = a;
				}
				output.println(a);
				output.println();
				output.println("Second polynomial:");
				for (int j = 0; j < numbers1.length; j++) {
					Polynomials auxB = new Polynomials(coeffB[j], length2);
					length2--;
					b = Operations.addition(auxB, aux2);
					aux2 = b;
				}
				output.println(b);
				output.println();
				while (sc.hasNextLine()) {
					String line2 = sc.nextLine();
					if (line2.contains("ADD")) {
						Polynomials newPolynomial = Operations.addition(a, b);
						output.println("The sum of the 2 polynomials is:");
						output.println(newPolynomial);
						output.println();
					}
					if (line2.contains("SUBTRACT")) {
						Polynomials newPolynomial = Operations.subtract(a, b);
						output.println("The difference of the 2 polynomials" + " is:");
						output.println(newPolynomial);
						output.println();
					}
					if (line2.contains("MUL_SCAL")) {
						String[] coeffOfThePolynomial = line2.split(" ");
						output.println("The first polynomial multiplied with" + " " + coeffOfThePolynomial[1]);
						output.println(Operations.multiplyByScalar(a, Integer.parseInt(coeffOfThePolynomial[1])));
						output.println();
						output.println("The second polynomial multiplied with" + " " + coeffOfThePolynomial[1]);
						output.println(Operations.multiplyByScalar(b, Integer.parseInt(coeffOfThePolynomial[1])));
						output.println();
					}
					if (line2.contains("MULTIPLY")) {
						Polynomials newPolynomial = Operations.multiply(a, b);
						output.println("The product of the 2 polynomials is:");
						output.println(newPolynomial);
						output.println();
					}
					if (line2.contains("EVAL")) {
						String[] coeffOfThePolynomial = line2.split(" ");
						output.println("The first polynomial evaluated at" + " " + coeffOfThePolynomial[1]);
						output.println(Operations.evaluate(a, Integer.parseInt(coeffOfThePolynomial[1])));
						output.println();
						output.println("The second polynomial evaluated at" + " " + coeffOfThePolynomial[1]);
						output.println(Operations.evaluate(b, Integer.parseInt(coeffOfThePolynomial[1])));
						output.println();
					}
				}
				output.close();
			} catch (IOException ex) {
			}
			sc.close();
		} catch (FileNotFoundException ex) {

		}
	}
}
