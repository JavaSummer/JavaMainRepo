
public class HelpfulFunctions {
	
	//I will need these attributes for a method called executeCommand
	Polynomial firstPolynomial, secondPolynomial;
	
    public void setFirstPolynomial(Polynomial firstPolynomial) {
		this.firstPolynomial = firstPolynomial;
	}

	public void setSecondPolynomial(Polynomial secondPolynomial) {
		this.secondPolynomial = secondPolynomial;
	}

	//method that returns the degree of a polynomial (has the coefficients array as input)
	static int degree(double [] polynomial){
		
		int size = polynomial.length;
		for (int i = size-1;i>=0;i--){
			
			if (polynomial[i]!=0){
				return i;
			}	
		}	
		return -1;
	}
	

	public void extractPolyMethod(double poly[], String line) {

		String[] parts = line.split(" ");
		int n = parts.length;

		for (int i = 0; i < n; i++) {
			poly[n - i - 1] = (double)Integer.parseInt(parts[i].trim());
		}
	}


	public int separateNumber(String originalString) {

		String[] parts = originalString.split(" ", 2);
		String part2 = parts[1];
		if (parts.length != 2)
			throw new IllegalArgumentException("String not in correct format");
		int nr = Integer.parseInt(part2.trim());
		return nr;
	}
	
	public String executeCommand(String line) {

		String s = "";

		if (line.equals("ADD")) {

			Polynomial result;
			result = Functions.add(firstPolynomial, secondPolynomial);
			s = result.toString();

		}

		if (line.equals("SUBTRACT")) {

			Polynomial result;
			result = Functions.subtract(firstPolynomial, secondPolynomial);
			s = result.toString();
		}

		if (line.equals("MULTIPLY")) {

			Polynomial result;
			result = Functions.multiply(firstPolynomial, secondPolynomial);
			s = result.toString();
		}

		if (line.contains("MUL_SCAL")) {

			int nr = separateNumber(line);
			Polynomial result1, result2;
			result1 = Functions.mulScalar(firstPolynomial, nr);
			result2 = Functions.mulScalar(secondPolynomial, nr);
			s = result1.toString() + " and " + result2.toString();
		}

		if (line.contains("EVAL")) {

			int nr = separateNumber(line);
			double result1, result2;
			result1 = Functions.eval(firstPolynomial, nr);
			result2 = Functions.eval(secondPolynomial, nr);

			s = s+String.valueOf(result1)+" and "+String.valueOf(result2);
		}
		return s;
	}
}
