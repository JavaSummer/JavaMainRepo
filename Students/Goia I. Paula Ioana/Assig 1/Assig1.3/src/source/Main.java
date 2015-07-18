package source;

public class Main {
	//Maybe this is not the best way to verify if a number is palindrome,but,I don't know,I think the reverse() function works pretty well XD
	public static int IsPalindrome(long p){
		String s = new String("") ;
		s +=  p;
		String s1 = new StringBuffer(s).reverse().toString();
		if ( s1.equals(s))return 1;
		return 0;
	}
	public static void main(String[] args) {
		int a = 0, b = 0 ;
		long palindr = 0;
		outerloop :
		for(int i = 999 ; i >= 100 ; i--){
			for(int j = 999 ; j >= 100 ; j-- ){
				if(IsPalindrome(i * j) == 1){
					a = i ;
					b = j ;
					palindr = a * b ;
					System.out.println("The largest palindrome is " + palindr +" and is the result of the product of "+ a +" and " +b);
					break outerloop;
				}
			}
		}
		// :)) Let's Twist 
		outerloop1 :
			for(int i = 9999 ; i >= 1000 ; i--){
				for(int j = 9999 ; j >= 1000 ; j-- ){
					if(IsPalindrome(i * j) == 1){
						a = i ;
						b = j ;
						palindr = a * b ;
						System.out.print("The largest palindrome is " + palindr +" and is the result of the product of "+ a +" and " +b);
						break outerloop1;
					}
				}
			}
	
	}
}
