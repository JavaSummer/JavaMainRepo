
public class Palindrome {
	static boolean isPalindrome(int number){
		int copy = number;
		int reverse = 0;
		while(copy != 0){
			reverse *= 10;
			reverse += copy%10;
			copy /= 10;
		}
		return reverse == number;
	}
	// Check palindromes that have the first digit 9. If there is none, search for the ones with 8, etc.
	static int threeDigitProductPalindrome(){
		int palindrome=0, k=9;
		if(palindrome == 0){
			for(int i=100*k + 99; i>100*k + 1;i--){
				for(int j=100*k + 99; j>=i; j--){
					if(isPalindrome(i*j) && palindrome < i*j) palindrome = i*j;
				}
			}
			k--;
			return palindrome;
		}
		return 0;
	}
	static int fourDigitProductPalindrome(){
		int palindrome=0, k=9;
		if(palindrome == 0){
			for(int i=1000*k + 999; i>1000*k + 1; i--){
				for(int j=1000*k + 999; j>i; j--){
					if(isPalindrome(i*j) && palindrome < i*j) palindrome = i*j;
				}
			}
			k--;
		}
		return palindrome;
	}
	public static void main(String[] args){
		
		System.out.println(threeDigitProductPalindrome());
		System.out.println(fourDigitProductPalindrome());
	}

}
