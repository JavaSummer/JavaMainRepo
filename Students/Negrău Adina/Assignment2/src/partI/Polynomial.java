package partI;

public class Polynomial {
	int degree;
	int[] coeff;

	public Polynomial(){
		degree = 0;
		coeff = new int[0];
	}
	public Polynomial(int d, int[] co){
		degree = d;
		coeff = co;
	}
	
	public int getDegree(){
		return degree;
	}
	public int[] getCoeff(){
		return coeff;
	}
	public String toString(){
	
		if (degree ==  0) return "" + coeff[0];
        if (degree ==  1) return coeff[1] + "x + " + coeff[0];
        String s = coeff[degree] + "x^" + degree;
        for (int i = degree-1; i >= 0; i--) {
            if      (coeff[i] == 0) continue;
            else if (coeff[i]  > 0) s = s + " + " + ( coeff[i]);
            else if (coeff[i]  < 0) s = s + " - " + (-coeff[i]);
            if      (i == 1) s = s + "x";
            else if (i >  1) s = s + "x^" + i;
        }
        return s;
	}
	public Polynomial getSmaller(Polynomial p, Polynomial p2){
		Polynomial smaller;
		if(p.getDegree() > p2.getDegree()){
		    smaller = p2;
		}
		else{
			smaller = p;
		}
		return smaller;
	}
	
	public Polynomial getGreater(Polynomial p, Polynomial p2){
		Polynomial greater;
		if(p.getDegree() > p2.getDegree()){
		    greater = p;
		}
		else{
			greater = p;
		}
		return greater;
	}
	public void setCoeff(int c, int value){
		this.coeff[c] = value;
	}
}

