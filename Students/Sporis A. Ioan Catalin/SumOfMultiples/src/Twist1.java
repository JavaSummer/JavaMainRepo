import java.util.Scanner;
public class Twist1 {
	public static void main (String[] args){
		int i,s=0,nr;
		String nr1; 
		Scanner in = new Scanner (System.in);
		nr1 = in.nextLine();
		in.close();
		try{
			nr= Integer.parseInt(nr1);
			System.out.println("The limit number is " + nr);
			for(i=2;i<nr;i++){
				if((i%3==0) || (i%5==0))
					s=s+i;
			}
		}
		catch(NumberFormatException nx){
			System.out.println("Enter valid number ");
		}
		
		System.out.println("Sum is " + s);
			
	}

}
