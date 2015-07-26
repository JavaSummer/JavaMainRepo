package source;

import java.util.ArrayList;
import java.util.Collections;

public class Polynomial implements Cloneable{
	
	private ArrayList<Integer> poly ; 
	
	public Polynomial() {
		this.poly = new ArrayList<Integer>();
	}

	public ArrayList<Integer> createPoly (String polinom){
		String[] parts = polinom.split(" ");
		for ( String poli : parts){
			Integer p = Integer.parseInt(poli);
			poly.add(p);
		}
		Collections.reverse(poly);
		return this.poly;
	}
	
	public int getDegree ( ){
		return poly.size() - 1 ;
	}

	public ArrayList<Integer> getPoly() {
		return this.poly;
	}

	public void setPoly(ArrayList<Integer> poly) {
		this.poly = poly;
	}
	
	public ArrayList<Integer> copy(ArrayList<Integer> original){
		ArrayList<Integer> copy = new ArrayList<>();
		for ( Integer coef : original)
			copy.add(coef);
		return copy;
	}

	@Override
	public String toString(){
		String s = "";
		for ( int grad  = this.poly.size()-1; grad >= 0 ;  grad--){
			s = s + this.poly.get(grad) + "x^" + grad + " + ";
		}
		s+="  ";
		s = s.replace("+  "," ");
		s = s.replace("+ -", " -");
		s = s.replace("x^0","");
		s = s.replace("^1 -"," -");
		s = s.replace("^1 +"," +");
	
		return s;
		
		
	}

}
