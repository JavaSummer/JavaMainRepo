public class Fibonacci {
	public static void main(String[] args){
		int i=0;
		long f=1, sum=0;
		for(i=0; f <= 4_000_000; i++){
			if (f % 2 == 0) sum += f;
			f = fib(i);
		}
		System.out.println("The sum is " + sum);
	}
	public static long fib(int n) {
		if (n == 0)return 1;
		if (n == 1) return 2;
		return fib(n-1) + fib(n-2);
	}
}