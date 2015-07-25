package mathematics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Polynomial {

	private ArrayList<Integer> coef;

	/**
	 * constructor - method that builds the polynomial if the constructor
	 * doesn't receive valid input -> throw exception
	 * 
	 * @param -
	 *            line read from the text file
	 */

	public Polynomial(String line) throws IOException {

		this.coef = new ArrayList<>();
		String[] strings = line.split(" ");

		//System.out.println("Test the constructor: ");

		for (int i =0; i<strings.length; i++) {
			this.coef.add(Integer.parseInt(strings[i]));
			System.out.println("coef[i]: " + this.coef.get(i) + " has length: " + strings.length + " coef.size(): "
					+ this.coef.size());
		}
		Collections.reverse(this.coef);
	}

	/**
	 * constructor - method with no param used for initializing the resulting
	 * polynomials
	 */
	public Polynomial() {
		coef = new ArrayList<>();
	}

	/**
	 * method used only for operations (addition, subtraction etc) in order to
	 * determine the polynomial with max degree
	 * 
	 * @return the degree of a polynomial
	 */
	public int getDegree() {
		
		return coef.size()-1;
	}

	/**
	 * 
	 * @return the coefficient of a degree
	 */
	public int returnCoefAtDegree(int degree) {
		return coef.get(degree);
	}

	/**
	 * 
	 * @return the coefficient vector of the polynomial
	 */
	public ArrayList<Integer> getCoef() {
		return coef;
	}

	/**
	 * 
	 * @param coef
	 */
	public void setCoef(ArrayList<Integer> coef) {
		this.coef = coef;
	}

	/**
	 * 
	 * @param degree
	 * @param value
	 */
	public void addCoefficient(int degree, int value) {
		coef.add(degree, value);
	}

	/**
	 * 
	 * @return - a string representation of the polynomial; in order to have the
	 *         polynomials written in their mathematical form (e.g. 5x^8 –
	 *         4x^7…)
	 */
	@Override
	public String toString() {
		String p = "";
		for (int i = this.coef.size() - 1; i >= 0; i--)
			// for(int i = 0; i< this.coef.size(); i++)
			if (this.coef.get(i) > 0)
				if (i == 1)
					p = p + "+ " + this.coef.get(i) + "x ";
				else if (i == 0)
					p = p + "+ " + this.coef.get(i) + " ";
				else
					p = p + "+ " + this.coef.get(i) + "x^" + i + " ";
			else if (this.coef.get(i) < 0)
				if (i != 0)
					p = p + this.coef.get(i) + "x^" + i + " ";
				else
					p = p + " " + this.coef.get(i) + " ";
		return p;
	}

}
