package ion.pack;

/**
 * Class that implements operations with polynomials.
 * @author Ion
 *
 */
public class Functions {

	/**
	 * Class constructor.
	 */
	Functions() { };
	
	/**
	 * Adds two polynomials.
	 * @param a first polynomial.
	 * @param b second polynomial.
	 * @return the sum of the two polynomials.
	 */
	public final Polynomial add(final Polynomial a, final Polynomial b) {
		int i;
		double[] coeff;
		if (a.getDegree() > b.getDegree()) {
			coeff = new double[a.getDegree() + 1];
			for (i = 0; i <= b.getDegree(); i++) {
				coeff[i] = a.getCoeffAt(i) + b.getCoeffAt(i);
			}
			for (i = b.getDegree() + 1; i <= a.getDegree(); i++) {
				coeff[i] = a.getCoeffAt(i);
			}
		} else {
			coeff = new double[b.getDegree() + 1];
			for (i = 0; i <= a.getDegree(); i++) {
				coeff[i] = a.getCoeffAt(i) + b.getCoeffAt(i);
			}
			for (i = a.getDegree() + 1; i < b.getDegree(); i++) {
				coeff[i] = b.getCoeffAt(i);
			}
		}
		return new Polynomial(coeff);
	}
	
	/**
	 * Subtracts the second polynomial from the first one.
	 * @param a the first polynomial.
	 * @param b the second polynomial.
	 * @return the difference of the two polynomials.
	 */
	public final Polynomial sub(final Polynomial a, final Polynomial b) {
		int i;
		double[] coeff;
		int degree;
		if (a.getDegree() > b.getDegree()) {
			degree = a.getDegree();
			coeff = new double[degree + 1];
			for (i = 0; i <= b.getDegree(); i++) {
				coeff[i] = a.getCoeffAt(i) - b.getCoeffAt(i);
			}
			for (i = b.getDegree() + 1; i <= a.getDegree(); i++) {
				coeff[i] = a.getCoeffAt(i);
			}
		} else {
			degree = b.getDegree();
			coeff = new double[degree + 1];
			for (i = 0; i <= a.getDegree(); i++) {
				coeff[i] = a.getCoeffAt(i) - b.getCoeffAt(i);
			}
			for (i = a.getDegree() + 1; i < b.getDegree(); i++) {
				coeff[i] = b.getCoeffAt(i);
			}
		}
		i = degree;
		while (coeff[i] == 0) {
			i--;
		}
		degree = i;
		double[] coeff2 = new double[degree + 1];
		for (i = 0; i <= degree; i++) {
			coeff2[i] = coeff[i];
		}
		return new Polynomial(coeff2);
	}
	
	/**
	 * Multiplies the two polynomials.
	 * @param a the first polynomial.
	 * @param b the second polynomial.
	 * @return the resulting polynomial.
	 */
	public final Polynomial mul(final Polynomial a, final Polynomial b) {
		int degree;
		degree = a.getDegree() + b.getDegree();
		double[] coeff = new double[degree + 1];
		int i, j;
		for (i = 0; i <= degree; i++) {
			coeff[i] = 0;
		}
		for (i = 0; i <= a.getDegree(); i++) {
			for (j = 0; j <= b.getDegree(); j++) {
				coeff[i + j] += a.getCoeffAt(i) * b.getCoeffAt(j);
			}
		}
		return new Polynomial(coeff);
	}
	
	/**
	 * Multiplies the polynomial with a scalar.
	 * @param a the polynomial.
	 * @param n the scalar.
	 * @return the resulting polynomial.
	 */
	public final Polynomial mulScal(final Polynomial a, final double n) {
		double[] coeff = new double[a.getDegree() + 1];
		int i;
		for (i = 0; i < coeff.length; i++) {
			coeff[i] = a.getCoeffAt(i);
		}
		Polynomial b = new Polynomial(coeff);
		b.multWith(n);
		return b;
	}
	
	/**
	 * Evaluates the polynomial for a given invariant.
	 * @param a the polynomial.
	 * @param x the invariant.
	 * @return the value of the polynomial for the given invariant.
	 */
	public final double eval(final Polynomial a, final double x) {
		return a.computeForInvariant(x);
	}
	
	/**
	 * Divides the first polynomial by the second one.
	 * @param a the first polynomial.
	 * @param b the second polynomial.
	 * @return the resulting polynomial.
	 */
	public final Polynomial div(final Polynomial a, final Polynomial b) {
		Polynomial bottom, middle;
		middle = a;
		Polynomial end = new Polynomial(0, 0);
		int n = a.getDegree() - b.getDegree();
		double[] coeff = new double[n + 1];
		int i;
		for (i = 0; i <= n; i++) {
			coeff[i] = 0;
		}
		do {
			coeff[n] = middle.getCoeffAt(middle.getDegree())
					/ b.getCoeffAt(b.getDegree());
			bottom = mul(b, new Polynomial(coeff[n], n));
			middle = sub(middle, bottom);
			n--;
		} while (!middle.equals(end) && n >= 0);
		return new Polynomial(coeff);
	}
}
