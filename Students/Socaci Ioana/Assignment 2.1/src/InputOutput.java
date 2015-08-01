import java.io.PrintWriter;
import java.util.Scanner;

public class InputOutput {
	
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
				outputFile.println(result.toString());
				outputFile.println();
			} else if (function.equals("SUBTRACT")) {
				Polynomial result = obj.subtract(pol1, pol2);
				outputFile.println(result.toString());
				outputFile.println();
			} else if (function.equals("MULTIPLY")) {
				Polynomial result = obj.multiplication(pol1, pol2);
				outputFile.println(result.toString());
				outputFile.println();
			} else if (function.contains("MUL_SCAL") == true) {
				String[] array = function.split(" ");
				int scalar = Integer.parseInt(array[1]);
				Polynomial result1 = obj.scalarMultiply(pol1, scalar);
				Polynomial result2 = obj.scalarMultiply(pol2, scalar);
				outputFile.println("The first polynomial: " + result1.toString());
				outputFile.println("The second polynomial: " + result2.toString());
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
				outputFile.println("The quotient: " + result[0].toString());
				outputFile.println("The remainder: " + result[1].toString());
				outputFile.println();
			}
		}
		inputFile.close();
		outputFile.close();
	}
}
