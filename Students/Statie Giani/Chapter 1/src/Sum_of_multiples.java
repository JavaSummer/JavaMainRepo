import java.util.Scanner;

public class Sum_of_multiples {
	public static void main(String args[]){
		int S1=0, intr=0;
		long S2=0, intrl=0;
		System.out.println("Enter number upto which Sum of multiples to print: ");
		int number = new Scanner(System.in).nextInt();
		for (int i=1;i<=number;i++){
			
			if (i%3==0 || i%5==0){
				intr=S1+i;
				intrl=S2+i;
			}
			
			if (intr==Integer.MAX_VALUE){
				System.out.println("Overflow int:"+ S1+i); break;
			}else{
				S1=intr;
			}
			if (intr==Long.MAX_VALUE){
				System.out.println("Overflow long:"+ S2+i); break;
			}else{
				S2=intrl;
			}
		}
		System.out.println(S2);
	}
}
