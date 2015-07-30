package mainpack;

/**
 * 
 * @author alexh
 *
 */
public class Polynomial {

	/**
	 * Polynomial coefficients.
	 */
	private double[] coeff;
	/**
	 * Degree of the polynomial.
	 */
	private int deg;
	
	/**
	 * Default constructor.
	 */
	public Polynomial() {
	}
	
	/**
	 * Copy constructor.
	 * @param pol {@link Polynomial}
	 */
	public Polynomial(final Polynomial pol) {
		this.coeff = pol.coeff;
		this.deg = pol.deg;
		this.calculateDeg();
	}
	
	/**
	 * Constructor with int array.
	 * Used for the poly functions.
	 * IMPORTANT: does not create an array, it references to one!
	 * 
	 * @param coefficients  
	 */
	private Polynomial(final double[] coefficients) {
		this.coeff = coefficients;
		this.deg = coefficients.length;
		this.calculateDeg();
	}
	
	/**
	 * The degree of the polynomial.
	 * @return int
	 */
	public final int getDeg() {
		return this.deg;
	}
	
	/**
	 * Extracts the exponent form the split string.
	 * @param s String
	 * @return int
	 */
	private static int extractExponent(final String s) {
		int exponent = -1;
		
		if ((s.contains("x") || s.contains("X"))) {
			if (!s.contains("^")) {
				exponent = 1;
			} else {
				int posCaret = 0;
				while (posCaret < s.length()	&& s.charAt(posCaret) != '^') {
					posCaret++;
				}
				exponent = Integer.parseInt(s.substring(posCaret + 1));
			}
		} else {
			exponent = 0;
		}
		return exponent;
	}
	
	/**
	 * Extracts the coefficient form the split string.
	 * @param s String
	 * @return double
	 */
	private static double extractCoefficient(final String s) {
		double coefficient = 0;
		
		int posX = 0;
		while (posX < s.length() 
				&& s.charAt(posX) != 'x' && s.charAt(posX) != 'X') {
			posX++;
		}
		
		String temp = s.substring(0, posX);
		if (temp.equals("") || temp.equals("+")) {
			coefficient = 1;
		} else if (temp.equals("-")) {
			coefficient = -1;
		} else {
			coefficient = Double.parseDouble(temp);
		}

		return coefficient;
	}
	
	/**
	 * Constructor with string.
	 * @param coefficients 
	 */
	public Polynomial(final String coefficients) {
		String[] splitCoefficinets = coefficients.split(" ");
		double[] dCoeff = null;
		
		if (coefficients.contains("x") || coefficients.contains("X")) {
			dCoeff = new double[extractExponent(splitCoefficinets[0]) + 1];
			for (int i = 0; i < splitCoefficinets.length; i++) {
				double nextCoeff = extractCoefficient(splitCoefficinets[i]);
				int nextExponent = extractExponent(splitCoefficinets[i]);

				dCoeff[nextExponent] = nextCoeff;
			}
		} else {
			dCoeff = new double[splitCoefficinets.length];
			for (int i = 0; i < dCoeff.length; i++) {
				dCoeff[dCoeff.length - i - 1] =
						Double.parseDouble(splitCoefficinets[i]);
			}	
		}
		
		this.coeff = dCoeff;
		this.deg = dCoeff.length;
		this.calculateDeg();
	}
	
	/**
	 * Recalculates the deg in case of coefficients being 0.
	 */
	private void calculateDeg() {
		int newDeg = this.deg;
		boolean nonZeroFound = false;
		
		for (int i = this.deg - 1; i >= 0 && (!nonZeroFound); i--) {
			if (this.coeff[i] == 0) {
				newDeg--;
			} else {
				nonZeroFound = true;
			}
		}
		this.deg = newDeg;
	}
	
	/* On to the poly functions
	 * 
	 * I decided to keep the methods here as static because this class already
	 * has visibility to the fields I need to use
	 * so I don't have to make a separate package to keep it clean.
	 */
	
