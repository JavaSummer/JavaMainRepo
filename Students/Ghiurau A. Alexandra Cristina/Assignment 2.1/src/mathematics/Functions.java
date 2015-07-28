package mathematics;

//import java.util.ArrayList;
/**
 * class that contains the operations to be performed on the polynomials; the
 * methods will be static because I am performing operations that do not operate
 * on instances of the class
 * 
 * @author Alexa
 * 
 */
public class Functions {

	public static Polynomial addition(Polynomial a, Polynomial b) {

		Polynomial c = new Polynomial();

		if (a.getDegree() > b.getDegree()) {
			for (int i = 0; i <= b.getDegree(); i++) {
				c.addCoefficient(i, a.returnCoefAtDegree(i) + b.returnCoefAtDegree(i));
			}
			for (int i = b.getDegree() + 1; i <= a.getDegree(); i++) {
				c.addCoefficient(i, a.getCoef().get(i));
				// figured that a.returnCoefAtDegree(i) <=> a.getCoef().get(i)
				// so in some places I used this, though it's the same thing
				// idk which is more 'elegant'

			}
		} else {
			for (int i = 0; i <= a.getDegree(); i++) {
				c.addCoefficient(i, a.returnCoefAtDegree(i) + b.returnCoefAtDegree(i));
			}
			for (int i = a.getDegree() + 1; i <= b.getDegree(); i++) {
				c.addCoefficient(i, b.returnCoefAtDegree(i));
			}
		}
		return c;

	}

	public static Polynomial subtraction(Polynomial a, Polynomial b) {

		Polynomial c = new Polynomial();
		if (a.getDegree() > b.getDegree()) {
			for (int i = 0; i <= b.getDegree(); i++) {
				c.addCoefficient(i, a.getCoef().get(i) - b.getCoef().get(i));
			}
			for (int i = b.getDegree() + 1; i <= a.getDegree(); i++) {
				c.addCoefficient(i, a.getCoef().get(i));
			}
		} else {
			for (int i = 0; i <= a.getDegree(); i++) {
				c.addCoefficient(i, a.returnCoefAtDegree(i) - b.returnCoefAtDegree(i));
			}
			for (int i = a.getDegree() + 1; i <= b.getDegree(); i++) {
				c.addCoefficient(i, b.returnCoefAtDegree(i));
			}
		}
		return c;
	}

	public static Polynomial multiply(Polynomial a, Polynomial b) {
		Polynomial c = new Polynomial();

		// a sort of 'initialization'; in order to not have an index out of
		// bound exception
		for (int i = 0; i < 100; i++) {
			c.getCoef().add(0);
		}

		for (int i = 0; i <= a.getDegree(); i++) {
			for (int j = 0; j <= b.getDegree(); j++) {
				c.getCoef().set(i + j, c.getCoef().get(i + j) + a.getCoef().get(i) * b.getCoef().get(j));
			}
		}
		return c;
	}

	/**
	 * Polynomial long division algorithm:
	 * 
	 * @param a
	 *            -> numerator
	 * @param b
	 *            -> denominator
	 * 
	 * @return c -> quotient + remainder
	 * 
	 *         Algorithm: First, divide the leading term of the numerator
	 *         polynomial by the leading term of the divisor (denominator) =>
	 *         multiply the answer by the divisor => answer1. Subtract the
	 *         divisor from answer1 => repeat until the degree of the newly
	 *         divisor is less than the degree of the newly numerator
	 * 
	 * 
	 */
	public static Polynomial[] divison(Polynomial a, Polynomial b) {

		Polynomial[] rez = new Polynomial[2];

		Polynomial quotient = new Polynomial();
		Polynomial remainder = new Polynomial();

		// fill the quotient with 0's
		for (int i = 0; i <= a.getDegree() - b.getDegree(); i++) {
			quotient.getCoef().add(0);
		}

		// ! special case when the degree of the denominator is 0 (constant)
		// I have to treat it separately in order to avoid a 'divide by 0'
		// exception

		if (b.getDegree() == 0) {

			remainder = new Polynomial();

			for (int i = 0; i < a.getDegree(); i++) {
				quotient.getCoef().add(a.returnCoefAtDegree(i) / b.returnCoefAtDegree(0));
			}
			rez[0] = quotient;
			rez[1] = remainder;
			return rez;

		} else {

			Polynomial auxAp = new Polynomial();
			
			auxAp = a;
			
			while (auxAp.getDegree() >= b.getDegree()) {
				quotient.addCoefficient(auxAp.getDegree() - b.getDegree(),
						auxAp.returnCoefAtDegree(auxAp.getDegree()) / b.returnCoefAtDegree(b.getDegree()));
				auxAp = multiply(quotient, b);
				auxAp = subtraction(a, auxAp);
			}

			remainder = auxAp;

		}

		rez[0] = quotient;
		rez[1] = remainder;
		return rez;

	}

	public static Polynomial multipyByScalar(Polynomial a, int x) {
		Polynomial c = new Polynomial();

		for (int i = 0; i <= a.getDegree(); i++) {
			c.addCoefficient(i, a.returnCoefAtDegree(i) * x);
		}
		return c;
	}

	public static double evaluate(Polynomial a, double point) {
		double value = 0;
		for (int i = a.getDegree(); i >= 0; i--) {
			value = (value + a.returnCoefAtDegree(i) * Math.pow(point, i));
		}
		return value;
	}
}
