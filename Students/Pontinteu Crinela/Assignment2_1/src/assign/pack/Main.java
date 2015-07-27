package assign.pack;

import java.util.*;
import java.io.File;
import java.io.IOException;


public class Main {

	public static void main(String[] args) throws IOException {

		Polynomial a = new Polynomial();
		Polynomial b = new Polynomial();
		Polynomial c = new Polynomial();

		Scanner diskScanner = new Scanner(new File("pol.txt"));

		a.createPoly(diskScanner);
		b.createPoly(diskScanner);

		System.out.println("The first polynomial is: ");
		a.printPoly();
		System.out.println("The second polynomial is: ");
		b.printPoly();

		Functions f = new Functions();
		String option,op;
		int valueToMultiply = 0,valueToEvaluate = 0;
		
		while (diskScanner.hasNextLine()) {
			option = diskScanner.nextLine();
		
			 if (option.contains("EVAL")){
				  op = option.replace("EVAL ", "");
				  valueToEvaluate = Integer.parseInt(op);
				  option = "EVAL";
			 }
			
			 
			 if (option.contains("MUL_SCAL")){
				  op = option.replace("MUL_SCAL ", "");
				  valueToMultiply = Integer.parseInt(op);
				  option = "MUL_SCAL";
			 }
			
			switch (option) {
			case "ADD":
				System.out.println("The result of a+b:");
				c=f.ADD(a, b);
				c.printPoly();
				break;
			case "SUBTRACT":
				System.out.println("The result of a-b:");
				c=f.SUBTRACT(a, b);
				c.printPoly();
				break;
			case "MULTIPLY":
				System.out.println("The result of a*b:");
				c=f.MULTIPLY(a, b);
				c.printPoly();
				break;
			case "EVAL":
				System.out.println("The evaluation of polynomial a on " + valueToEvaluate+":");
				System.out.println(f.EVAL(a, valueToEvaluate));
				System.out.println("The evaluation of polynomial b on " + valueToEvaluate+":");
				System.out.println(f.EVAL(b, valueToEvaluate));
				break;
			case "MUL_SCAL":
				System.out.println("The multiplication of polynomial a with " + valueToMultiply+":");
				c=f.MUL_SCAL(a, valueToMultiply);
				c.printPoly();
				System.out.println("The multiplication of polynomial b with " + valueToMultiply+":");
				c=f.MUL_SCAL(b, valueToMultiply);
				c.printPoly();
				break;

			default:
				break;
			}  
		}

	}

}