	/**
	 * Adds the 2 polys and returns the resulting poly.
	 * @param pol1 {@link Polynomial}
	 * @param pol2 {@link Polynomial}
	 * @return {@link Polynomial}
	 */
	public static Polynomial add(final Polynomial pol1, final Polynomial pol2) {
		int maxSize;
		int minSize;	
		int whichPolHasMaxDeg;
		if (pol1.deg > pol2.deg) {
			maxSize = pol1.deg;
			minSize = pol2.deg;
			whichPolHasMaxDeg = 1;
		} else {
			maxSize = pol2.deg;
			minSize = pol1.deg;
			whichPolHasMaxDeg = 2;
		}
		
		double[] resultCoeff = new double[maxSize];
		for (int i = 0; i < minSize; i++) {
			resultCoeff[i] = pol1.coeff[i] + pol2.coeff[i];
		}
		
		double[] reference;
		if (whichPolHasMaxDeg == 1) {
			reference = pol1.coeff;
		} else {
			reference = pol2.coeff;
		}
		
		for (int i = minSize; i < maxSize; i++) {
			resultCoeff[i] = reference[i];
		}
		
		Polynomial result = new Polynomial(resultCoeff);
		return result;
	}
	
	/**
	 * Subtracts pol2 form pol1 and returns the resulting poly.
	 * @param pol1 {@link Polynomial}
	 * @param pol2 {@link Polynomial}
	 * @return {@link Polynomial}
	 */
	public static Polynomial subtract(final Polynomial pol1, 
									  final Polynomial pol2) {
		int maxSize;
		int minSize;	
		if (pol1.deg > pol2.deg) {
			maxSize = pol1.deg;
			minSize = pol2.deg;
		} else {
			maxSize = pol2.deg;
			minSize = pol1.deg;
		}
		
		double[] resultCoeff = new double[maxSize];
		for (int i = 0; i < minSize; i++) {
			resultCoeff[i] = pol1.coeff[i] - pol2.coeff[i];
		}
		
		if (pol1.deg > pol2.deg) {
			for (int i = minSize; i < maxSize; i++) {
				resultCoeff[i] = pol1.coeff[i];
			}
		} else {
			for (int i = minSize; i < maxSize; i++) {
				resultCoeff[i] = -pol2.coeff[i];
			}
		}

		Polynomial result = new Polynomial(resultCoeff);
		return result;
	}
	
	/**
	 * Multiplies the 2 polys and returns the resulting poly.
	 * @param pol1 {@link Polynomial}
	 * @param pol2 {@link Polynomial}
	 * @return {@link Polynomial}
	 */
	public static Polynomial multiply(final Polynomial pol1, 
									  final Polynomial pol2) {
		int resultDeg = pol1.deg + pol2.deg;
		double[] resultCoeff = new double[resultDeg];
		
		for (int i = 0; i < pol1.deg; i++) {
			for (int j = 0; j < pol2.deg; j++) {
				resultCoeff[i + j] += pol1.coeff[i] * pol2.coeff[j];
			}
		}
		
		Polynomial result = new Polynomial(resultCoeff);
		return result;
	}
	
	/**
	 * Multiplies the poly with the scalar and returns the resulting poly.
	 * @param pol {@link Polynomial}
	 * @param scalar int
	 * @return {@link Polynomial}
	 */
	public static Polynomial multiplyByScalar(final Polynomial pol, 
											  final double scalar) {
		double[] resultCoeff = new double[pol.deg];
		
		for (int i = 0; i < pol.deg; i++) {
			resultCoeff[i] = pol.coeff[i] * scalar;
		}
		
		Polynomial result = new Polynomial(resultCoeff);
		return result;
	}
	
	/**
	 * Evaluates the poly at "value" and returns the result.
	 * @param pol {@link Polynomial}
	 * @param value int
	 * @return long
	 */
	public static double evaluateDouble(final Polynomial pol, 
			  					        final double value) {
		double result = 0;
		
		for (int i = 0; i < pol.deg; i++) {
			double valueAtI = 1;
			for (int j = 0; j < i; j++) {
				valueAtI *= value;
			}
			result += pol.coeff[i] * valueAtI;
		}
		
		return result;
	}
	
	/**
	 * Same as above but returns it as a String.
	 * @param pol {@link Polynomial}
	 * @param value int
	 * @return String
	 */
	public static String evaluate(final Polynomial pol, 
			  					  final double value) {
		return Double.toString(evaluateDouble(pol, value));
	}
	
