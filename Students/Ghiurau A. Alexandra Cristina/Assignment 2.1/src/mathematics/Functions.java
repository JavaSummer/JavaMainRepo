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

		// a sort of 'initialization'
		for (int i = 0; i <= a.getDegree()+b.getDegree(); i++) {
			c.getCoef().add(0D);
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
			quotient.getCoef().add(0D);
		}
		for (int i = 0; i <= a.getDegree() - b.getDegree(); i++) {
			remainder.getCoef().add(0D);
		}

		// ! special case when the degree of the denominator is 0 (constant)
		// I have to treat it separately in order to avoid a 'divide by 0'
		// exception
		
	//	int n = a.getDegree() - b.getDegree();
		
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
			//cam aici crapa, desi acuma am while infinit 
			// din cauza functiei multiply care imi creste mereu gradul de auxAp mai mult decat ar trebui
			//si deci nu mai iese din loop niciodata
			//iti trebuie o metoda ce sterge toate 0-urile de pe gradele maxime
			//gen 1 2 0 3 4 e ok - doar coef
			//daca e asa getDegree va da 6? sau 5-> 0 0 2 5 0 7  tb sa fie 2 5 0 7 
			//hm, stau sa ma gandesc daca ajunge sa arate asa
			while (auxAp.countNonZero() >= b.countNonZero()) {
				quotient.addCoefficient(auxAp.countNonZero() - b.countNonZero(),
						auxAp.returnCoefAtDegree(auxAp.getCoef().size()-1) / b.returnCoefAtDegree(b.countNonZero()-1));
				
				Polynomial temp = new Polynomial();//practic pui coeficientul ^ ala de sus pe gradul tot de acolo
				
				for (int i = auxAp.countNonZero() - b.countNonZero() - 1; i >= 0; i--) {
					temp.getCoef().add(0D);
				}
				temp.getCoef().add(auxAp.returnCoefAtDegree(auxAp.getCoef().size()-1) / b.returnCoefAtDegree(b.countNonZero()-1));
				//cred ca asa ca toate dupa elementul ala sa fie 0 dar sa nu fie nimic de grad mai mare, aha. doar ca trebuia sa pun 
				//cred " returnCoefAtDegree "
				auxAp = subtraction(auxAp, multiply(b, temp));
				System.out.println("The degree of Auxap: "+ auxAp.countNonZero());
				auxAp.decreaseDeg();//ca nu era salvat :))
				System.out.println("The degree of Auxap: "+ auxAp.countNonZero());
				//auxAp = multiply(quotient, b); 
				//auxAp = subtraction(a, auxAp);//aici de ce scazi din a, parca a nu se modifica
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
