import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Polynomials {
	public static void main(String[] args) throws FileNotFoundException {

		InputOutput obj = new InputOutput(new Scanner(new File("pol.txt")), new PrintWriter(new File("out.txt")));
		obj.readFromFile();
		obj.printResults();
	}

}

/**
 * 
 * @author Socaci
 * 
 *         in this class are created the files of input and output and also we
 *         read the information from the file and print it in the corresponding
 *         file
 */
class InputOutput {
	Scanner inputFile;
	PrintWriter outputFile;

	double[] coeff1;
	double[] coeff2;

	private int fileLines = 0;// stores the number of the line in the file

	public InputOutput(Scanner in, PrintWriter out) {

		inputFile = in;
		outputFile = out;
	}

	public void readFromFile() {

		while (inputFile.hasNextLine()) {
			String coeffString;// used to keep the list of coefficients
			String[] coeffArray;// store the array of coefficients that will be
								// converted to double
			if (fileLines == 0) {
				coeffString = inputFile.nextLine();
				coeffArray = coeffString.split(" ");
				coeff1 = new double[coeffArray.length];
				for (int i = 0; i < coeffArray.length; i++) {
					coeff1[i] = Double.parseDouble(coeffArray[i]);
				}
			} else if (fileLines == 1) {
				coeffString = inputFile.nextLine();
				coeffArray = coeffString.split(" ");
				coeff2 = new double[coeffArray.length];
				for (int i = 0; i < coeffArray.length; i++) {
					coeff2[i] = Double.parseDouble(coeffArray[i]);

				}
				break;
			}
			fileLines++;
		}

	}

	public void printResults() {
		while (inputFile.hasNextLine()) {
			Polynomial pol1 = new Polynomial(coeff1);
			Polynomial pol2 = new Polynomial(coeff2);
			Functions obj = new Functions();
			String function = inputFile.nextLine();
			if (function.equals("ADD") == true) {
				Polynomial result = obj.add(pol1, pol2);
				outputFile.println(result.getPolynomial(result.coeff));
				outputFile.println();
			} else if (function.equals("SUBTRACT")) {
				Polynomial result = obj.subtract(pol1, pol2);
				outputFile.println(result.getPolynomial(result.coeff));
				outputFile.println();
			} else if (function.equals("MULTIPLY")) {
				Polynomial result = obj.multiplication(pol1, pol2);
				outputFile.println(result.getPolynomial(result.coeff));
				outputFile.println();
			} else if (function.contains("MUL_SCAL") == true) {
				String[] array = function.split(" ");
				int scalar = Integer.parseInt(array[1]);
				Polynomial result1 = obj.scalarMultiply(pol1, scalar);
				Polynomial result2 = obj.scalarMultiply(pol2, scalar);
				outputFile.println("The first polynomial: " + result1.getPolynomial(result1.coeff));
				outputFile.println("The second polynomial: " + result2.getPolynomial(result2.coeff));
				outputFile.println();

			} else if (function.contains("EVAL") == true) {
				String[] array = function.split(" ");
				int scalar = Integer.parseInt(array[1]);
				double result1 = obj.evalPolynomial(pol1, scalar);
				double result2 = obj.evalPolynomial(pol2, scalar);
				outputFile.println("For the first polynomial: " + result1);
				outputFile.println("For the second polynomial: " + result2);
				outputFile.println();
			} else if (function.equals("DIVISION") == true) {
				Polynomial[] result = obj.division(pol1, pol2);
				outputFile.println("The quotient: " + result[0].getPolynomial(result[0].coeff));
				outputFile.println("The remainder: " + result[1].getPolynomial(result[1].coeff));
				outputFile.println();
			}
		}
		inputFile.close();
		outputFile.close();
	}
}

class Polynomial {

	int polyDegree;
	double[] coeff;

	public Polynomial() {
		polyDegree = 0;
		coeff = new double[1];
	}

	public Polynomial(double[] coeff1) {
		coeff = coeff1;
		polyDegree = coeff.length - 1;
	}

	public int getDegree(double[] coeff) {
		return coeff.length - 1;
	}

	public String getPolynomial(double[] coeff) {
		int degree;
		String pol = "";
		for (int i = 0; i <= this.polyDegree; i++) {
			degree = this.polyDegree - i;
			if (this.polyDegree == 0) {
				pol += Double.toString(coeff[0]);
			} else if (coeff[i] != 0) {
				if (coeff[i] > 0 && i != 0) {
					if (degree == 0) {
						pol += " + " + Double.toString(coeff[i]);
					} else if (degree == 1) {
						if (coeff[i] == 1)
							pol += " + " + "x";
						else
							pol += " + " + Double.toString(coeff[i]) + "x";
					} else {
						if (coeff[i] == 1)
							pol += " + " + "x^" + Integer.toString(degree);
						else
							pol += " + " + Double.toString(coeff[i]) + "x^" + Integer.toString(degree);
					}

				} else if (coeff[i] > 0 && i == 0) {
					if (degree == 0) {
						pol += Double.toString(coeff[i]);
					} else if (degree == 1) {
						if (coeff[i] == 1)
							pol += "x";
						else
							pol += Double.toString(coeff[i]) + "x";
					} else {
						if (coeff[i] == 1)
							pol += "x^" + Integer.toString(degree);
						else
							pol += Double.toString(coeff[i]) + "x^" + Integer.toString(degree);
					}

				} else if (coeff[i] < 0 && i != 0) {
					if (degree == 0) {
						pol += Double.toString(coeff[i]);
					} else if (degree == 1) {
						if (coeff[i] == -1)
							pol += " - " + "x";
						else
							pol += Double.toString(coeff[i]) + "x";
					} else {
						if (coeff[i] == -1)
							pol += " - " + "x^" + Integer.toString(degree);
						else
							pol += Double.toString(coeff[i]) + "x^" + Integer.toString(degree);
					}
				} else if (coeff[i] < 0 && i == 0) {
					if (degree == 0) {
						pol += Double.toString(coeff[i]);
					} else if (degree == 1) {
						if (coeff[i] == -1)
							pol += " - " + "x";
						else
							pol += Double.toString(coeff[i]) + "x";
					} else {
						if (coeff[i] == -1)
							pol += " - " + "x^" + Integer.toString(degree);
						else
							pol += Double.toString(coeff[i]) + "x^" + Integer.toString(degree);
					}
				}
			}
		}
		return pol;
	}
}