	/**
	 * Divides pol1 by pol2 and returns the quotient and reminder.
	 * @param pol1 {@link Polynomial}
	 * @param pol2 {@link Polynomial}
	 * @return String[] - up to 2
	 */
	public static Polynomial[] divide(final Polynomial pol1,
								  final Polynomial pol2) {
		Polynomial[] result = {null, null};
		
		if (pol1.deg < pol2.deg) {
			result[0] = new Polynomial("0");
			result[1] = new Polynomial(pol1);
		} else {
			Polynomial remainder = new Polynomial(pol1);
			Polynomial quotient = 
					new Polynomial(new double[pol1.deg - pol2.deg + 1]);
			/* This is necessary since the line above will choose 0 
			 * for the degree and the terms will be changed directly
			 * by field - using "add" would mean creating 2 extra 
			 * objects per iteration.
			 */
			quotient.deg = pol1.deg - pol2.deg + 1;
			
			while (remainder.deg >= pol2.deg) {
				//The next coefficient of the quotient
				double newQTerm = remainder.coeff[remainder.deg - 1] 
						/ pol2.coeff[pol2.deg - 1];
				
				//The polynomial is updated
				quotient.coeff[remainder.deg - pol2.deg] = newQTerm;
				//Creating an array containing only the new term for
				//this iteration so "multiply" can be used.
				double[] tempQuotient = new double[quotient.deg];
				tempQuotient[remainder.deg - pol2.deg] = newQTerm;
				
				remainder = subtract(remainder, multiply(pol2, 
						new Polynomial(tempQuotient)));
			}
		
			result[0] = new Polynomial(quotient);
			result[1] = new Polynomial(remainder);
		}
		
		return result;
	}
	
	//Methods below are related to mathematicalForm
	/**
	 * @return - number of non zero digits it uses - see toString
	 */
	private int coefficientStringLength() {
		int n = 0;
		
		for (double i : this.coeff) {
			if (i != 0) {
				n += Double.toString(i).length();
			}
			//+1 for the sign
			if (i < 0) {
				n++;
			}
		}
		
		return n;
	}
	
	/**
	 * @return - same as above but for the exponent
	 */
	private int exponentStringLength() {
		final int magicNumber = 9;
		int n = 0;
		
		for (int i = 0; i < this.deg; i++) {
			if (this.coeff[i] != 0) {
				if (i <= magicNumber) {
					n++;
				} else {
					n += Integer.toString(i).length();
				}
			}
		}
		return n;
	}
	
	/**
	 * @return - used to know how many "X^ " there will be
	 */
	private int nonZeroCoefficients() {
		int n = 0;
		
		for (double i : this.coeff) {
			if (i != 0) {
				n++;
			}
		}
		
		return n;
	}
	
	/**
	 * Generates a string representing the mathematical form.
	 * @return - String
	 */
	public final String mathematicalForm() {
		//This is for 'x', '^', ' ' and the sing
		final int constantSizeComponent = 4;
		boolean first = true;
		
		StringBuilder result = new StringBuilder(this.coefficientStringLength()
				+ this.exponentStringLength()
				+ this.nonZeroCoefficients() * (constantSizeComponent));
		for (int i = this.deg - 1; i >= 0; i--) {
			if (this.coeff[i] != 0) {
				if (first) {
					first = false;
				} else {
					if (this.coeff[i] > 0) {
						result.append("+");
					} 
				}
				//1 in 1x^k is obsolete
				if (i > 0 && this.coeff[i] == -1) {
					result.append("-");
				} else if (((i > 0) && (this.coeff[i] != 1)) || (i == 0)) {
					if (Math.round(this.coeff[i]) == this.coeff[i]) {
						result.append((int) this.coeff[i]);
					} else {
						result.append(this.coeff[i]);
					}
				}
				//x^0 is obsolete
				if (i != 0) {
					result.append("x");
				}
				//exponent 0 and 1 are obsolete
				if (i > 1) {
					result.append("^");
					result.append(i);
				}
			}
		}
		String resultString = new String(result.toString());
		return resultString;
		
	}
	
	/** testing. */
	public final void testM() {
		final int constantSizeComponent = 3;
		System.out.println(this.coefficientStringLength());
		System.out.println(this.exponentStringLength());
		System.out.println(this.nonZeroCoefficients() * constantSizeComponent);
		System.out.println(this.coeff);
		System.out.println(this.deg);
		System.out.println(this.toString());
	}
}
