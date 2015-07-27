import java.util.*;
public class Polynomial {
	String coeff;
	int degree;
	public int [] getCoeff (){
		String [] pol = coeff.split(" ");
		int [] b = new int [pol.length];
		int i;
		int j = 0;
		for(i=pol.length-1;i>=0;i--){
			b[j] = Integer.parseInt(pol[i]);
			j++;
		}
		return b;
	}
}