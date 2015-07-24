public class Polynomial {
	private String poly;
	public int[] coefficients; 
	public int degree;
	public int[] construct(int... coeff) {
		int i;
		degree = coeff.length;
		coefficients = new int[degree];
		for (i = 0; i < degree; i++) {
			coefficients[i]=coeff[i];
			if (i == 0 && degree > 1) {
				poly = coeff[i] + "x^" + (degree - 1);
			} else if (i == degree - 1) {
				if (degree == 1) {
					if (coeff[i] >= 0) {
						poly = coeff[i] + "";
					} else {
						poly = "-" + coeff[i];
					}
				} else {
					if (coeff[i] > 0) {
						poly = poly + "+" + coeff[i];
					} else if (coeff[i] < 0) {
						poly = poly + coeff[i];
					}
				}
			} else if (coeff[i] > 0) {
				poly = poly + "+" + coeff[i] + "x^" + (degree - i - 1);
			} else if (coeff[i] < 0) {
				poly = poly + coeff[i] + "x^" + (degree-i-1);
			}
		}
		return coeff;
	}

	public String getPoly() {
		return poly;
	}

}