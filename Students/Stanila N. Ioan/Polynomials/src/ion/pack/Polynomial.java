package ion.pack;

/**
 * @author Ion
 * Class that implements a polynomial.
 */
public final class Polynomial {

    /**
     * Array that holds the coefficients of the polynomial.
     */
	private double[] coeff;
	/**
	 * The degree of the polynomial.
	 */
	private int degree;
	
	/**
	 * 
	 * @param coefficients holds the coefficients.
	 */
	Polynomial(final double[] coefficients) {
		coeff = coefficients;
		degree = coefficients.length - 1;
	};
	
	/**
	 * Special constructor!
	 * @param x the coefficient.
	 * @param n the degree.
	 */
	Polynomial(final double x, final int n) {
		double[] c = new double[n + 1];
		c[n] = x;
		coeff = c;
		degree = n;
	}
	
	/**
	 * Get the degree of the polynomial.
	 * @return the degree of the polynomial.
	 */
	public int getDegree() {
		return degree;
	}
	
	/**
	 * Get an array with the coefficients of the polynomial.
	 * @return array with coefficients;
	 */
	public double[] getCoefficients() {
		return coeff;
	}
	
	/**
	 * Get the coefficient at a position.
	 * @param pos position.
	 * @return the coefficient.
	 */
	public double getCoeffAt(final int pos) {
		return coeff[pos];
	}
	
	/**
	 * Compute the value of the polynomial for a given invariant.
	 * @param x the invariant.
	 * @return the resulting value.
	 */
	public double computeForInvariant(final double x) {
		double val = 0;
		int i;
		for (i = 0; i <= degree; i++) {
			val += coeff[i] * Math.pow(x, i);
		}
		return val;
	}
	
	/**
	 * Multiplies the polynomial with a given value.
	 * @param x the value to multiply with.
	 */
	public void multWith(final double x) {
		int i;
		for (i = 0; i <= degree; i++) {
			coeff[i] *= x;
		}
	}
	
	@Override
	public String toString() {
		String rep = "";
		int i;
		for (i = degree; i >= 0; i--) {
			if (coeff[i] != 0) {
				if (!rep.isEmpty() && coeff[i] > 0) {
					rep = rep.concat(" +");
				} else if (!rep.isEmpty() && coeff[i] < 0) {
					rep = rep.concat(" ");
				}
				if (i == 0.0) {
					rep = rep.concat(String.valueOf(coeff[i]));
				} else {
					rep = rep.concat(String.valueOf(coeff[i]) + "x^" 
						+ String.valueOf(i));
				}
			}
		}
		if (rep.isEmpty()) {
			rep = rep.concat("0");
		}
		return rep;
	}
}
