
public class LargestPalindrome {
	public static void main(String[] args) {
		
		int max = 0, iFinal = 0, jFinal = 0;
		for(int i = 999; i>=100; i--) {
			for(int j = 999; j>=100; j--) {
				if (isPalindrome(i*j) && (i*j) > max) {
					max = i*j;
					iFinal = i;
					jFinal = j;
				}
			}
		}
		
		System.out.println("Biggest palindrome (3 digit numbers): " + max + " = " + iFinal + " * " + jFinal);
		
		max = 0;
		for(int i = 9999; i>=1000; i--) {
			for(int j = 9999; j>=1000; j--) {
				if (isPalindrome(i*j) && (i*j) > max) {
					max = i*j;
					iFinal = i;
					jFinal = j;
				}
			}
		}
		
		System.out.println("Biggest palindrome (4 digit numbers): " + max + " = " + iFinal + " * " + jFinal);	
	}
	
	public static boolean isPalindrome(int n) {
		int nReverse = 0, nOriginal = n;
		while (n > 0) {
			nReverse = 10 * nReverse + n % 10;
			n /= 10;
		}
		
		return (nOriginal == nReverse);
	}
}
