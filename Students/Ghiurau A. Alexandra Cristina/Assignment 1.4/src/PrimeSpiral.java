/**
 * 
 * @author Alexa
 *
 */

public class PrimeSpiral {
	public static void main(String[] args) {
		
		double ratio = 100;
		
		//in this case num is the corner 
		//int num = 1;
		int noOfPrimes = 0;
		int sideLength = 1;
		int num = 1;
		while (ratio > 10) {
			sideLength += 2;
			num += 4;
			for (int j = 1; j < 4; j++)// or for i = 0; i< 3 
				{
				if (checkIfPrime(sideLength * sideLength -j * (sideLength -1))) {
					//System.out.println("test1: " + (sideLength * sideLength -j *  (sideLength -1)));
					noOfPrimes++;
				}
				ratio = ((double) (noOfPrimes) / num) *100;
				//System.out.println("ratio : "+ ratio);
			}
		}
		System.out.println("ratio: " + ratio + " at side length: " + sideLength);
		
		//takes the corners of the two diagonals, in this case num would be the center (num = 1)
		/*for( int i = 1; i< 5000; i++){
			for( int j = 1; j<4; j++){
				numbers++;
				num = num + 2*i;
				//System.out.println(num);
				if(checkIfPrime(num)){
					noOfPrimes++;
					SideLength = i;
					
				}		
			}
		}
		ratio = (double)(noOfPrimes) / (double) numbers;
		System.out.println("ratio = " + ratio);
		if(ratio < 0.1){
			System.out.println(" length of side is: " + 2*SideLength + 1);
		}*/

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
	/*public static int PrimeSpiralDiagonals(int percent)
    {
        double primePercent = 100;
        int primeCount = 3;
        int sideLength = 2;
        int cornerNumber = 9;

        while (primePercent >= percent)
        {
            sideLength += 2;
            for (int i = 1; i < 4; i++)
            {
                cornerNumber += sideLength;
                if (checkIfPrime(cornerNumber))
                    primeCount++;
            }
            cornerNumber += sideLength;
            primePercent = (double)primeCount / (2 * sideLength + 1) * 100;
        }
        return sideLength + 1;
    }*/
}
