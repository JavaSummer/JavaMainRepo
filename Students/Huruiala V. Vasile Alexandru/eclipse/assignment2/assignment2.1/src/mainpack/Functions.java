package mainpack;

/**
 * 
 * @author alexh
 *
 */
public final class Functions {
	
	/**
	 * Constructor.
	 */
	private Functions() {
	}
	
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
		if (pol1.getDeg() > pol2.getDeg()) {
			maxSize = pol1.getDeg();
			minSize = pol2.getDeg();
			whichPolHasMaxDeg = 1;
		} else {
			maxSize = pol2.getDeg();
			minSize = pol1.getDeg();
			whichPolHasMaxDeg = 2;
		}
		
		double[] resultCoeff = new double[maxSize];
		for (int i = 0; i < minSize; i++) {
			resultCoeff[i] = pol1.getCoeff(i) + pol2.getCoeff(i);
		}
		
		double[] reference;
		if (whichPolHasMaxDeg == 1) {
			reference = pol1.getCoeff();
		} else {
			reference = pol2.getCoeff();
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
		if (pol1.getDeg() > pol2.getDeg()) {
			maxSize = pol1.getDeg();
			minSize = pol2.getDeg();
		} else {
			maxSize = pol2.getDeg();
			minSize = pol1.getDeg();
		}
		
		double[] resultCoeff = new double[maxSize];
		for (int i = 0; i < minSize; i++) {
			resultCoeff[i] = pol1.getCoeff(i) - pol2.getCoeff(i);
		}
		
		if (pol1.getDeg() > pol2.getDeg()) {
			for (int i = minSize; i < maxSize; i++) {
				resultCoeff[i] = pol1.getCoeff(i);
			}
		} else {
			for (int i = minSize; i < maxSize; i++) {
				resultCoeff[i] = -pol2.getCoeff(i);
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
		int resultDeg = pol1.getDeg() + pol2.getDeg();
		double[] resultCoeff = new double[resultDeg];
		
		for (int i = 0; i < pol1.getDeg(); i++) {
			for (int j = 0; j < pol2.getDeg(); j++) {
				resultCoeff[i + j] += pol1.getCoeff(i) * pol2.getCoeff(j);
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
		double[] resultCoeff = new double[pol.getDeg()];
		
		for (int i = 0; i < pol.getDeg(); i++) {
			resultCoeff[i] = pol.getCoeff(i) * scalar;
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
		
		for (int i = 0; i < pol.getDeg(); i++) {
			double valueAtI = 1;
			for (int j = 0; j < i; j++) {
				valueAtI *= value;
			}
			result += pol.getCoeff(i) * valueAtI;
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
		
		if (pol1.getDeg() < pol2.getDeg()) {
			result[0] = new Polynomial("0");
			result[1] = new Polynomial(pol1);
		} else {
			Polynomial remainder = new Polynomial(pol1);
			Polynomial quotient = 
					new Polynomial(new double[pol1.getDeg() 
					                          - pol2.getDeg() + 1]);
			/* This is necessary since the line above will choose 0 
			 * for the degree and the terms will be changed directly
			 * by field - using "add" would mean creating 2 extra 
			 * objects per iteration.
			 */
			quotient.setDeg(pol1.getDeg() - pol2.getDeg() + 1);
			
			while (remainder.getDeg() >= pol2.getDeg()) {
				//The next coefficient of the quotient
				double newQTerm = remainder.getCoeff(remainder.getDeg() - 1) 
						/ pol2.getCoeff(pol2.getDeg() - 1);
				
				//The polynomial is updated
				quotient.setCoeff(remainder.getDeg() - pol2.getDeg(), newQTerm);
				//Creating an array containing only the new term for
				//this iteration so "multiply" can be used.
				double[] tempQuotient = new double[quotient.getDeg()];
				tempQuotient[remainder.getDeg() - pol2.getDeg()] = newQTerm;
				
				remainder = subtract(remainder, multiply(pol2, 
						new Polynomial(tempQuotient)));
			}
		
			result[0] = new Polynomial(quotient);
			result[1] = new Polynomial(remainder);
		}
		
		return result;
	}
}
