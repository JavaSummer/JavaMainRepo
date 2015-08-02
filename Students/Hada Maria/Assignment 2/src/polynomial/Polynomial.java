package polynomial;

public class Polynomial {
	private int[] coefficients;
	private int degree;

	public Polynomial(int[] coef, int d) {
		setCoeffs(coef);
		setDegree(d);
	}

	public void setCoeffs(int[] coef) {
		coefficients = new int[coef.length];
		for (int i = 0; i < coef.length; i++) {
			coefficients[i] = coef[i];
		}
	}

	public int[] getCoeffs() {
		return coefficients;
	}

	public void setDegree(int d) {
		degree = d;
	}

	public int getDegree() {
		return degree;
	}

	public String toString() {

		StringBuffer mathForm = new StringBuffer();
		int j = 0;
		for (int i = coefficients.length - 1; i >= 0; i--) {

			if (coefficients[j] >= 0) {
				if (coefficients[j] > 0) {
					if (j == 0) {
						mathForm.append(coefficients[j] > 0 ? "" : " ");
					} else {
						mathForm.append(coefficients[j] > 0 ? "+" : " ");
					}
				} else {
					j++;
					continue;
				}
			}
			if ((i == 0) || (coefficients[j] != 1)) {
				mathForm.append(Integer.toString(coefficients[j]));
			}
			if (i > 0) {
				mathForm.append("x^" + i);
			}
			j++;
		}
		return mathForm.toString();
	}
}