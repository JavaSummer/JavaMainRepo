
public class MainClass {

	public static void main(String[] args) {
	InputOutput file = new InputOutput();
	file.openFiles();
	int a[] = file.readCoefficients();
	int b[] = file.readCoefficients();
	int n = a.length;
	int m = b.length;
	Polynomial x=new Polynomial(n,a);
	Polynomial y=new Polynomial(m,b);
	String commands[] = file.readCommands();
	int length = commands.length;
	file.writingFile("The first polynomial is: ");
	file.writingFile("\t" + x);
	file.writingFile("The first polynomial is: ");
	file.writingFile("\t" + y);

	for (int i = 0; i < length; i++) {
		String command[] = new String[2];
		if (commands[i] != null) {
			command = commands[i].split(" ");

			switch (command[0]) {
			case "ADD":
				file.writingFile("The result of the addition of these two polynomials is: ");
				Polynomial result = Functions.add(x,y);
				file.writingFile("\t" + result);
				break;
			case "SUBSTRACT":
				 file.writingFile("The result of the substraction of these two polynomials is: ");
				 result = Functions.substract(x,y);
				 file.writingFile("\t" + result);
				 break;
			case "MULTIPLY":
				file.writingFile("The result of the multiplication of these two polynomials is: ");
				 result = Functions.multiply(x,y);
				 file.writingFile("\t" + result);
				break;
			case "EVAL":
				int scalar = Integer.parseInt(command[1]);
				int result2 = Functions.eval(x, scalar);
				String proposition = "The result of the evaluation of the first polynomial with the scalar "
						+ Integer.toString(scalar) + " is " + Integer.toString(result2);
				file.writingFile(proposition);
				result2 = Functions.eval(y, scalar);
				String proposition1 = "The result of the evaluation of the second polynomial with the scalar "
						+ Integer.toString(scalar) + " is " + Integer.toString(result2);
				file.writingFile(proposition1);
				break;
			case "MUL_SCAL":
				int scalar1 = Integer.parseInt(command[1]);
				file.writingFile("The first polynomial after the multiplication with the scalar "
						+ Integer.toString(scalar1) + " is: ");
				 result = Functions.mul_scal(x, scalar1);
				file.writingFile("\t" + result);
				file.writingFile("The second polynomial after the multiplication with the scalar "
						+ Integer.toString(scalar1) + " is: ");
				result = Functions.mul_scal(y, scalar1);
				file.writingFile("\t" + result);
				break;
			default:
				break;
			}
		}
	}
	file.closeFile();
}
}