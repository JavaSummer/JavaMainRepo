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
public final class Polynomials {
	/**
	 * 
	 */
	private int[] coefficient = null; 
	/**
	 * 
	 */
	private int degree; 

	/**
	 * 
	 * @param a
	 *            Representing the coefficient of the polynomial.
	 * @param b
	 *            Representing the degree of the polynomial.
	 */
	private Polynomials(final int a, final int b) {
		coefficient = new int[b + 1];
		coefficient[b] = a;
		degree = getDegree();
	}

	/**
	 * 
	 * @param a
	 *            Coefficient of the first polynomial.
	 * @param b
	 *            Coefficient of the second polynomial.
	 * @return Maximum between the coefficients.
	 */
	private static int maxDegree(final int a, final int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	/**
	 * 
	 * @return The degree of the polynomial.
	 */
	private int getDegree() {
		int d = 0;
		for (int i = 0; i < coefficient.length; i++) {
			if (coefficient[i] != 0) {
				d = i;
			}
		}
		return d;
	}

	/**
	 * 
	 * @param a
	 *            First polynomial A.
	 * @param b
	 *            Second polynomial B.
	 * @return The resulting polynomial after adding 2 polynomials.
	 */
	private static Polynomials plus(final Polynomials a, final Polynomials b) {
		Polynomials c = new Polynomials(0, maxDegree(a.degree, b.degree));
		for (int i = 0; i <= a.degree; i++) {
			c.coefficient[i] += a.coefficient[i];
		}
		for (int i = 0; i <= b.degree; i++) {
			c.coefficient[i] += b.coefficient[i];
		}
		c.degree = c.getDegree();
		return c;
	}

	/**
	 * 
	 * @param a
	 *            First polynomial A.
	 * @param b
	 *            Second polynomial B.
	 * @return The resulting polynomial after subtracting 2 polynomials.
	 */
	private static Polynomials minus(final Polynomials a, final Polynomials b) {
		Polynomials c = new Polynomials(0, maxDegree(a.degree, b.degree));
		for (int i = 0; i <= a.degree; i++) {
			c.coefficient[i] += a.coefficient[i];
		}
		for (int i = 0; i <= b.degree; i++) {
			c.coefficient[i] -= b.coefficient[i];
		}
		c.degree = c.getDegree();
		return c;
	}

	/**
	 * 
	 * @param a
	 *            First polynomial A.
	 * @param b
	 *            Second polynomial B.
	 * @return The resulting polynomial after multiplying 2 polynomials.
	 */
private static Polynomials multiply(final Polynomials a, final Polynomials b) {

		Polynomials c = new Polynomials(0, a.degree + b.degree);
		for (int i = 0; i <= a.degree; i++) {
			for (int j = 0; j <= b.degree; j++) {
				c.coefficient[i + j] += (a.coefficient[i] * b.coefficient[j]);
			}
		}
		c.degree = c.getDegree();
		return c;
	}

	/**
	 * 
	 * @param a
	 *            A polynomial.
	 * @param x
	 *            An integer.
	 * @return Another polynomial whose coefficients were multiplied with a
	 *         scalar.
	 */
private static Polynomials multiplyScalar(final Polynomials a, final int x) {

		Polynomials c = new Polynomials(0, a.degree);
		for (int i = 0; i <= a.degree; i++) {
			c.coefficient[i] = (a.coefficient[i] * x);
		}
		c.degree = c.getDegree();
		return c;
	}

	/**
	 * 
	 * @param x
	 *            An integer where the polynomial is evaluated.
	 * @return The value of the polynomial in that point.
	 */
	private int evaluate(final int x) {
		int value = 0;
		for (int i = degree; i >= 0; i--) {
			value = coefficient[i] + (x * value);
		}
		return value;
	}

	/**
	 * 
	 * @return The mathematical form of the polynomials.
	 */
	public String toString() {
		if (degree == 0) {
			return "" + coefficient[0];
		}
		if (degree == 1) {
			return coefficient[1] + "x + " + coefficient[0];
		}
		String s = coefficient[degree] + "x^" + degree;
		for (int i = degree - 1; i >= 0; i--) {
			if (coefficient[i] == 0) {
				continue;
			} else if (coefficient[i] > 0) {
				s = s + " + " + (coefficient[i]);
			} else if (coefficient[i] < 0) {
				s = s + " - " + (-coefficient[i]);
			}
			if (i == 1) {
				s = s + "x";
			} else if (i > 1) {
				s = s + "x^" + i;
			}
		}
		return s;
	}

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
					a = plus(auxA, aux1);
					aux1 = a;
				}
				output.println(a);
				output.println();
				output.println("Second polynomial:");
				for (int j = 0; j < numbers1.length; j++) {
					Polynomials auxB = new Polynomials(coeffB[j], length2);
					length2--;
					b = plus(auxB, aux2);
					aux2 = b;
				}
				output.println(b);
				output.println();
				while (sc.hasNextLine()) {
					String line2 = sc.nextLine();
					if (line2.contains("ADD")) {
						Polynomials newPolynomial = plus(a, b);
						output.println("The sum of the 2 polynomials is:");
						output.println(newPolynomial);
						output.println();
					}
					if (line2.contains("SUBTRACT")) {
						Polynomials newPolynomial = minus(a, b);
						output.println("The difference of the 2 polynomials" 
						+ " is:");
						output.println(newPolynomial);
						output.println();
					}
					if (line2.contains("MUL_SCAL")) {
						String[] coeffOfThePolynomial = line2.split(" ");
						output.println("The first polynomial multiplied with"
						+ " " + coeffOfThePolynomial[1]);
						output.println(multiplyScalar(a, Integer.parseInt(
								coeffOfThePolynomial[1])));
						output.println();
						output.println("The second polynomial multiplied with" 
						+ " " + coeffOfThePolynomial[1]);
						output.println(multiplyScalar(b, Integer.parseInt(
								coeffOfThePolynomial[1])));
						output.println();
					}
					if (line2.contains("MULTIPLY")) {
						Polynomials newPolynomial = multiply(a, b);
						output.println("The product of the 2 polynomials is:");
						output.println(newPolynomial);
						output.println();
					}
					if (line2.contains("EVAL")) {
						String[] coeffOfThePolynomial = line2.split(" ");
						output.println("The first polynomial evaluated at" 
						+ " " + coeffOfThePolynomial[1]);
						output.println(a.evaluate(Integer.parseInt(
								coeffOfThePolynomial[1])));
						output.println();
						output.println("The second polynomial evaluated at" 
						+ " " + coeffOfThePolynomial[1]);
						output.println(b.evaluate(Integer.parseInt(
								coeffOfThePolynomial[1])));
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
