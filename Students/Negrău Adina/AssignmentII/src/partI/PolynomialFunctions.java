package partI;

public class PolynomialFunctions {

	//public InputOutputFunctions IOFF = new InputOutputFunctions();
	/*
	 * Add two polynomials
	 * p - Polynomial
	 * p2 - Polynomial
	 */
	public Polynomial add(Polynomial p, Polynomial p2){
		int[] coeff1 = p.getCoeff();
		int[] coeff2 = p2.getCoeff();
		int coeff[] = new int[100];
		Polynomial smaller = Polynomial.getSmaller(p, p2);
		Polynomial greater = Polynomial.getGreater(p, p2);
		int min = smaller.getDegree();
		int max = greater.getDegree();
		for (int i=0; i<=max; i++){
			if(i>min){
				coeff[i] = greater.getCoeff()[i];
			}
			else{
				coeff[i] = coeff1[i] + coeff2[i];
				
			}
		}
		Polynomial result = new Polynomial(max, coeff);
		return result;

	}
	/*
	 * Delete two polynomials 
	 * input: p - Polynomial
	 * 		  p2 - Polynomial
	 */
	public Polynomial delete(Polynomial p, Polynomial p2){
		int[] coeff1 = p.getCoeff();
		int[] coeff2 = p2.getCoeff();
		int coeff[] = new int[100];
		Polynomial smaller = Polynomial.getSmaller(p, p2);
		Polynomial greater = Polynomial.getGreater(p, p2);
		int min = smaller.getDegree();
		int max = greater.getDegree();
		for (int i=0; i<=max; i++){
			if(i>min){
				coeff[i] = greater.getCoeff()[i];
			}
			else{
				coeff[i] = coeff1[i] - coeff2[i];
			}
		}
		Polynomial result = new Polynomial(max, coeff);
		return result;
	}

	/*
	 * Multiply two polynomials
	 * p - Polynomial
	 * p2 - Polynomial
	 */
	public Polynomial multiply(Polynomial p, Polynomial p2){
		int d = 100;
		int[] coeff = new int[100];
		Polynomial result = new Polynomial(d, coeff);
		int degree=0;
		for(int i=0; i<p.getDegree()+1; i++){
			for(int j=0; j<p2.getDegree()+1; j++){
				int k = i+j;
				if(k > degree){
					degree = k;
				}
				result.coeff[k] += p.getCoeff()[i] * p2.getCoeff()[j];
			}
		}
		int[] v = new int[degree+1];
		for(int i=0; i<=degree; i++){
			v[i] = result.getCoeff()[i];
		}
		Polynomial r2 = new Polynomial(degree, v);
		return r2;
	}
	/*
	 * Multiply a polynomial with a given value
	 * p - Polynomial
	 * value - integer
	 */
	public Polynomial multiplyWith(Polynomial p, int value){
		int[] copyCoeffOfP = new int[p.getDegree()+1];
		for(int i=0; i<=p.getDegree();i++){
			copyCoeffOfP[i] = p.getCoeff()[i]*value;
		}
		Polynomial result = new Polynomial(p.getDegree(), copyCoeffOfP);
		return result;
	}
	/*
	 * Evaluate a polynomial on a given value
	 * p - Polynomial
	 * value - integer
	 */
	public Polynomial evalOn(Polynomial p, int value){
		int[] copyCoeffOfP = new int[p.getDegree()+1];
		for(int i=0; i<=p.getDegree();i++){
			copyCoeffOfP[i] = p.getCoeff()[i]/value;
	}
		Polynomial result = new Polynomial(p.getDegree(), copyCoeffOfP);
		return result;
	}
	

}
