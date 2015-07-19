
public class PrimeSpiral {
	static boolean isPrime(int number){
		if(number%2 == 0) return false;
		for(int i=3; i<= Math.sqrt(number); i+=2){
			if (number%i == 0) return false;
		}
		return true;
	}
	
	public static void main(String[] args){
	int term=3, primeCounter=1, totalNumbers=1, ratio=1, length = 1;
	double primeRatio = 100;
	while(primeRatio >= 10){
		if(totalNumbers%4 == 0) {
			ratio++;
		}
		term += 2*ratio;
		if(isPrime(term)){
			primeCounter++;
		}
		totalNumbers++;
		primeRatio = (double) (100 * primeCounter)/(totalNumbers + 1);
		length = (int) Math.sqrt(term);
		

	}
	System.out.println(primeCounter);
	System.out.println(totalNumbers);
	System.out.println(primeRatio);
	System.out.println(length);

}
}
