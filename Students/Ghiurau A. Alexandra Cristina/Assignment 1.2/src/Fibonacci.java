/**
 * 
 * @author Alexa
 *
 */
public class Fibonacci {
	public static void main(String[] args) {

		long sum = 0;
		long f0 = 0;
		long f1 = 1;
		long fn = 0;
		// f32 = 3524578 ; f33 = 5702887 => in order for the values in the Fibonacci sequence
		// not exceed 4000000 the loop must be less than 32
		//as f32 is 3524578 if the stopping condition would be fn <4000000 it would additionally loop/iterate once more
		while(fn <= 3000000){
			fn = f0 + f1;
			if (f1 % 2 == 0) {
				sum += f1;
			}	
			f0 = f1;
			f1 = fn;
		}
		System.out.println(sum);
	}
	// PS. I've never thought of the recursive method
	// I think this is the 1st twist actually (I'm not sure though)
	// but it will probably be good practice to solve this in the recursive way as well
	
}
