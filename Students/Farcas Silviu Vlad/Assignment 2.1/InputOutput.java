import java.io.*;
import java.util.Scanner;

public class InputOutput {
	public static void main(String[] args) {
		File file = new File("pol.txt");
		File file2 = new File("output.txt");
		Polynomial poliM = new Polynomial();
		Polynomial poliN = new Polynomial();
		Functions f = new Functions();
		int[] coeffN = null;
		int[] coeffM = null;

		try {
			Scanner input = new Scanner(file);
			String coeff = input.nextLine();
			String[] coeffArray = coeff.split(" ");
			int[] coeffInt = new int[coeffArray.length];
			int i;
			for (i = 0; i < coeffArray.length; i++) {
				coeffInt[i] = Integer.parseInt(coeffArray[i]);
			}
			coeffM = poliM.construct(coeffInt);
			coeff = input.nextLine();
			coeffArray = coeff.split(" ");
			coeffInt = new int[coeffArray.length];
			for (i = 0; i < coeffArray.length; i++) {
				coeffInt[i] = Integer.parseInt(coeffArray[i]);
			}
			coeffN = poliN.construct(coeffInt);
			try {
				PrintWriter output = new PrintWriter(file2);
				output.println(poliM.getPoly());
				output.println(poliN.getPoly());
				while (input.hasNextLine()) {
					coeff = input.nextLine();
					if (coeff.equals("ADD")) {
						output.println(f.add(coeffM, coeffN));
					}
					if (coeff.equals("SUBTRACT")) {
						output.println(f.subtract(coeffM, coeffN));
					}
					if (coeff.contains("MUL_SCAL")) {
						coeffArray = coeff.split(" ");
						output.println(f.mulScal(Integer.parseInt(coeffArray[1]), coeffM));
						output.println(f.mulScal(Integer.parseInt(coeffArray[1]), coeffN));
					}
					if (coeff.equals("MULTIPLY")) {
						output.println(f.multiply(coeffM, coeffN));
					}
					if (coeff.contains("EVAL")) {
						coeffArray = coeff.split(" ");
						output.println(f.eval(Integer.parseInt(coeffArray[1]), coeffM));
						output.println(f.eval(Integer.parseInt(coeffArray[1]), coeffN));
					}
					if (coeff.equals("ROOT")) {
						double r = f.root(coeffM);
						if (r == 0 && f.eval(0, coeffM) != 0)
							output.println("Has not real root");
						else
							output.println(r);
						r = f.root(coeffN);
						if (r == 0 && f.eval(0, coeffN) != 0)
							output.println("Has not real root");
						else
							output.println(r);
					}
				}
				output.close();
			} catch (IOException ex) {
				System.out.print("Error");
			}
			input.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Error");
		}

	}
}