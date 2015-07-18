import java.util.Scanner;
public class Twist2 {
	public static void main (String[] args){
		int nr=Integer.MAX_VALUE;
		int i;
		int s=0;
		for (i=2;i<nr-i;i++){
			if((i%3==0) || (i%5==0)){
				s=s+i;
		
			}
		}
		System.out.print("Max integer for overflow is " + i);
		long j,s2=0,nr2=Long.MAX_VALUE;
		for (j=2;j<nr2-j;j++){
			if((i%3==0) || (i%5==0))
				s2=s2+j;
	}
		System.out.println("Max long for overflow is " + j);
	}
}
