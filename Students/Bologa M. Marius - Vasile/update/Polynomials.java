package polipack;

/**
 * 
 * @author Marius Bologa
 *
 */
public final class Polynomials {
	/**
	 * 
	 */
	private int[] coefficient = null;
	/**
	 * 
	 */
	private int degree;

	/**
	 * Class constructor.
	 * 
	 * @param a
	 *            Representing the coefficient of the polynomial.
	 * @param b
	 *            Representing the degree of the polynomial.
	 */
	public Polynomials(final int a, final  int b) {
	setCoefficient(new int[b + 1]);
	getCoefficient()[b] = a;
	setDegree();
}

	/**
	 * 
	 * @return The mathematical representation.
	 */
	public String toString() {
		if (getDegree() == 0) {
			return "" + getCoefficient()[0];
		}
		if (getDegree() == 1) {
			return getCoefficient()[1] + "x + " + getCoefficient()[0];
		}
		String s = getCoefficient()[getDegree()] + "x^" + getDegree();
		for (int i = getDegree() - 1; i >= 0; i--) {
			if (getCoefficient()[i] == 0) {
				continue;
			} else if (getCoefficient()[i] > 0) {
				s = s + " + " + (getCoefficient()[i]);
			} else if (getCoefficient()[i] < 0) {
				s = s + " - " + (-getCoefficient()[i]);
			}
			if (i == 1) {
				s = s + "x";
			} else if (i > 1) {
				s = s + "x^" + i;
			}
		}
		return s;
	}

	/**
	 * @return the degree
	 */
	public int getDegree() {
		return degree;
	}

/*	/**
	 * @param degree
	 *            the degree to set
	 */
    /*public void setDegree(final int degree) {
		this.degree = degree;
	}*/

	/**
	 * @return the coefficient
	 */
	public int[] getCoefficient() {
		return coefficient;
	}

	/**
	 * @param coefficient
	 *            the coefficient to set
	 */
	public void setCoefficient(final int[] coefficient) {
		this.coefficient = coefficient;
	}



	/**
	 * @return The degree.
	 * 
	 */
	public int setDegree() {
		int d = 0;
		for (int i = 0; i < this.coefficient.length; i++) {
			if (this.coefficient[i] != 0) {
				d = i;
			}
		}
		this.degree = d;
	return this.degree;
}
}
