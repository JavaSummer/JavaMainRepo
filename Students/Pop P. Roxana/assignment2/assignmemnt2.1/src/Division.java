
public class Division {
	
	//method that returns the polynomial shifted to the right with positionsNr
	Polynomial shiftRightPoly(int positionsNr, Polynomial poly){

		int deg = poly.getDegree();
		double[] result = new double[positionsNr + deg+1];
		for (int i = 0; i <= deg; i++) {
			result[i + positionsNr] =  poly.getCoefficient(i);
		}
		return new Polynomial(result, deg+positionsNr);
		
		
	}
	
      Polynomial [] polyDivision(Polynomial a, Polynomial b ) {
    	   //the return type will be an array of size two
    	   //on the first position: the remainder
    	   //on the second position: the quotient
		
    	int aDegree = a.getDegree();
   		int bDegree = b.getDegree();
    	double [] q = new double[aDegree+1];
    	double [] r = new double[aDegree+1];
    	Polynomial [] result = new Polynomial [2];
		
		if (aDegree<0){
			System.out.println("The divider is zero everywhere");
		}
		
		if (aDegree >= bDegree){

			while (aDegree>=bDegree){
				
				int pos = aDegree-bDegree;
				Polynomial shiftedB = shiftRightPoly(pos, b);
				q[pos] = a.getCoefficient(aDegree)/shiftedB.getCoefficient(shiftedB.getDegree());
				shiftedB = Functions.mulScalar(shiftedB, q[pos]);
				a = Functions.subtract(a, shiftedB);
				a.updateDegree();
				aDegree = a.getDegree();
		    }
			
			for(int i=0;i<=a.getDegree();i++){
				r [i] = a.getCoefficient(i);
			}
		}
		else{
			
			for(int i=0;i<=a.getDegree();i++){
				r [i] = a.getCoefficient(i);
			}
		}
		
		result[0] = new Polynomial(r, HelpfulFunctions.degree(r));
		result[1] = new Polynomial(q, HelpfulFunctions.degree(q));
		return result;
	}
}


