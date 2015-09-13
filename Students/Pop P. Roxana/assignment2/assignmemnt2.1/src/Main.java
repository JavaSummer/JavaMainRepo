
import java.io.IOException;

public class Main {

public static void main(String[] args) throws IOException {

		
		HelpfulFunctions obj = new HelpfulFunctions();
		double[] coeff1 = new double[20], coeff2 = new double[20];
		Polynomial firstPoly, secPoly;
		
		IO ioObject = new IO();
		ioObject.creatingBufferReader("readme.txt");
		ioObject.readPolynomial(coeff1);
		ioObject.readPolynomial(coeff2);
		firstPoly = new Polynomial(coeff1, HelpfulFunctions.degree(coeff1));
		secPoly = new Polynomial(coeff2, HelpfulFunctions.degree(coeff2));
		obj.setFirstPolynomial(firstPoly);
		obj.setSecondPolynomial(secPoly);
		ioObject.readEmptyLine();
		
		try {
			String s = "lets initialize you";
			 
			ioObject.creatingBufferWriter("output.txt");
			
			String command = ioObject.readCommand();
			while (command != null) {
				
				if (command!= null){
					s=obj.executeCommand(command);
					ioObject.writeToFile(s);
					command = ioObject.readCommand();
				}
			}
			
			ioObject.closeBufferWriter();
			System.out.println("Done");
 
		} catch (IOException e) {
			e.printStackTrace();
		}

		//root approximation methods
		double [] coeff = {15, -8, 1};
		Polynomial poly = new Polynomial(coeff,HelpfulFunctions.degree(coeff));
		RootAproximation obj2 = new RootAproximation();
		System.out.println("The root is, by bisection method "+obj2.bisectionMethod(poly,1,4));
		System.out.println("The root is, by linear interpolation method "+obj2.interpolationMethod(poly,1,4));
		
		//division 
	    Division divObj = new Division();
		Polynomial [] divResult = new Polynomial[2];
		double [] a ={-42,0,-12,1}; 
		double [] b ={-3,1,0,0}; 
		Polynomial aPoly = new Polynomial(a,HelpfulFunctions.degree(a));
		Polynomial bPoly = new Polynomial(b,HelpfulFunctions.degree(b));
		divResult = divObj.polyDivision(aPoly, bPoly);
		System.out.println("The quotient is ");
	    String s = divResult[1].toString();
		System.out.println(s);
		System.out.println("The remainder is ");
	    String s1 = divResult[0].toString();
		System.out.println(s1);
		
	}
}
