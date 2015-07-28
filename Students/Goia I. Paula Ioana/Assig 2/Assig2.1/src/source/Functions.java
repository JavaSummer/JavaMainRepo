package source;

import java.util.ArrayList;

public class Functions {
	
	public static Polynomial rez;
	

	public static Polynomial add(Polynomial a,Polynomial b){
		int degreeA = a.getDegree();
		int degreeB = b.getDegree();
		rez = new Polynomial();
		if(degreeA > degreeB){
			rez.setPoly(( rez).copy(a.getPoly()));
			for(int i = 0 ; i <= degreeB ; i++ ){
				rez.getPoly().set(i, b.getPoly().get(i) + rez.getPoly().get(i));
			}		
		}
		else {
		rez.setPoly(rez.copy(b.getPoly()));
			for(int i = 0 ; i <= degreeA ; i++ ){
				rez.getPoly().set(i, a.getPoly().get(i) + rez.getPoly().get(i));
			}		
		}
		
		return rez;
	}
	
	public static Polynomial sub (Polynomial a,Polynomial b){
		rez = new Polynomial();
		Polynomial bb = new Polynomial();
		ArrayList<Integer> bNegativ = new ArrayList<>();
		for ( Integer coef : b.getPoly())
			bNegativ.add(-coef);
		bb.setPoly(bNegativ);
		rez = add( a , bb);
		return rez;
	}
	
	public static Polynomial multByScalar(Polynomial a,int s){
		rez = new Polynomial();
		ArrayList<Integer> aMbS = new ArrayList<>();
		for ( Integer coef : a.getPoly())
			aMbS.add(coef*s);
		rez.setPoly(aMbS);
		return rez;
	}
	
	public static int eval(Polynomial a,int n){

		int result = 0;
		for ( int i = 0 ;i <= a.getDegree();i++){
			result += a.getPoly().get(i)*Math.pow(n,i);
		}
		return result;
	}
	
	public static Polynomial mult(Polynomial a,Polynomial b){
		rez = new Polynomial();
		ArrayList<Integer> results = new ArrayList<>();
		int[] result = new int[a.getDegree()+b.getDegree()+1];
		for(int i = 0 ; i <= a.getDegree() ; i++) {
			for ( int j = 0 ; j <= b.getDegree() ; j++)
		        result[i+j] += a.getPoly().get(i) * b.getPoly().get(j);
		}
		for ( Integer r : result){
			results.add(r);
		}
		rez.setPoly(results);
		return rez;
		
	}
	
}
