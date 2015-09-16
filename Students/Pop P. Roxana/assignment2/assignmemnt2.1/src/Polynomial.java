
public class Polynomial {

	// class attributes
	private int degree;
	private double[] coefficients;

	// getters and setters
	public int getDegree() {

		return degree;
	}

	private void setDegree(int degree) {

		this.degree = degree;
	}

	private void setCoefficients(double[] coefficients) {

		this.coefficients = coefficients;

	}

	public double[] getCoefficients() {

		return coefficients;
	}

	public double getCoefficient(int i) {

		return coefficients[i];
	}

	// constructor
	public Polynomial(double[] coefficients, int degree) {

		setDegree(degree);
		setCoefficients(coefficients);

	}

	// method that transforms the polynomial into a string(for printing
	// purposes)
	public String toString() {

		String s = "";
		for (int i = degree; i >= 0; i--) {
			s = s + ((i != degree && coefficients[i] >= 0) ? "+" : "") + coefficients[i] + "x^" + i;
		}
		return s;
	}

	// method for updating the degree
	public void updateDegree() {

		degree = HelpfulFunctions.degree(coefficients);
		
	}
}
