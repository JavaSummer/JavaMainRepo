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
		/*for (int i = 0; i <= a.getDegree(); i++) {
			for (int j = 0; j <= b.getDegree(); j++) {
				//c.setDegree((a.getDegree() + b.getDegree()));
				c.addCoefficient(i+j, a.returnCoefAtDegree(i) * b.returnCoefAtDegree(i));
			}
		}*/
		return c;
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
