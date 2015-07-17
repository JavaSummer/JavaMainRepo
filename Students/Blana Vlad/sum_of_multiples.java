package assignment1;
import java.util.Scanner;
public class sum_of_multiples {
	public static void main(String args[]){
		int n,sum,k1,k2,k3;
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		k1=(n-1)/3;
		k2=(n-1)/5;
		k3=(n-1)/15;
		sum=(3*k1*(k1+1)/2)+(5*k2*(k2+1)/2)-(15*k3*(k3+1)/2);
		System.out.println(sum);
	}
	

}
