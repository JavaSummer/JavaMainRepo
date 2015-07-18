public class PrimeSpiralSolution2 {
	public static void main(String[] args) {		
		
		//double ratio = 100;	
		int noOfPrimes = 3;
		int sideLength = 2;
		int corner = 9;
		while ((double) (noOfPrimes) / 2* sideLength + 1 > 0.10) {
			sideLength += 2;
			for (int i = 0; i < 3; i++){
				corner += sideLength;
				if (checkIfPrime(corner)) {
					//System.out.println("test1: " + corner);
					noOfPrimes++;
				}
				//System.out.println("ratio : "+ ratio);
			}
			corner += sideLength;
			
		}
		System.out.println("ratio falls bellow 10% at length: " + sideLength +1 );
				
	}

	/**
	 * 
	 * @param n
	 * @return
	 */
	public static boolean checkIfPrime(int n) {
		if ((n % 2 == 0 && n!=2) || n == 1) {
			return false;
		}
		for (int counter = 2; counter < n / 2; counter++) {
			if (n % counter == 0) {
				return false;
			}
		}
		return true;
	}
}
