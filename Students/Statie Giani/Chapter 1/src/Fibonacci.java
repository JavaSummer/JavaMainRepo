import java.util.Scanner;

public class Fibonacci {
	public static void main(String args[]) {
		 System.out.println("Enter number upto which Fibonacci series to print: ");
	        int number = new Scanner(System.in).nextInt();
	        int Se=0, S=0;
	        for(int i=1; i<=number; i++){
	        	if(fibonacci(i)%2==0){
	        		Se+=fibonacci(i);
	        	}
	        	S+=fibonacci(i);
	        }
	            System.out.println("Even Sum:"+ Se);
	            System.out.println("Sum:"+ S);
}
	 
	 
	 public static int fibonacci(int number){
	        if(number <= 1){
	            return 1;
	        }
	        int fibo1=1, fibo2=2, fibonacci=1;
	        for(int i= 3; i<= number; i++){
	        	
	        	fibonacci = fibo1 + fibo2;             

	            fibo1 = fibo2;
	            fibo2 = fibonacci;
	        }
	        return fibonacci;
}
}