package polipack;

/**
 * 
 * @author Marius Bologa
 *
 */
public final class Operations {

	/**
	 * 
	 * @param a
	 *            Coefficient of the first polynomial.
	 * @param b
	 *            Coefficient of the second polynomial.
	 * @return Maximum between the coefficients.
	 */
	private static int maxDegree(final int a, final int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	/**
	 * 
	 * @param a
	 *            First polynomial A.
	 * @param b
	 *            Second polynomial B.
	 * @return The resulting polynomial after adding 2 polynomials.
	 */

public static  Polynomials addition(final Polynomials a, final Polynomials b) {
	Polynomials c = new Polynomials(0, maxDegree(a.getDegree(), b.getDegree()));
		for (int i = 0; i <= a.getDegree(); i++) {
			c.getCoefficient()[i] += a.getCoefficient()[i];
		}
		for (int i = 0; i <= b.getDegree(); i++) {
			c.getCoefficient()[i] += b.getCoefficient()[i];
		}
		c.setDegree();
		return c;
	}

	/**
	 * 
	 * @param a
	 *            First polynomial A.
	 * @param b
	 *            Second polynomial B.
	 * @return The resulting polynomial after subtracting 2 polynomials.
	 */
public static Polynomials subtract(final Polynomials a, final Polynomials b) {
	Polynomials c = new Polynomials(0, maxDegree(a.getDegree(), b.getDegree()));
		for (int i = 0; i <= a.getDegree(); i++) {
			c.getCoefficient()[i] += a.getCoefficient()[i];
		}
		for (int i = 0; i <= b.getDegree(); i++) {
			c.getCoefficient()[i] -= b.getCoefficient()[i];
		}
		c.setDegree();
		return c;
	}

	/**
	 * 
	 * @param a
	 *            First polynomial A.
	 * @param b
	 *            Second polynomial B.
	 * @return The resulting polynomial after multiplying 2 polynomials.
	 */
public static Polynomials multiply(final Polynomials a, final Polynomials b) {

		Polynomials c = new Polynomials(0, a.getDegree() + b.getDegree());
		for (int i = 0; i <= a.getDegree(); i++) {
			for (int j = 0; j <= b.getDegree(); j++) {
c.getCoefficient()[i + j] += (a.getCoefficient()[i] * b.getCoefficient()[j]);
			}
		}
		c.setDegree();
		return c;
	}

	/**
	 * 
	 * @param a
	 *            A polynomial.
	 * @param x
	 *            An integer.
	 * @return Another polynomial whose coefficients were multiplied with a
	 *         scalar.
	 */
public static Polynomials multiplyByScalar(final Polynomials a, final int x) {

		Polynomials c = new Polynomials(0, a.getDegree());
		for (int i = 0; i <= a.getDegree(); i++) {
			c.getCoefficient()[i] = (a.getCoefficient()[i] * x);
		}
		c.setDegree();
		return c;
	}

	/**
	 * 
	 * @param a The polynomial that is vealuated.
	 * @param x
	 *            An integer where the polynomial is evaluated.
	 * @return The value of the polynomial in that point.
	 */
	public static int evaluate(final Polynomials a, final int x) {
		int value = 0;
		for (int i = a.getDegree(); i >= 0; i--) {
			value = a.getCoefficient()[i] + (x * value);
		}
		return value;
	}
}