class Functions {

	public Polynomial add(Polynomial pol1, Polynomial pol2) {
		int maxDegree, p1 = 0, p2 = 0;
		if (pol1.polyDegree > pol2.polyDegree) {
			maxDegree = pol1.polyDegree;
			p1 = 1;
		} else {
			maxDegree = pol2.polyDegree;
			p2 = 1;
		}
		double[] result = new double[maxDegree + 1];

		for (int i = 0; i <= maxDegree; i++) {
			if (p1 == 1 && maxDegree - i > pol2.polyDegree) {
				result[i] = pol1.coeff[i];
			} else if (p1 == 1 && maxDegree - i <= pol2.polyDegree) {
				result[i] = pol1.coeff[i] + pol2.coeff[pol2.polyDegree - maxDegree + i];
			} else if (p2 == 1 && maxDegree - i > pol1.polyDegree) {
				result[i] = pol2.coeff[i];
			} else if (p2 == 1 && maxDegree - i <= pol1.polyDegree) {
				result[i] = pol2.coeff[i] + pol1.coeff[pol1.polyDegree - maxDegree + i];

			}
		}
		Polynomial finalResult = new Polynomial(result);
		return finalResult;
	}

	public Polynomial subtract(Polynomial pol1, Polynomial pol2) {
		// subtract from the polynomial of maximum degree

		int maxDegree, p1 = 0, p2 = 0;
		if (pol1.polyDegree >= pol2.polyDegree) {
			maxDegree = pol1.polyDegree;
			p1 = 1;
		} else {
			maxDegree = pol2.polyDegree;
			p2 = 1;
		}
		double[] result = new double[maxDegree + 1];

		for (int i = 0; i <= maxDegree; i++) {
			if (p1 == 1 && maxDegree - i > pol2.polyDegree) {
				result[i] = pol1.coeff[i];
			} else if (p1 == 1 && maxDegree - i <= pol2.polyDegree) {
				result[i] = pol1.coeff[i] - pol2.coeff[pol2.polyDegree - maxDegree + i];

			} else if (p2 == 1 && maxDegree - i > pol1.polyDegree) {

				result[i] = pol2.coeff[i];
			} else if (p2 == 1 && maxDegree - i <= pol1.polyDegree) {
				result[i] = pol2.coeff[i] - pol1.coeff[pol1.polyDegree - maxDegree + i];

			}
		}

		Polynomial finalResult = new Polynomial(result);

		while (finalResult.coeff[0] == 0 && finalResult.polyDegree > 0) {
			for (int i = 0; i < finalResult.polyDegree; i++) {
				finalResult.coeff[i] = finalResult.coeff[i + 1];
			}
			finalResult.polyDegree--;
		}
		return finalResult;
	}

	public Polynomial multiplication(Polynomial pol1, Polynomial pol2) {

		double[] result = new double[pol1.polyDegree + pol2.polyDegree + 1];

		for (int i = 0; i <= pol1.polyDegree; i++) {
			for (int j = 0; j <= pol2.polyDegree; j++) {
				result[i + j] += pol1.coeff[i] * pol2.coeff[j];
			}
		}
		Polynomial finalResult = new Polynomial(result);
		return finalResult;
	}

	public Polynomial scalarMultiply(Polynomial pol1, int scalar) {

		double[] coeff = new double[pol1.coeff.length];
		for (int i = 0; i <= pol1.polyDegree; i++) {
			coeff[i] = pol1.coeff[i] * scalar;
		}
		Polynomial result = new Polynomial(coeff);
		return result;

	}

	public double evalPolynomial(Polynomial pol1, int scalar) {
		// use Horner's rule
		double result = 0;
		for (int i = 0; i <= pol1.polyDegree; i++)
			result = pol1.coeff[i] + result * scalar;
		return result;
	}

	public Polynomial[] division(Polynomial pol1, Polynomial pol2) {
		// consider the degree of pol1 is greater than that of pol2
		if (pol2.coeff != null) {
			Polynomial quotient = new Polynomial();
			Polynomial remainder = new Polynomial(pol1.coeff);
			Polynomial[] result = new Polynomial[2];

			while (remainder != null && remainder.polyDegree >= pol2.polyDegree) {

				double[] coeff = new double[remainder.polyDegree - pol2.polyDegree + 1];
				coeff[0] = remainder.coeff[0] / pol2.coeff[0];// divide the
																// leading
																// coefficients
				Polynomial t = new Polynomial(coeff);

				quotient = add(quotient, t);

				remainder = subtract(remainder, multiplication(t, pol2));

			}

			result[0] = quotient;
			result[1] = remainder;
			return result;
		}
		return null;
	}

}
