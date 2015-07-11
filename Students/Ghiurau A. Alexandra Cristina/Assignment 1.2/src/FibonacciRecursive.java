/**
 * 
 * @author Alexa
 *
 */
public class FibonacciRecursive {

	public static void main(String[] args) {
		int sum = 0;
		System.out.println("teeest");
		int f0 = 0;
		for(int counter= 0; counter < 32; counter ++){
			if(f0%2 == 0){
				sum += f0;
			}
			f0 = fibonacciRecursive(counter);
		}
		System.out.println(sum);
		
	}
	public static int fibonacciRecursive(int fn){
		if(fn <= 1){
			return fn;
		}
		return fibonacciRecursive(fn-1) + fibonacciRecursive(fn -2);
	}
}

