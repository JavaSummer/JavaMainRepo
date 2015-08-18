
public class Division {///have to work with float :(

	//helper functions
	
	int degree(float [] polynomial){//returns the degree of a polynomial
		
		int size = polynomial.length;
		for (int i = size-1;i>=0;i--){
			
			if (polynomial[i]!=0){
				return i;
			}	
		}	
		return -1;
	}
	
	float [] shiftRightPoly(int positionsNr, float [] poly){//returns the polynomial shifted to the right with positionsNr
		
		float shiftedPoly [] = new float[50];//hope it self initializes :o3
		int degree = degree(poly);
		for (int i=0;i<=degree;i++){
			shiftedPoly[i + positionsNr] = poly [i];
		}
		return shiftedPoly;	
	}
	

	public float[] mulScalar(float[] poly, float nr) {//returns the polynomial poly multiplied with nr

		float[] result = new float[50];
		for (int i = 0; i <= degree(poly); i++) {
			result[i] = nr * poly[i];
		}
		return result;
	}
	
	float[] subtract(float a[],float b[]) {

		int sizeA = degree(a);
		int sizeB = degree(b);
		
		float[] result = new float[50];
		int i = 0;
		while (i <= sizeA && i <= sizeB) {
			result[i] = a[i] - b[i];
			i++;
		}
		while (i <= sizeA) {
			result[i] = a[i];
			i++;
		}
		while (i <= sizeB) {
			result[i] = -b[i];
			i++;
		}
		return result;

	}
	
	float [] getCopy(float [] poly){

		float [] copy = new float [50];
		for(int i=0;i<=degree(poly);i++){
			copy [i] = poly [i];
		}
		return copy;
	}
	
	public void polyDivision(float [] a, float [] b, float [] q, float [] r) {
		
		if (degree(a)<0){
			System.out.println("The divider is zero everywhere");
		}
		
		if (degree(a) >= degree(b)){
			
			while (degree(a)>=degree(b)){
				
				int pos = degree(a)-degree(b);
				float [] shiftedB = shiftRightPoly(pos, b);
				q[pos] = a[degree(a)]/shiftedB[degree(shiftedB)];
				shiftedB = mulScalar(shiftedB, q[pos]);
				a = subtract(a, shiftedB);
				System.out.println("a is:");
				for (int i = 0;i<=degree(a);i++){
					System.out.print(a[i]+ " ");
				}
				System.out.println();
		    }
			
			for(int i=0;i<=degree(a);i++){
				r [i] = a[i];
			}
		}
		else{
			
			for(int i=0;i<=degree(a);i++){
				r [i] = a[i];
			}
		}
		

	}
}


