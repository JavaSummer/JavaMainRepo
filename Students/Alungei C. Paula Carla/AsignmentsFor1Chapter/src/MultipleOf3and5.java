import java.util.Scanner;

public class MultipleOf3and5 {
	public static void main(String args[]){
		Scanner variable = new Scanner(System.in);
		int b= variable.nextInt();
		multiple(b);
		variable.close();
	}
	
	public static void multiple(int a){
		int sum=0;
		for (int i=1; i<a; i++){
			if ((i%3==0) || (i%5==0)){
				sum=sum+i;
			}
			
		} System.out.print("suma este:"+sum);
	}
}
