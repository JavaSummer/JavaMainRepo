public class Twist2 {
	
	public static void main(String[] args) {
		int i = 1 , sum = 0;
		for ( i = 1; sum <= Integer.MAX_VALUE - i; i++) {
			if( i % 3 == 0 || i % 5 == 0){
				sum += i;
			}
		}
		
		System.out.println("Int Overflow occurs for a value >= " + i);
		long j = 1, sumLong = 0;
		for ( j = 1; sumLong <= Long.MAX_VALUE - j; j++) {
			if( i % 3 == 0 || i % 5 == 0){
				sumLong += j;
			}
		} 
		System.out.println("Long overflow occurs for a value >= " + j);
	}
}