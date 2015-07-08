public class Palindrome{
	public static void main(String[] args){
		int i, j, maxPal=0;
		for(i=100;i<=999;i++){
			for(j=i;j<=999;j++){
				if(isPal(i*j)&&(i*j>maxPal))maxPal=i*j;
			}
		}
		System.out.println("This is the palindrome: " + maxPal);
	}
	public static boolean isPal (int n){
		int nn=n, nnn=0;
		while( nn != 0){
			nnn = nnn*10+nn%10;
			nn /= 10;
		}
		if(nnn == n)return true;
		return false;
	}
}