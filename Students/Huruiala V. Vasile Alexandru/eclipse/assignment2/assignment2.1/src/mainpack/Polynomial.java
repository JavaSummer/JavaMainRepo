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
	 * Constructor with double array.
	 * Used for the polynomial functions.
	 * IMPORTANT: does not create an array, it references to one!
	 * 
	 * @param coefficients  
	 */
	public Polynomial(final double[] coefficients) {
		this.coeff = coefficients;
		this.deg = coefficients.length;
		this.calculateDeg();
	}
	
	/**
	 * The degree of the polynomial.
	 * @return integer
	 */
	public final int getDeg() {
		return this.deg;
	}
	
	/**
	 * Sets the degree.
	 * @param newDeg Integer
	 */
	public final void setDeg(final int newDeg) {
		this.deg = newDeg;
	}
	
	/**
	 * Returns the entire coefficient array.
	 * @return double
	 */
	public final double[] getCoeff() {
		return this.coeff.clone();
	}
	
	/**
	 * Returns the coefficient of order index.
	 * @param index integer
	 * @return double
	 */
	public final double getCoeff(final int index) {
		return this.coeff[index];
	}
	
	/**
	 * Modify the coefficient.
	 * @param index integer
	 * @param coef double
	 */
	public final void setCoeff(final int index, final double coef) {
		this.coeff[index] = coef;
	}
	
	/**
	 * Extracts the exponent form the split string.
	 * @param s String
	 * @return integer
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
	 * Recalculates the degree in case of coefficients being 0.
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
}
