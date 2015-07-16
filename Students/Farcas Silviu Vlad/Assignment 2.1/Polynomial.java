
public class Polynomial {
	private String poly;
	public int[] construct(int... coeff) {
		int i;
		for (i = 0; i < coeff.length; i++) {
			if (i == 0 && coeff.length > 1) {
				poly = coeff[i] + "x^" + (coeff.length - 1);
			} else if (i == coeff.length - 1) {
				if (coeff.length == 1) {
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
				poly = poly + "+" + coeff[i] + "x^" + (coeff.length - i - 1);
			} else if (coeff[i] < 0) {
				poly = poly + coeff[i] + "x^" + (coeff.length-i-1);
			}
		}
		return coeff;
	}

	public String getPoly() {
		return poly;
	}

}
