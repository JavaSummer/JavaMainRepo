import java.util.Scanner;
public class Fibonacci {
	
	public static void main(String args[]){
		Scanner variable = new Scanner(System.in);
		long b= variable.nextInt();
		
		long c=0; //first element
		long g=1; //second element 
		long t;
		for (int i=1; i <b; i++){
			t= g+c;
			c=g;
			g=t;
			if ((g%2==0)&&(g<4000000)) System.out.print(g+" ");
		}
		
		variable.close();
	
	}	
}