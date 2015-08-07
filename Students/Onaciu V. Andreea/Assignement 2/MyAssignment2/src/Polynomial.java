

public class Polynomial {
	public String createPolynomials(int[] coeficients) {
		String polynomial = "";
		int length = coeficients.length;
		for (int i = 0; i < length; i++) {
			if (coeficients[i] != 0) {
				if (i == 0)
					polynomial = ((coeficients[i] == 1) ? "" : coeficients[i]) + "x^" + (length - 1 - i);
				else if (i == length - 2) {
					if (coeficients[i] > 0)
						polynomial = polynomial + "+" + ((coeficients[i] == 1) ? "" : coeficients[i]) + "x";
					else
						polynomial = polynomial + ((coeficients[i] == 1) ? "" : coeficients[i]) + "x";
				} else if (i == length - 1) {
					if (coeficients[i] > 0)
						polynomial = polynomial + "+" + coeficients[i];
					else
						polynomial = polynomial + coeficients[i];
				} else if (coeficients[i] > 0)
					polynomial = polynomial + "+" + ((coeficients[i] == 1) ? "" : coeficients[i]) + "x^"
							+ (length - 1 - i);
				else if (coeficients[i] < 0)
					polynomial = polynomial + ((coeficients[i] == 1) ? "" : coeficients[i]) + "x^" + (length - 1 - i);
			}
		}
		return polynomial;
	}

	public void makingTheProblemWork() {
		Functions f = new Functions();
		InputOutput file = new InputOutput();
		file.openFiles();
		int a[] = file.readCoefficients();
		int b[] = file.readCoefficients();
		int n = a.length;
		int m = b.length;
		String commands[] = file.readCommands();
		int length = commands.length;
		file.writingFile("The first polynomial is: ");
		file.writingFile("\t" + createPolynomials(a));
		file.writingFile("The first polynomial is: ");
		file.writingFile("\t" + createPolynomials(b));

		for (int i = 0; i < length; i++) {
			String command[] = new String[2];
			if (commands[i] != null) {
				command = commands[i].split(" ");

				switch (command[0]) {
				case "ADD":
					file.writingFile("The result of the addition of these two polynomials is: ");
					int result[] = f.add(a, b, n, m);
					String polynomial = createPolynomials(result);
					file.writingFile("\t" + polynomial);
					break;
				case "SUBSTRACT":
					file.writingFile("The result of the substraction of these two polynomials is: ");
					int result0[] = f.substract(a, b, n, m);
					String polynomial0 = createPolynomials(result0);
					file.writingFile("\t" + polynomial0);
					break;
				case "MULTIPLY":
					file.writingFile("The result of the multiplication of these two polynomials is: ");
					int result1[] = f.multiply(a, b, n, m);
					String polynomial1 = createPolynomials(result1);
					file.writingFile("\t" + polynomial1);
					break;
				case "EVAL":
					int scalar = Integer.parseInt(command[1]);
					int result2 = f.eval(a, n, scalar);
					String proposition = "The result of the evaluation of the first polynomial with the scalar "
							+ Integer.toString(scalar) + " is " + Integer.toString(result2);
					file.writingFile(proposition);
					result2 = f.eval(b, m, scalar);
					String proposition1 = "The result of the evaluation of the second polynomial with the scalar "
							+ Integer.toString(scalar) + " is " + Integer.toString(result2);
					file.writingFile(proposition1);
					break;
				case "MUL_SCAL":
					int scalar1 = Integer.parseInt(command[1]);
					file.writingFile("The first polynomial after the multiplication with the scalar "
							+ Integer.toString(scalar1) + " is: ");
					int[] result3 = f.mul_scal(a, n, scalar1);
					String polynomial2 = createPolynomials(result3);
					file.writingFile("\t" + polynomial2);
					file.writingFile("The second polynomial after the multiplication with the scalar "
							+ Integer.toString(scalar1) + " is: ");
					result3 = f.mul_scal(b, m, scalar1);
					polynomial2 = createPolynomials(result3);
					file.writingFile("\t" + polynomial2);
					break;
				default:
					break;
				}
			}
		}
		file.closeFile();
	}

}

