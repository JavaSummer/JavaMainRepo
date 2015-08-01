
public class Polynomial {

	int polyDegree;
	double[] coeff;

	public Polynomial() {
		polyDegree = 0;
		coeff = new double[1];
	}

	public Polynomial(double[] coeff1) {
		coeff = coeff1;
		polyDegree = coeff.length - 1;
	}

	public String getPolynomial() {

		String sign = "";
		String pol = "";

		for (int i = this.polyDegree; i >= 0; i--) {
			int deg = this.polyDegree;
			if (coeff[deg - i] > 0)
				sign = " + ";
			else if (coeff[deg - i] < 0)
				sign = " - ";
			if (i == this.polyDegree)
				sign = "";
			if (coeff[deg - i] != 0) {
				if (this.polyDegree > 1 && i == this.polyDegree) {
					pol += sign + Math.abs(coeff[deg - i]) + "x^" + i;
				} else if (i == 1) {
					pol += sign + Math.abs(coeff[deg - i]) + "x";
				} else if (i == 0) {
					pol += sign + Math.abs(coeff[deg - i]);
				} else {
					pol += sign + Math.abs(coeff[deg - i]) + "x^" + i;
				}
			}
		}

		return pol;
	}

	// override the toString() method that any object inherits when is created
	public String toString() {
		return getPolynomial();
	}
}
